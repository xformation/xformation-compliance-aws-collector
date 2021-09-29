package com.synectiks.aws.processor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synectiks.aws.entities.vpc.XformVpc;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsRequest;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsResponse;
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
		XformSubnetProcessor subnetProcessor = new XformSubnetProcessor(getAccessKey(), getSecretKey(), getRegionAsText());
		XformEksClusterProcessor clusterProcessor = new XformEksClusterProcessor(getAccessKey(), getSecretKey(), getRegionAsText());
		
		for (Vpc vpc : vpcList) {
			createXformVpc(xformVpcList, vpc, subnetProcessor, clusterProcessor);
		}
		return xformVpcList;
	}

	private void createXformVpc(List<XformVpc> xformVpcList, Vpc vpc, XformSubnetProcessor subnetProcessor, XformEksClusterProcessor clusterProcessor) throws IOException {
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
		
		xformVpc.setSubnets(subnetProcessor.getSubnetByVpcId(vpc.vpcId()));
		xformVpc.setCluster(clusterProcessor.getClusterByVpcId(vpc.vpcId()));
		
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
		xformVpc.setVpc(convertAwsVpcIntoXformVpc(vpc));
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

	public com.synectiks.aws.entities.vpc.Vpc convertAwsVpcIntoXformVpc(Vpc vpc) {
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

	public List<Vpc> getCloudObjectById(String vpcId) {
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
		List<Vpc> vpcList = getCloudObjectById(vpcId);
		List<XformVpc> xformVpcList = new ArrayList<>();
		XformSubnetProcessor subnetProcessor = new XformSubnetProcessor(getAccessKey(), getSecretKey(), getRegionAsText());
		XformEksClusterProcessor clusterProcessor = new XformEksClusterProcessor(getAccessKey(), getSecretKey(), getRegionAsText());
		for (Vpc vpc : vpcList) {
			createXformVpc(xformVpcList, vpc, subnetProcessor, clusterProcessor);
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
