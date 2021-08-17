package com.synectiks.aws.main;

import java.util.ArrayList;
import java.util.List;

import com.synectiks.aws.entities.vpc.CustomTag;
import com.synectiks.aws.entities.vpc.CustomVpc;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsRequest;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsResponse;
import software.amazon.awssdk.services.ec2.model.Ec2Exception;
import software.amazon.awssdk.services.ec2.model.Tag;
import software.amazon.awssdk.services.ec2.model.Vpc;

public class XformAwsCli {

	private static final Region DEFAULT_REGION = Region.US_EAST_1;
	
	public static void main(String[] a) {
		
		if (a.length > 0) {
			if (!a[0].equalsIgnoreCase("get")) {
				System.out.println("Invalid command. Example get vpcs [us-east-1] or get vpc <vpc id> [us-east-1]");
				System.exit(1);
			}
			
			if (a.length == 3 && a[1].equalsIgnoreCase("vpcs")) {
				System.out.println(describeEC2Vpcs(Region.of(a[2])));
				System.exit(0);
			}else if (a.length == 2 && a[1].equalsIgnoreCase("vpcs")) {
				System.out.println(describeEC2Vpcs(null));
				System.exit(0);
			}else if (a.length == 4 && a[1].equalsIgnoreCase("vpc")) {
				String vpcId = a[2];
				System.out.println(describeEC2VpcById(Region.of(a[3]), vpcId));
				System.exit(0);
			}else if (a.length == 3 && a[1].equalsIgnoreCase("vpc")) {
				String vpcId = a[2];
				System.out.println(describeEC2VpcById(null, vpcId));
				System.exit(0);
			}
//			else {
//					System.out.println("invalid command please enter vpcId for example get vpc <vpc_id> [us-east-1]");
//					System.exit(1);
//				}
			 else {
				System.out.println(
						"Invalid command Please enter \n 1). get vpcs [us-east-1] or to get all vpc details \n 2). get vpc <vpc_id> [us-east-1] ");
				System.exit(1);
			}
		} else {
			System.out.println(
					"Please enter commandline args for example \n 1). get vpcs [us-east-1] to get all vpc details \n 2). get vpc <vpc_id> [us-east-1]");
			System.exit(1);
		}

	}

	public static List<CustomVpc> describeEC2VpcById(Region region, String vpcId) {
		Region rg = null;
		if(region != null) {
			rg = region;
		}else {
			System.out.println("Default region is: "+DEFAULT_REGION.toString());
			rg = DEFAULT_REGION;
		}
		Ec2Client ec2 = Ec2Client.builder().region(rg).build();

		List<CustomVpc> customVpcs = null;
		try {
			DescribeVpcsRequest request = DescribeVpcsRequest.builder().vpcIds(vpcId).build();

			DescribeVpcsResponse response = ec2.describeVpcs(request);
			customVpcs = getAllCustomVpc(response.vpcs());
		} catch (Ec2Exception e) {
			System.err.println(e.awsErrorDetails().errorMessage());
			System.exit(1);
		}finally {
			if(ec2 != null) {
				ec2.close();
			}
		}
		return customVpcs;
	}

	public static List<CustomVpc> describeEC2Vpcs(Region region) {
		Region rg = null;
		if(region != null) {
			rg = region;
		}else {
			System.out.println("Default region is: "+DEFAULT_REGION.toString());
			rg = DEFAULT_REGION;
		}
			
		Ec2Client ec2 = Ec2Client.builder().region(rg).build();

		List<CustomVpc> customVpcs = null;
		try {
			DescribeVpcsRequest request = DescribeVpcsRequest.builder().build();

			DescribeVpcsResponse response = ec2.describeVpcs(request);
			customVpcs = getAllCustomVpc(response.vpcs());
		} catch (Ec2Exception e) {
			System.err.println(e.awsErrorDetails().errorMessage());
			System.exit(1);
		}finally {
			if(ec2 != null) {
				ec2.close();
			}
		}
		return customVpcs;
	}

	public static List<CustomVpc> getAllCustomVpc(List<Vpc> listVps) {
		List<CustomVpc> listCustomVpcs = new ArrayList<CustomVpc>();
		for (Vpc vpc : listVps) {
			CustomVpc customVpc = populateVpc(vpc);
			listCustomVpcs.add(customVpc);
		}
		return listCustomVpcs;
	}

	public static CustomVpc populateVpc(Vpc vpc) {

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

	public static CustomTag[] getCustomTagList(List<Tag> tags) {
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
