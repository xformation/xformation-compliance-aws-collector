package com.synectiks.aws.ec2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.synectiks.aws.config.Constants;
//import com.synectiks.aws.entities.vpc.CustomVpc;
//import com.synectiks.aws.entities.vpc.CustomVpc;
//import com.synectiks.aws.entities.vpc.CustomTag;
import com.synectiks.aws.entities.ec2.CustomInstance;
import com.synectiks.aws.entities.ec2.CustomTag;
import com.synectiks.aws.entities.ec2.CustomVpc;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.DescribeInstancesRequest;
import software.amazon.awssdk.services.ec2.model.DescribeInstancesResponse;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsRequest;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsResponse;
import software.amazon.awssdk.services.ec2.model.Instance;
import software.amazon.awssdk.services.ec2.model.InstanceAttributeName;
import software.amazon.awssdk.services.ec2.model.Reservation;
import software.amazon.awssdk.services.ec2.model.Tag;
import software.amazon.awssdk.services.ec2.model.Vpc;
import software.amazon.awssdk.services.ec2.model.Ec2Exception;

public class DescribeInstances {
	private Region region;
	private AwsCredentialsProvider asAwsCredentialsProvider;

	public DescribeInstances() {
	}

	public DescribeInstances(Region reg, AwsCredentialsProvider asAwsCredentialsProvider) {
		this.asAwsCredentialsProvider = asAwsCredentialsProvider;
	}

	public DescribeInstances(Region region) {
		this.region = region;

	}

	public Ec2Client getEC2Client() {
		Region rg = null;
		if (region != null) {
			rg = region;
		} else {
			System.out.println("Default region is: " + Constants.DEFAULT_REGION.toString());
			rg = Constants.DEFAULT_REGION;
		}
		Ec2Client ec2 = null;
		ec2 = Ec2Client.builder().credentialsProvider(asAwsCredentialsProvider).region(rg).build();
		return ec2;
	}

	public CustomVpc describeEC2VpcById(String vpcId) throws IOException {
		Ec2Client ec2 = getEC2Client();
		CustomVpc customVpc = new CustomVpc();
		try {
			DescribeVpcsRequest request = DescribeVpcsRequest.builder().vpcIds(vpcId).build();
			DescribeVpcsResponse response = ec2.describeVpcs(request);
			customVpc = populateCustomVpc(response.vpcs().get(0));
		} catch (Ec2Exception e) {
			System.err.println(e.awsErrorDetails().errorMessage());
		} finally {
			if (ec2 != null) {
				ec2.close();
			}
		}
		return customVpc;
	}

	public CustomVpc populateCustomVpc(Vpc vpc) throws IOException {

		CustomVpc customVpc = new CustomVpc();
		customVpc.setCloudAccountID(null);
		customVpc.setCIDR(vpc.cidrBlock());
		customVpc.setRegion(null);
		customVpc.setID(vpc.vpcId());
		customVpc.setAccountNumber(null);
		customVpc.setVPNGateways(null);
		customVpc.setInternetGateways(null);
		customVpc.setDHCPOptionsID(vpc.dhcpOptionsId());
		customVpc.setInstanceTenancy(vpc.instanceTenancyAsString());
		customVpc.setIsDefault(vpc.isDefault().toString());
		customVpc.setState(vpc.stateAsString());
		customVpc.setTags(getCustomTagList(vpc.tags()));
		customVpc.setName(null);
		customVpc.setVpcPeeringConnections(null);
		customVpc.setSource(null);
		customVpc.setOwnerID(vpc.ownerId());
		return customVpc;
	}

	public List<CustomTag> getCustomTagList(List<Tag> tags) throws IOException {
		List<CustomTag> customTags = new ArrayList<>();
		for (Tag tag : tags) {
			CustomTag customTag = new CustomTag();
			customTag.setKey(tag.key().toString());
			customTag.setValue(tag.value());
			customTags.add(customTag);
		}
		return customTags;
	}

	public void describeEC2Instances() throws IOException {
		boolean done = false;
		Ec2Client ec2 = getEC2Client();
		String nextToken = null;
		List<CustomInstance> customInstances = new ArrayList<CustomInstance>();
		try {
			do {
				DescribeInstancesRequest request = DescribeInstancesRequest.builder().maxResults(6).nextToken(nextToken)
						.build();
				DescribeInstancesResponse response = ec2.describeInstances(request);
				for (Reservation reservation : response.reservations()) {
					for (Instance instance : reservation.instances()) {
						CustomInstance customInstance = new CustomInstance();
//						System.out.println("Image id is " + instance.imageId());
//						System.out.println("Instance type is " + instance.instanceType());
//						System.out.println("Instance state name is " + instance.state().name());
//						System.out.println("monitoring information is " + instance.monitoring().state());
//						customInstance.setImage(instance.imageId().toString());
						customInstance.setAccountNumber(null);
						customInstance.setAutoScalingGroup(null);
						customInstance.setDome9ID(null);
						customInstance.setID(instance.instanceId());
						customInstance.setImageDetails(null);
						customInstance.setInboundRules(null);
						customInstance.setInstanceType(instance.instanceTypeAsString());
						customInstance.setIsPublic(null);
						customInstance.setIsRunning(instance.state().toString());
						customInstance.setKernelID(null);
						customInstance.setLaunchTime(null);
						customInstance.setName(null);
						customInstance.setNics(null);
						customInstance.setOutboundRules(null);
						customInstance.setPlatform(instance.platformAsString());
						customInstance.setPrivateDNS(instance.privateDnsName());
//						customInstance.setProfileArn(instance.iamInstanceProfile().arn());
						customInstance.setPublicDNS(instance.publicDnsName());
						customInstance.setRegion(null);
						customInstance.setRoles(null);
						customInstance.setScanners(null);
						customInstance.setSsmAgentInstanceInformation(null);
						customInstance.setTags(getCustomTagList(instance.tags()));
						customInstance.setType(null);
						customInstance.setVolumes(null);
						if (instance.vpcId() != null) {
							customInstance.setVpc(describeEC2VpcById(instance.vpcId()));
						}
						customInstances.add(customInstance);
					}
				}
				nextToken = response.nextToken();
			} while (nextToken != null);

		} catch (Ec2Exception e) {
			System.err.println(e.awsErrorDetails().errorMessage());
			System.exit(1);
		}
		System.out.println(customInstances);
		ec2.close();
	}

}
