package com.synectiks.aws.main;

import java.io.IOException;

import com.synectiks.aws.ec2.DescribeInstances;

import software.amazon.awssdk.regions.Region;

public class XformAwsCli2ForEc2 {

	public static void main(String[] a) throws IOException {
		

			Region region = Region.US_EAST_1;
//			DescribeInstances describeInstances = new DescribeInstances();
		if (a.length > 0) {
//			VpcProcessor vp = new VpcProcessor("<access key id>","<secrect key>");
			if (!a[0].equalsIgnoreCase("get")) {
				System.out.println("Invalid command. Example get ec2 <Region Name> ");
				System.exit(1);
			}
			if (a.length == 3 && a[1].equalsIgnoreCase("ec2")) {
//				System.out.println(vp.describeEC2Vpcs(Region.of(a[2])));
				DescribeInstances describeInstances=new DescribeInstances(Region.of(a[2]));
				describeInstances.describeEC2Instances();
				System.exit(0);
			} else if (a.length == 2 && a[1].equalsIgnoreCase("ec2")) {
				DescribeInstances describeInstances=new DescribeInstances();
				describeInstances.describeEC2Instances();
				System.exit(0);
			} else {
				System.out.println(
						"Invalid command Please enter \n 1). get ec2 <Region Name> or to get instances detail for default region [us-east-1]  \n 2). get ec2");
				System.exit(1);
			}
		} else {
			System.out.println(
					"Invalid command Please enter \n 1). get ec2 <Region Name> or to get instances detail for default region [us-east-1]  \n 2). get ec2");
			System.exit(1);
		}

	}

}
