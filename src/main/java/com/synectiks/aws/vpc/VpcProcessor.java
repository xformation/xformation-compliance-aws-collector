package com.synectiks.aws.vpc;

import java.util.ArrayList;
import java.util.List;

import com.synectiks.aws.config.Constants;
import com.synectiks.aws.entities.vpc.CustomTag;
import com.synectiks.aws.entities.vpc.CustomVpc;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsRequest;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsResponse;
import software.amazon.awssdk.services.ec2.model.Ec2Exception;
import software.amazon.awssdk.services.ec2.model.Tag;
import software.amazon.awssdk.services.ec2.model.Vpc;

public class VpcProcessor {

	private String accessKey;
	private String secretKey;
	private Region region;

	public VpcProcessor() {

	}

	public VpcProcessor(String accessKey, String secretKey, Region region) {
		this.accessKey = accessKey;
		this.secretKey = secretKey;
		this.region = region;
	}

	public VpcProcessor(String accessKey, String secretKey) {
		this.accessKey = accessKey;
		this.secretKey = secretKey;
	}

	public VpcProcessor(Region region) {
		this.region = region;
	}

	public Ec2Client getEC2Client() {
		Region rg = null;
		if (this.region != null) {
			rg = this.region;
		} else {
			System.out.println("Default region is: " + Constants.DEFAULT_REGION.toString());
			rg = Constants.DEFAULT_REGION;
		}
		Ec2Client ec2 = null;
		if (accessKey != null && secretKey != null) {
			AwsCredentials credentials = AwsBasicCredentials.create(accessKey, secretKey);
			AwsCredentialsProvider asAwsCredentialsProvider = StaticCredentialsProvider.create(credentials);
			ec2 = Ec2Client.builder().credentialsProvider(asAwsCredentialsProvider).region(rg).build();
			return ec2;
		} else {
			ec2 = Ec2Client.builder().region(rg).build();
			return ec2;
		}
	}

	public List<CustomVpc> describeEC2VpcById(Region region, String vpcId) {
		this.region=region;
		Ec2Client ec2 = getEC2Client();
		List<CustomVpc> customVpcs = null;
		try {
			DescribeVpcsRequest request = DescribeVpcsRequest.builder().vpcIds(vpcId).build();
			DescribeVpcsResponse response = ec2.describeVpcs(request);
			customVpcs = getAllCustomVpc(response.vpcs());
		} catch (Ec2Exception e) {
			System.err.println(e.awsErrorDetails().errorMessage());
		} finally {
			if (ec2 != null) {
				ec2.close();
			}
		}
		return customVpcs;
	}

	public List<CustomVpc> describeEC2Vpcs(Region region) {
		this.region=region;
		Ec2Client ec2 = getEC2Client();
		List<CustomVpc> customVpcs = null;
		try {
			DescribeVpcsRequest request = DescribeVpcsRequest.builder().build();
			DescribeVpcsResponse response = ec2.describeVpcs(request);
			customVpcs = getAllCustomVpc(response.vpcs());
		} catch (Ec2Exception e) {
			System.err.println(e.awsErrorDetails().errorMessage());
		} finally {
			if (ec2 != null) {
				ec2.close();
			}
		}
		return customVpcs;
	}

	public List<CustomVpc> getAllCustomVpc(List<Vpc> listVps) {
		List<CustomVpc> listCustomVpcs = new ArrayList<CustomVpc>();
		for (Vpc vpc : listVps) {
			CustomVpc customVpc = populateVpc(vpc);
			listCustomVpcs.add(customVpc);
		}
		return listCustomVpcs;
	}

	public CustomVpc populateVpc(Vpc vpc) {

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
		customVpc.setIsDefault(vpc.isDefault());
		customVpc.setState(vpc.stateAsString());
		customVpc.setTags(getCustomTagList(vpc.tags()));
		customVpc.setName(null);
		customVpc.setVpcPeeringConnections(null);
		customVpc.setSource(null);
		customVpc.setOwnerID(vpc.ownerId());
		return customVpc;
	}

	public CustomTag[] getCustomTagList(List<Tag> tags) {
//		List<CustomTag> customTags=new ArrayList<CustomTag>();
		CustomTag[] customTags = new CustomTag[(tags.size())];
		for (int i = 0; i < tags.size(); i++) {
			Tag tag = tags.get(i);
			CustomTag customTag = new CustomTag();
			customTag.setKey(tag.key());
			customTag.setValue(tag.value());
//			customTags.add(customTag);
			customTags[i] = customTag;

		}
		return customTags;
	}
}
