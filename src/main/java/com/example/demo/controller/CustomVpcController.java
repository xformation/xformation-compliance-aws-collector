package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.vpc.CustomTag;
import com.example.demo.pojo.vpc.CustomVpc;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsRequest;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsResponse;
import software.amazon.awssdk.services.ec2.model.Ec2Exception;
import software.amazon.awssdk.services.ec2.model.Tag;
import software.amazon.awssdk.services.ec2.model.Vpc;

@RestController
@RequestMapping("/api")
public class CustomVpcController {

	CustomVpcController(){
		System.out.println("I am in custom controller");
	}
	@GetMapping("/getCustomVpcList")
	public List<CustomVpc> getCustomVpc() {
		Region region = Region.US_EAST_1;
		Ec2Client ec2 = Ec2Client.builder().credentialsProvider(null).region(region).build();
//		describeEC2Vpcs(ec2);
		List<CustomVpc> customVpcs = null;
		try {
			DescribeVpcsRequest request = DescribeVpcsRequest.builder().build();
			DescribeVpcsResponse response = ec2.describeVpcs(request);
			customVpcs = getAllCustomVpc(response.vpcs());
		} catch (Ec2Exception e) {
			System.err.println(e.awsErrorDetails().errorMessage());
			System.exit(1);
		}
		ec2.close();
		return customVpcs;
	}

	public static void describeEC2Vpcs(Ec2Client ec2) {
		try {
			DescribeVpcsRequest request = DescribeVpcsRequest.builder().build();
			DescribeVpcsResponse response = ec2.describeVpcs(request);
			List<CustomVpc> customVpcs = getAllCustomVpc(response.vpcs());
		} catch (Ec2Exception e) {
			System.err.println(e.awsErrorDetails().errorMessage());
			System.exit(1);
		}

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
