package com.synectiks.aws.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synectiks.aws.entities.vpc.XformVpc;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.DescribeSubnetsResponse;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsRequest;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsResponse;
import software.amazon.awssdk.services.ec2.model.Subnet;
import software.amazon.awssdk.services.ec2.model.Tag;
import software.amazon.awssdk.services.ec2.model.Vpc;

public class XformVpcProcessor extends XformAwsProcessor {

	private static final Logger logger = LoggerFactory.getLogger(XformVpcProcessor.class);

	public XformVpcProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
	}

	@Override
	public List<Vpc> getCloudObject() throws Exception {
		Ec2Client ec2 = getEc2Client();
		DescribeVpcsRequest request = null;
		DescribeVpcsResponse response = null;
		try {
			request = DescribeVpcsRequest.builder().build();
			response = ec2.describeVpcs(request);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in getCloudObject: ", e);
		} finally {
			closeEc2Client(ec2);
		}
		return response.vpcs();
	}

	@Override
	public List<XformVpc> getXformObject() throws Exception {
		List<Vpc> vpcList = getCloudObject();
		List<XformVpc> xformVpcList = new ArrayList<>();
		for (Vpc vpc : vpcList) {
			Optional<String> cidrBlock = vpc.getValueForField("CidrBlock", String.class);
			Optional<String> dhcpOptionsId = vpc.getValueForField("DhcpOptionsId", String.class);
			Optional<String> state = vpc.getValueForField("State", String.class);
			Optional<String> vpcId = vpc.getValueForField("VpcId", String.class);
			Optional<String> ownerId = vpc.getValueForField("OwnerId", String.class);
			Optional<String> instanceTenancy = vpc.getValueForField("InstanceTenancy", String.class);
			Optional<List> ipv6CidrBlockAssociationSet = vpc.getValueForField("Ipv6CidrBlockAssociationSet", List.class);
			Optional<List> cidrBlockAssociationSet = vpc.getValueForField("CidrBlockAssociationSet", List.class);
			Optional<Boolean> isDefault = vpc.getValueForField("IsDefault", Boolean.class);
			Optional<List> tags = vpc.getValueForField("Tags", List.class);

			XformVpc xformVpc = new XformVpc();
			if (cidrBlock.isPresent()) {
				xformVpc.setCIDR(cidrBlock.get());
			}
			xformVpc.setSubnets(getXformSubnetByVpc(vpc));
			if (dhcpOptionsId.isPresent()) {
				xformVpc.setDHCPOptionsID(dhcpOptionsId.get());
			}
			if (instanceTenancy.isPresent()) {
				xformVpc.setInstanceTenancy(instanceTenancy.get());
			}
			if (isDefault.isPresent()) {
				xformVpc.setIsDefault(isDefault.get());
			}
			if (state.isPresent()) {
				xformVpc.setState(state.get());
			}
//			xformVpc.setVPNGateways();
//			xformVpc.setInternetGateways();
//			xformVpc.setTransitGateways();
//			xformVpc.setRouteTables();
//			xformVpc.setVpcPeeringConnections();
//			xformVpc.setHasFlowLogs();
//			xformVpc.setFlowLogs();
			xformVpc.setVpc(getXformVpc(vpc));
			if (tags.isPresent()) {
				xformVpc.setTags(getXformTagList(tags.get()));
			}

			if (vpcId.isPresent()) {
				xformVpc.setID(vpcId.get());
			}
//			xformVpc.setType();
//			xformVpc.setName();
			xformVpc.setAccountNumber(getAwsAccountNumber());
			xformVpc.setRegion(getRegionAsText());
//			xformVpc.setExternalFindings();
			xformVpcList.add(xformVpc);
		}
		return xformVpcList;
	}

//	public List<com.synectiks.aws.entities.vpc.Subnet> getXformSubnetByVpcId(String vpcId){
//		
//		return null;
//	}
	public List<com.synectiks.aws.entities.vpc.Subnet> getAllXfromSubnets() throws Exception {
		List<Vpc> vpcList = getCloudObject();
		List<com.synectiks.aws.entities.vpc.Subnet> xformSubnetList = new ArrayList<>();
		for (Vpc vpc : vpcList) {
			List<com.synectiks.aws.entities.vpc.Subnet> xformSubnets = getXformSubnetByVpc(vpc);
			xformSubnetList.addAll(xformSubnets);
		}
		return xformSubnetList;
	}

	public List<com.synectiks.aws.entities.vpc.Subnet> getXformSubnetByVpc(Vpc vpc) {
		List<Subnet> awsSubnetList = getAwsSubnetByVpcId(vpc.vpcId());
		List<com.synectiks.aws.entities.vpc.Subnet> xformSubnetList = new ArrayList<>();
		for (Subnet subnet : awsSubnetList) {
			com.synectiks.aws.entities.vpc.Subnet xformSubnet = new com.synectiks.aws.entities.vpc.Subnet();
			xformSubnet.setVpc(getXformVpc(vpc));
			xformSubnet.setState(subnet.stateAsString());
			xformSubnet.setAvailabilityZone(xformSubnet.getAvailabilityZone());
			xformSubnet.setDefaultForAz(subnet.defaultForAz());
			xformSubnet.setMapPublicIPOnLaunch(subnet.mapPublicIpOnLaunch());
			xformSubnet.setAvailableIPAddressCount(subnet.availableIpAddressCount());
//				xformSubnet.setExternalID();
//				xformSubnet.setDescription();
			xformSubnet.setCIDR(subnet.cidrBlock());
//				xformSubnet.setRouteTable();
			xformSubnet.setOwnerID(subnet.ownerId());
//				xformSubnet.setNacl();
			xformSubnet.setTags(getXformTagList(vpc.tags()));
			xformSubnet.setID(subnet.subnetId());
//				xformSubnet.setType();
//				xformSubnet.setName();
			xformSubnet.setAccountNumber(getAwsAccountNumber());
			xformSubnet.setRegion(getRegionAsText());
//				xformSubnet.setExternalFindings();
			xformSubnetList.add(xformSubnet);
		}
		return xformSubnetList;
	}

	public com.synectiks.aws.entities.vpc.Vpc getXformVpc(Vpc vpc) {
		com.synectiks.aws.entities.vpc.Vpc xfVpc = new com.synectiks.aws.entities.vpc.Vpc();
//		xfVpc.setCloudAccountID(vpc.);
		xfVpc.setCIDR(vpc.cidrBlock());
		xfVpc.setRegion(getRegionAsText());
		xfVpc.setID(vpc.vpcId());
		xfVpc.setAccountNumber(getAwsAccountNumber());
//	    private VPNGateway[] vpnGateways;
//	    private InternetGateway[] internetGateways;
		xfVpc.setDHCPOptionsID(vpc.dhcpOptionsId());
		xfVpc.setInstanceTenancy(vpc.instanceTenancyAsString());
		xfVpc.setIsDefault(vpc.isDefault());
		xfVpc.setState(vpc.stateAsString());
		xfVpc.setTags(getXformTagList(vpc.tags()));
//	    private String name;
//	    private VpcPeeringConnection[] vpcPeeringConnections; 
//	    xfVpc.setSource();;
		xfVpc.setOwnerID(vpc.ownerId());
		return xfVpc;
	}

	public List<Subnet> getAwsSubnetByVpcId(String vpcId) {
		Ec2Client ec2 = getEc2Client();
		List<Subnet> listSubnets = new ArrayList<>();
		try {
			DescribeSubnetsResponse describeSubnetsResponse = ec2.describeSubnets();
			List<Subnet> listAllSubnets = describeSubnetsResponse.subnets();
			for (Subnet subnet : listAllSubnets) {
				if (subnet.vpcId().equals(vpcId)) {
					listSubnets.add(subnet);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in getAwsSubnetByVpcId: ", e);
		} finally {
			closeEc2Client(ec2);
		}
		return listSubnets;
	}

	public List<Vpc> getAwsVpcById(String vpcId) {
		Ec2Client ec2 = getEc2Client();
		DescribeVpcsRequest request = null;
		DescribeVpcsResponse response = null;
		try {
			request = DescribeVpcsRequest.builder().vpcIds(vpcId).build();
			response = ec2.describeVpcs(request);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in getAwsVpcById: ", e);
		} finally {
			closeEc2Client(ec2);
		}
		return response.vpcs();
	}

	@Override
	public List<XformVpc> getXformObjectById(String vpcId) throws Exception {
		List<Vpc> vpcList = getAwsVpcById(vpcId);
		List<XformVpc> xformVpcList = new ArrayList<>();
		for (Vpc vpc : vpcList) {
			Optional<String> cidrBlock = vpc.getValueForField("CidrBlock", String.class);
			Optional<String> dhcpOptionsId = vpc.getValueForField("DhcpOptionsId", String.class);
			Optional<String> state = vpc.getValueForField("State", String.class);
//			Optional<String> vpcId = vpc.getValueForField("VpcId", String.class);
			Optional<String> ownerId = vpc.getValueForField("OwnerId", String.class);
			Optional<String> instanceTenancy = vpc.getValueForField("InstanceTenancy", String.class);
			Optional<List> ipv6CidrBlockAssociationSet = vpc.getValueForField("Ipv6CidrBlockAssociationSet", List.class);
			Optional<List> cidrBlockAssociationSet = vpc.getValueForField("CidrBlockAssociationSet", List.class);
			Optional<Boolean> isDefault = vpc.getValueForField("IsDefault", Boolean.class);
			Optional<List> tags = vpc.getValueForField("Tags", List.class);

			XformVpc xformVpc = new XformVpc();
			if (cidrBlock.isPresent()) {
				xformVpc.setCIDR(cidrBlock.get());
			}
			xformVpc.setSubnets(getXformSubnetByVpc(vpc));
			if (dhcpOptionsId.isPresent()) {
				xformVpc.setDHCPOptionsID(dhcpOptionsId.get());
			}
			if (instanceTenancy.isPresent()) {
				xformVpc.setInstanceTenancy(instanceTenancy.get());
			}
			if (isDefault.isPresent()) {
				xformVpc.setIsDefault(isDefault.get());
			}
			if (state.isPresent()) {
				xformVpc.setState(state.get());
			}
//			xformVpc.setVPNGateways();
//			xformVpc.setInternetGateways();
//			xformVpc.setTransitGateways();
//			xformVpc.setRouteTables();
//			xformVpc.setVpcPeeringConnections();
//			xformVpc.setHasFlowLogs();
//			xformVpc.setFlowLogs();
			xformVpc.setVpc(getXformVpc(vpc));
			if (tags.isPresent()) {
				xformVpc.setTags(getXformTagList(tags.get()));
			}

			xformVpc.setID(vpcId);

//			xformVpc.setType();
//			xformVpc.setName();
			xformVpc.setAccountNumber(getAwsAccountNumber());
			xformVpc.setRegion(getRegionAsText());
//			xformVpc.setExternalFindings();
			xformVpcList.add(xformVpc);
		}
		return xformVpcList;
	}

	public List<com.synectiks.aws.entities.common.Tag> getXformTagList(List tags) {
		List<com.synectiks.aws.entities.common.Tag> listTag = new ArrayList<>();
		for (Object obj : tags) {
			Tag tag = (Tag) obj;
			com.synectiks.aws.entities.common.Tag xformTag = new com.synectiks.aws.entities.common.Tag();
			xformTag.setKey(tag.key());
			xformTag.setValue(tag.value());
			listTag.add(xformTag);
		}
		return listTag;
	}

}
