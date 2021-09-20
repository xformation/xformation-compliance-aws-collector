package com.synectiks.aws.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.synectiks.aws.entities.ec2.Converter;
import com.synectiks.aws.entities.ec2.InternetGateway;
import com.synectiks.aws.entities.ec2.VPNGateway;
import com.synectiks.aws.entities.ec2.VpcPeeringConnection;
import com.synectiks.aws.entities.ec2.XformEc2Instance;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.DescribeInstancesRequest;
import software.amazon.awssdk.services.ec2.model.DescribeInstancesResponse;
import software.amazon.awssdk.services.ec2.model.DescribeSubnetsResponse;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsRequest;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsResponse;
import software.amazon.awssdk.services.ec2.model.Ec2Exception;
import software.amazon.awssdk.services.ec2.model.Instance;
import software.amazon.awssdk.services.ec2.model.Reservation;
import software.amazon.awssdk.services.ec2.model.Subnet;
import software.amazon.awssdk.services.ec2.model.Tag;
import software.amazon.awssdk.services.ec2.model.Vpc;

public class XformEc2Processor extends XformAwsProcessor {

	private static final Logger logger = LoggerFactory.getLogger(XformEc2Processor.class);

	public XformEc2Processor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
	}

	@Override
	public List<Instance> getCloudObject() throws Exception {
		boolean done = false;
		Ec2Client ec2 = getEc2Client();
		String nextToken = null;
		List<Instance> instances = new ArrayList<Instance>();
		try {
			do {
				DescribeInstancesRequest request = DescribeInstancesRequest.builder().maxResults(6).nextToken(nextToken)
						.build();
				DescribeInstancesResponse response = ec2.describeInstances(request);
				for (Reservation reservation : response.reservations()) {
					for (Instance instance : reservation.instances()) {
						instances.add(instance);
					}
				}
				nextToken = response.nextToken();
			} while (nextToken != null);

		} catch (Ec2Exception e) {
			System.err.println(e.awsErrorDetails().errorMessage());
			System.exit(1);
		}
		ec2.close();
		return instances;
	}

	@Override
	public List<Vpc> getXformObject() throws Exception {
		List<Instance> instances = getCloudObject();
		List<com.synectiks.aws.entities.ec2.Vpc> xformVpcList = new ArrayList<>();
		for(Instance instance: instances) {
			Optional<String> imageId = instance.getValueForField("ImageId", String.class);
			Optional<String> instanceId = instance.getValueForField("InstanceId", String.class);
			Optional<String> instanceType = instance.getValueForField("InstanceType", String.class);
			Optional<String> kernelId = instance.getValueForField("KernelId", String.class);
			Optional<String> keyName = instance.getValueForField("KeyName", String.class);
			Optional<String> monitoring = instance.getValueForField("Monitoring", String.class);
			Optional<String> placement = instance.getValueForField("LaunchTime", String.class);
			Optional<String> launchTime = instance.getValueForField("LaunchTime", String.class);
			Optional<String> privateDnsName = instance.getValueForField("privateDnsName", String.class);
			Optional<String> privateIpAddress = instance.getValueForField("PrivateIpAddress", String.class);
			Optional<String> productCodes = instance.getValueForField("ProductCodes", String.class);
			Optional<String> publicDnsName = instance.getValueForField("publicDnsName", String.class);
			Optional<String> publicIpAddress = instance.getValueForField("PublicIpAddress", String.class);
			Optional<String> ramdiskId = instance.getValueForField("RamdiskId", String.class);
			Optional<String> state = instance.getValueForField("State", String.class);
			Optional<String> stateTransitionReason = instance.getValueForField("StateTransitionReason", String.class);
			Optional<String> subnetId = instance.getValueForField("SubnetId", String.class);
			Optional<String> vpcId = instance.getValueForField("vpcId", String.class);
			Optional<String> architecture = instance.getValueForField("Architecture", String.class);
			Optional<String> blockDeviceMappings = instance.getValueForField("BlockDeviceMappings", String.class);
			Optional<String> clientToken = instance.getValueForField("ClientToken", String.class);
			Optional<String> ebsOptimized = instance.getValueForField("ebsOptimized", String.class);
			Optional<String> enaSupport = instance.getValueForField("EnaSupport", String.class);
			Optional<String> hypervisor = instance.getValueForField("Hypervisor", String.class);
			Optional<String> iamInstanceProfile = instance.getValueForField("IamInstanceProfile", String.class);
			Optional<String> instanceLifecycle = instance.getValueForField("InstanceLifecycle", String.class);
			
			Optional<String> elasticGpuAssociations = instance.getValueForField("elasticGpuAssociations", String.class);
			Optional<String> elasticInferenceAcceleratorAssociations = instance.getValueForField("ElasticInferenceAcceleratorAssociations", String.class);
			Optional<String> networkInterfaces = instance.getValueForField("NetworkInterfaces", String.class);
			Optional<String> outpostArn = instance.getValueForField("OutpostArn", String.class);
			Optional<String> rootDeviceName = instance.getValueForField("RootDeviceName", String.class);
			Optional<String> rootDeviceType = instance.getValueForField("RootDeviceType", String.class);
			Optional<String> securityGroups = instance.getValueForField("SecurityGroups", String.class);
			Optional<String> sourceDestCheck = instance.getValueForField("SourceDestCheck", String.class);
			Optional<String> spotInstanceRequestId = instance.getValueForField("SpotInstanceRequestId", String.class);
			Optional<String> sriovNetSupport = instance.getValueForField("SriovNetSupport", String.class);
			Optional<String> stateReason = instance.getValueForField("stateReason", String.class);
			Optional<List> tags = instance.getValueForField("Tags", List.class);
			Optional<List> cpuOptions = instance.getValueForField("CpuOptions", List.class);
			Optional<String> capacityReservationId = instance.getValueForField("CapacityReservationId", String.class);
			Optional<String> capacityReservationSpecification = instance.getValueForField("CapacityReservationSpecification", String.class);
			Optional<List> HibernationOptions = instance.getValueForField("SriovNetSupport", List.class);
			Optional<List> licenses = instance.getValueForField("Licenses", List.class);
			Optional<String> capacityReservationSpecification = instance.getValueForField("CapacityReservationSpecification", String.class);
			Optional<List> HibernationOptions = instance.getValueForField("SriovNetSupport", List.class);
			
			
			Optional<List> cidrBlockAssociationSet = instance.getValueForField("CidrBlockAssociationSet", List.class);
			Optional<Boolean> isDefault = instance.getValueForField("IsDefault", Boolean.class);
			Optional<List> tags = instance.getValueForField("Tags", List.class);
			
			com.synectiks.aws.entities.ec2.XformEc2Instance xformEc2Instance = new com.synectiks.aws.entities.ec2.XformEc2Instance();
			xformEc2Instance.setAccountNumber(getAwsAccountNumber());
//			xformEc2Instance.setAutoScalingGroup(null);
			if(instanceId.isPresent()) {
				xformEc2Instance.setID(instanceId.get());
			}
			if(imageId.isPresent()) {
				// task find image detail by image id
//				xformEc2Instance.setImageDetails(null);
			}
			xformEc2Instance.setInboundRules(null);
			if(instanceType.isPresent()) {
				xformEc2Instance.setInstanceType(instanceType.get());
			}
//			xformEc2Instance.setIsPublic(null);
			
			
			
			xformEc2Instance.setIsRunning(instance.state().toString());
			xformEc2Instance.setKernelID(null);
			xformEc2Instance.setLaunchTime(null);
			xformEc2Instance.setName(null);
			xformEc2Instance.setNics(null);
			xformEc2Instance.setOutboundRules(null);
			xformEc2Instance.setPlatform(instance.platformAsString());
			xformEc2Instance.setPrivateDNS(instance.privateDnsName());
//			customInstance.setProfileArn(instance.iamInstanceProfile().arn());
			xformEc2Instance.setPublicDNS(instance.publicDnsName());
			xformEc2Instance.setRegion(null);
			xformEc2Instance.setRoles(null);
			xformEc2Instance.setScanners(null);
			xformEc2Instance.setSsmAgentInstanceInformation(null);
//			xformEc2Instance.setTags(getCustomTagList(instance.tags()));
			xformEc2Instance.setType(null);
			xformEc2Instance.setVolumes(null);
			if(cidrBlock.isPresent()) {
				xformVpc.setCIDR(cidrBlock.get());
			}
//			xformVpc.setSubnets(getXformSubnet(vpc));
			if(dhcpOptionsId.isPresent()) {
				xformVpc.setDHCPOptionsID(dhcpOptionsId.get());
			}
			if(instanceTenancy.isPresent()) {
				xformVpc.setInstanceTenancy(instanceTenancy.get());
			}
			if(isDefault.isPresent()) {
				xformVpc.setIsDefault(isDefault.get());
			}
			if(state.isPresent()) {
				xformVpc.setState(state.get());
			}
//			xformVpc.setVPNGateways();
//			xformVpc.setInternetGateways();
//			xformVpc.setTransitGateways();
//			xformVpc.setRouteTables();
//			xformVpc.setVpcPeeringConnections();
//			xformVpc.setHasFlowLogs();
//			xformVpc.setFlowLogs();
//			xformVpc.setVpc(getXformVpc(vpc));
			if(tags.isPresent()) {
				xformVpc.setTags(getXformTagList(tags.get()));
			}
			
			if(vpcId.isPresent()) {
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
	
	private List<com.synectiks.aws.entities.ec2.Subnet> getXformSubnet(Vpc vpc) {
		List<Subnet> awsSubnetList = getAwsSubnetByVpcId(vpc.vpcId());
		List<com.synectiks.aws.entities.ec2.Subnet> xformSubnetList = new ArrayList<>();
			for (Subnet subnet : awsSubnetList) {
				com.synectiks.aws.entities.ec2.Subnet xformSubnet = new com.synectiks.aws.entities.ec2.Subnet();
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

	private com.synectiks.aws.entities.ec2.Vpc getXformVpc(Vpc vpc) {
		com.synectiks.aws.entities.ec2.Vpc xfVpc = new com.synectiks.aws.entities.ec2.Vpc();
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
	
//	public List<Subnet> describeSubnetByVpcId(String vpcId) {
//		Ec2Client ec2 = getEc2Client();
//		List<Subnet> subnetList = new ArrayList<>();
//		DescribeSubnetsResponse describeSubnetsResponse = ec2.describeSubnets();
//		List<Subnet> subnets = describeSubnetsResponse.subnets();
//		for (Subnet subnet : subnetList) {
//			if(subnet.vpcId().equalsIgnoreCase(vpcId)) {
//				
//			}
//		}
////		DescribeVpcsRequest request = DescribeVpcsRequest.builder().vpcIds(vpcId).build();
////		DescribeSubnetsRequest request=DescribeSubnetsRequest.builder().filters(null)
////		DescribeSubnetsResponse describeSubnetsResponse=ec2.describeSubnets(request);
//		return customSubnets;
//	}

	public List<Subnet> getAwsSubnetByVpcId(String vpcId) {
		Ec2Client ec2 = getEc2Client();
		List<Subnet> listSubnets = new ArrayList<>();
		try {
			DescribeSubnetsResponse describeSubnetsResponse = ec2.describeSubnets();
			List<Subnet> listAllSubnets = describeSubnetsResponse.subnets();
			for (Subnet subnet : listAllSubnets) {
				if(subnet.vpcId().equals(vpcId)) {
					listSubnets.add(subnet);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			logger.error("Exception in getAwsSubnetByVpcId: ", e);
		}finally {
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
			logger.error("Exception in getAwsVpcById: ",e);
		} finally {
			closeEc2Client(ec2);
		}
		return response.vpcs();
	}

	public List<XformVpc> getXformObjectById(String vpcId) throws Exception {
		List<Vpc> vpcList = getAwsVpcById(vpcId);
		List<XformVpc> xformVpcList = new ArrayList<>();
		for(Vpc vpc: vpcList) {
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
			if(cidrBlock.isPresent()) {
				xformVpc.setCIDR(cidrBlock.get());
			}
			xformVpc.setSubnets(getXformSubnet(vpc));
			if(dhcpOptionsId.isPresent()) {
				xformVpc.setDHCPOptionsID(dhcpOptionsId.get());
			}
			if(instanceTenancy.isPresent()) {
				xformVpc.setInstanceTenancy(instanceTenancy.get());
			}
			if(isDefault.isPresent()) {
				xformVpc.setIsDefault(isDefault.get());
			}
			if(state.isPresent()) {
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
			if(tags.isPresent()) {
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
	
//	public List<CustomVpc> describeEC2Vpcs() {
//		Ec2Client ec2 = getEC2Client();
//		List<CustomVpc> customVpcs = null;
//		try {
//			DescribeVpcsRequest request = DescribeVpcsRequest.builder().build();
//			DescribeVpcsResponse response = ec2.describeVpcs(request);
//			customVpcs = getAllCustomVpc(response.vpcs());
//		} catch (Ec2Exception e) {
//			System.err.println(e.awsErrorDetails().errorMessage());
//		} finally {
//			if (ec2 != null) {
//				ec2.close();
//			}
//		}
//		return customVpcs;
//	}

//	public List<CustomVpc> getAllCustomVpc(List<Vpc> listVps) {
//		List<CustomVpc> listCustomVpcs = new ArrayList<CustomVpc>();
//		for (Vpc vpc : listVps) {
//			CustomVpc customVpc = populateVpc(vpc);
//			listCustomVpcs.add(customVpc);
//		}
//		return listCustomVpcs;
//	}

//	public CustomVpc populateVpc(Vpc vpc) {
//
//		CustomVpc customVpc = new CustomVpc();
//		customVpc.setCloudAccountID(null);
//		customVpc.setCIDR(vpc.cidrBlock());
//		customVpc.setRegion(null);
//		customVpc.setID(vpc.vpcId());
//		customVpc.setAccountNumber(null);
//		customVpc.setVPNGateways(null);
//		customVpc.setInternetGateways(null);
//		customVpc.setDHCPOptionsID(vpc.dhcpOptionsId());
//		customVpc.setInstanceTenancy(vpc.instanceTenancyAsString());
//		customVpc.setIsDefault(vpc.isDefault().toString());
//		customVpc.setState(vpc.stateAsString());
//		customVpc.setTags(getXformTagList(vpc.tags()));
//		customVpc.setName(null);
//		customVpc.setVpcPeeringConnections(null);
//		customVpc.setSource(null);
//		customVpc.setOwnerID(vpc.ownerId());
//		return customVpc;
//	}

	public List<com.synectiks.aws.entities.ec2.Tag> getXformTagList(List tags) {
		List<com.synectiks.aws.entities.ec2.Tag> listTag = new ArrayList<>();
		for (Object obj : tags) {
			Tag tag = (Tag)obj;
			com.synectiks.aws.entities.ec2.Tag xformTag = new com.synectiks.aws.entities.ec2.Tag();
			xformTag.setKey(tag.key());
			xformTag.setValue(tag.value());
			listTag.add(xformTag);
		}
		return listTag;
	}

	
}
