package com.synectiks.aws.main;

import com.synectiks.aws.vpc.VpcProcessor;

import software.amazon.awssdk.regions.Region;

public class XformAwsCli {
	
	public static void main(String[] a) {
		
		if (a.length > 0) {
			if (!a[0].equalsIgnoreCase("get")) {
				System.out.println("Invalid command. Example get vpcs [us-east-1] or get vpc <vpc id> [us-east-1]");
				System.exit(1);
			}
			
			if (a.length == 3 && a[1].equalsIgnoreCase("vpcs")) {
				VpcProcessor vp = new VpcProcessor();
				System.out.println(vp.describeEC2Vpcs(Region.of(a[2])));
				System.exit(0);
			}else if (a.length == 2 && a[1].equalsIgnoreCase("vpcs")) {
				VpcProcessor vp = new VpcProcessor();
				System.out.println(vp.describeEC2Vpcs(null));
				System.exit(0);
			}else if (a.length == 4 && a[1].equalsIgnoreCase("vpc")) {
				String vpcId = a[2];
				VpcProcessor vp = new VpcProcessor();
				System.out.println(vp.describeEC2VpcById(Region.of(a[3]), vpcId));
				System.exit(0);
			}else if (a.length == 3 && a[1].equalsIgnoreCase("vpc")) {
				String vpcId = a[2];
				VpcProcessor vp = new VpcProcessor();
				System.out.println(vp.describeEC2VpcById(null, vpcId));
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

	

}
