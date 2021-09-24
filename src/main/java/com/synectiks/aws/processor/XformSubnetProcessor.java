package com.synectiks.aws.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synectiks.aws.entities.subnet.InternetGateway;
import com.synectiks.aws.entities.subnet.VPNGateway;
import com.synectiks.aws.entities.subnet.Vpc;
import com.synectiks.aws.entities.subnet.VpcPeeringConnection;
import com.synectiks.aws.entities.subnet.XformSubnet;
import com.synectiks.aws.entities.vpc.XformVpc;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.DescribeSubnetsRequest;
import software.amazon.awssdk.services.ec2.model.DescribeSubnetsResponse;
import software.amazon.awssdk.services.ec2.model.Subnet;
//import software.amazon.awssdk.services.ec2.model.Vpc;
import software.amazon.awssdk.services.ec2.model.Tag;

public class XformSubnetProcessor extends XformAwsProcessor {

	private static final Logger logger = LoggerFactory.getLogger(XformSubnetProcessor.class);

	public XformSubnetProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
	}

	@Override
	public List<Subnet> getCloudObject() {
		Ec2Client ec2 = getEc2Client();
		List<Subnet> listSubnets = null;
		try {
			DescribeSubnetsResponse describeSubnetsResponse = ec2.describeSubnets();
			listSubnets = describeSubnetsResponse.subnets();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in getCloudObject: ", e);
		} finally {
			closeEc2Client(ec2);
		}
		return listSubnets;
	}
	
	@Override
	public List<XformSubnet> getXformObject() {
		List<Subnet> awsSubnetList = getCloudObject();
		List<XformSubnet> xformSubnetList = new ArrayList<>();
		XformVpcProcessor vpcProcessor = new XformVpcProcessor(getAccessKey(), getSecretKey(), getRegionAsText());
		for (Subnet subnet : awsSubnetList) {
			createXformSubnet(xformSubnetList, vpcProcessor, subnet);
		}
		return xformSubnetList;
	}

	private void createXformSubnet(List<XformSubnet> xformSubnetList, XformVpcProcessor vpcProcessor, Subnet subnet) {
		Optional<String> availabilityZone = subnet.getValueForField("AvailabilityZone", String.class);
		Optional<String> availabilityZoneId = subnet.getValueForField("AvailabilityZoneId", String.class);
		Optional<Integer>  availableIpAddressCount = subnet.getValueForField("AvailableIpAddressCount", Integer.class);
		Optional<String> cidrBlock = subnet.getValueForField("CidrBlock", String.class);
		Optional<Boolean>  defaultForAz = subnet.getValueForField("DefaultForAz", Boolean.class);
		Optional<Boolean>  mapPublicIpOnLaunch = subnet.getValueForField("MapPublicIpOnLaunch", Boolean.class);
		Optional<Boolean>  mapCustomerOwnedIpOnLaunch = subnet.getValueForField("MapCustomerOwnedIpOnLaunch", Boolean.class);
		Optional<String> customerOwnedIpv4Pool = subnet.getValueForField("CustomerOwnedIpv4Pool", String.class);
		Optional<String> subnetId = subnet.getValueForField("SubnetId", String.class);
		Optional<String> vpcId = subnet.getValueForField("VpcId", String.class);
		Optional<String> ownerId = subnet.getValueForField("OwnerId", String.class);
		Optional<Boolean>  assignIpv6AddressOnCreation = subnet.getValueForField("AssignIpv6AddressOnCreation", Boolean.class);
		Optional<List> ipv6CidrBlockAssociationSet = subnet.getValueForField("Ipv6CidrBlockAssociationSet", List.class);
		Optional<List> tags = subnet.getValueForField("Tags", List.class);
		Optional<String> subnetArn = subnet.getValueForField("SubnetArn", String.class);
		Optional<String> outpostArn = subnet.getValueForField("OutpostArn", String.class);
		
		XformSubnet obj = new XformSubnet();
		
		if(availabilityZone.isPresent()) {
			obj.setAvailabilityZone(availabilityZone.get());
		}
		if(availabilityZoneId.isPresent()) {
			obj.setAvailabilityZoneId(availabilityZoneId.get());
		}
		if(availableIpAddressCount.isPresent()) {
			obj.setAvailableIpAddressCount(availableIpAddressCount.get());
		}
		if(cidrBlock.isPresent()) {
			obj.setCidr(cidrBlock.get());
			obj.setCidrBlock(cidrBlock.get());
		}
		if(defaultForAz.isPresent()) {
			obj.setDefaultForAz(defaultForAz.get());
		}
		if(mapPublicIpOnLaunch.isPresent()) {
			obj.setMapPublicIpOnLaunch(mapPublicIpOnLaunch.get());
		}
		if(mapCustomerOwnedIpOnLaunch.isPresent()) {
			obj.setMapCustomerOwnedIpOnLaunch(mapCustomerOwnedIpOnLaunch.get());
		}
		if(customerOwnedIpv4Pool.isPresent()) {
			obj.setCustomerOwnedIpv4Pool(customerOwnedIpv4Pool.get());
		}
		if(subnetId.isPresent()) {
			obj.setId(subnetId.get());
			obj.setSubnetId(subnetId.get());
		}
		try {
			if(vpcId.isPresent()) {
				obj.setVpcId(vpcId.get());
				List<XformVpc> vpcList = vpcProcessor.getXformObjectById(vpcId.get());
				if(vpcList.size() > 0) {
					XformVpc xformVpc = vpcList.get(0);
					Vpc subnetVpc = new Vpc();
					subnetVpc.setAccountNumber(getAwsAccountNumber());
					subnetVpc.setCIDR(obj.getCidr());
					subnetVpc.setDHCPOptionsID(xformVpc.getDHCPOptionsID());
					subnetVpc.setID(vpcId.get());
					subnetVpc.setInstanceTenancy(xformVpc.getInstanceTenancy());
//						subnetVpc.setInternetGateways(xformVpc.getInternetGateways());
					subnetVpc.setIsDefault(xformVpc.getIsDefault());
					subnetVpc.setName(xformVpc.getName());
					if(ownerId.isPresent()) {
						subnetVpc.setOwnerID(ownerId.get());
					}
					subnetVpc.setRegion(getRegionAsText());
//					subnetVpc.setSource(xformVpc.getS);
					subnetVpc.setState(xformVpc.getState());
					subnetVpc.setTags(xformVpc.getTags());
//					subnetVpc.setVPNGateways(xformVpc.getVPNGateways());
//					subnetVpc.setVpcPeeringConnections(xformVpc.getVpcPeeringConnections());
					
					obj.setVpc(subnetVpc);
				}
			}
		}catch(Exception e) {
			logger.warn("Exception in geting vpc details for subnet. Exception: "+e.getMessage());
		}
		if(ownerId.isPresent()) {
			obj.setOwnerId(ownerId.get());
		}
		if(assignIpv6AddressOnCreation.isPresent()) {
			obj.setAssignIpv6AddressOnCreation(assignIpv6AddressOnCreation.get());
		}
		if(ipv6CidrBlockAssociationSet.isPresent()) {
			obj.setIpv6CidrBlockAssociationSet(ipv6CidrBlockAssociationSet.get());
		}
		if(tags.isPresent()) {
			obj.setTags(getXformTagList(tags.get()));
		}
		if(subnetArn.isPresent()) {
			obj.setSubnetArn(subnetArn.get());
		}
		if(outpostArn.isPresent()) {
			obj.setOutpostArn(outpostArn.get());
		}
		obj.setState(subnet.stateAsString());
		obj.setAccountNumber(getAwsAccountNumber());
		obj.setRegion(getRegionAsText());
		
		obj.setTags(null);
		xformSubnetList.add(obj);
	}
	
	public List<Subnet> getCloudObjectBySubnetId(String subnetId) {
		Ec2Client ec2 = getEc2Client();
		List<Subnet> listSubnets = null;
		try {
			DescribeSubnetsRequest request = DescribeSubnetsRequest.builder().subnetIds(subnetId).build();
			DescribeSubnetsResponse describeSubnetsResponse = ec2.describeSubnets(request);
			listSubnets = describeSubnetsResponse.subnets();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in getCloudObject: ", e);
		} finally {
			closeEc2Client(ec2);
		}
		return listSubnets;
	}
	
	@Override
	public List<XformSubnet> getXformObjectById(String subnetId) {
		List<Subnet> awsSubnetList = getCloudObjectBySubnetId(subnetId);
		List<XformSubnet> xformSubnetList = new ArrayList<>();
		XformVpcProcessor vpcProcessor = new XformVpcProcessor(getAccessKey(), getSecretKey(), getRegionAsText());
		for (Subnet subnet : awsSubnetList) {
			createXformSubnet(xformSubnetList, vpcProcessor, subnet);
		}
		return xformSubnetList;
	}

	private List<com.synectiks.aws.entities.common.Tag> getXformTagList(List tags) {
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
