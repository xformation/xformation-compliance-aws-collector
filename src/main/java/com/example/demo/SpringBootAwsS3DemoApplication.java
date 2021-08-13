package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.authenticator.BasicAuthenticator.BasicCredentials;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.services.route53.model.VPC;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import com.amazonaws.services.s3.model.Bucket;
import com.example.demo.pojo.vpc.AdditionalField;
import com.example.demo.pojo.vpc.CustomTag;
import com.example.demo.pojo.vpc.CustomVpc;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsRequest;
import software.amazon.awssdk.services.ec2.model.DescribeVpcsResponse;
import software.amazon.awssdk.services.ec2.model.Ec2Exception;
import software.amazon.awssdk.services.ec2.model.Tag;
import software.amazon.awssdk.services.ec2.model.Vpc;

@SpringBootApplication
public class SpringBootAwsS3DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsS3DemoApplication.class, args);

//		Region region = Region.US_EAST_1;
////		AwsCredentialsProvider awsCredentialsProvider=new Bas
////		AwsBasicCredentials awsBasicCredentials=new AwsBasicCredentials(null, null)
//		Ec2Client ec2 = Ec2Client.builder().credentialsProvider(null).region(region).build();
//
//		describeEC2Vpcs(ec2);
//		ec2.close();
	}

	public static void describeEC2Vpcs(Ec2Client ec2) {

		try {
			DescribeVpcsRequest request = DescribeVpcsRequest.builder().build();

			DescribeVpcsResponse response = ec2.describeVpcs(request);
			List<CustomVpc> customVpcs=getAllCustomVpc(response.vpcs());
		} catch (Ec2Exception e) {
			System.err.println(e.awsErrorDetails().errorMessage());
			System.exit(1);
		}

	}
	public static List<CustomVpc> getAllCustomVpc(List<Vpc> listVps){
		List<CustomVpc> listCustomVpcs=new ArrayList<CustomVpc>();
		for (Vpc vpc : listVps) {
			CustomVpc customVpc=populateVpc(vpc);
			listCustomVpcs.add(customVpc);
		}
		return listCustomVpcs;
	}
	public static CustomVpc populateVpc(Vpc vpc) {
	
		CustomVpc customVpc=new CustomVpc();
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
		CustomTag[] customTags=new CustomTag[(tags.size())];
		for(int i=0;i<tags.size();i++) {
			Tag tag=tags.get(i);
			CustomTag customTag=new CustomTag();
			customTag.setKey(tag.key());
			customTag.setValue(tag.value());
//			customTags.add(customTag);
			customTags[i]=customTag;
			
		}
		return customTags;
	}

}
