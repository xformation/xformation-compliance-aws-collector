package com.synectiks.aws.main;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

import com.synectiks.aws.config.Converter;
import com.synectiks.aws.entities.ec2.XformEc2;
import com.synectiks.aws.entities.ekscluster.XformEksCluster;
import com.synectiks.aws.entities.vpc.XformVpc;
import com.synectiks.aws.processor.XformEc2Processor;
import com.synectiks.aws.processor.XformEksClusterProcessor;
import com.synectiks.aws.processor.XformVpcProcessor;

public class XformAwsCmd {
	private static Options buildOptions() {
		Options options = new Options();
		
		Option accessKey = new Option("a", "a", true, "Enter access key");
		accessKey.setRequired(true);
		options.addOption(accessKey);
		
		Option secretKey = new Option("s", "s", true, "Enter secret key");
		secretKey.setRequired(true);
		options.addOption(secretKey);
		
		Option regionOpt = new Option("r", "r", true, "Enter Region");
		regionOpt.setRequired(true);
		options.addOption(regionOpt);
		
		Option vpc = new Option("vpc", "vpc");
		vpc.setRequired(false);
		options.addOption(vpc);
		
		Option id = new Option("vpcId", "vpcId", true, "Enter vpc id");
		id.setRequired(false);
		options.addOption(id);
		
		Option ec2 = new Option("ec2", "ec2");
		ec2.setRequired(false);
		options.addOption(ec2);
		
		Option eksCluster = new Option("eksCluster", "eksCluster");
		eksCluster.setRequired(false);
		options.addOption(eksCluster);
		
//		Option helpOpt = new Option("help", "help", false, "For print helps");
//		helpOpt.setRequired(false);
//		options.addOption(helpOpt);
		
//		Option helpOpt1 = new Option("h", "h", false, "For print helps");
//		helpOpt1.setRequired(false);
//		options.addOption(helpOpt1);
		return options;
	}

//	public static void getHelp(Options options) {
//		HelpFormatter formatter = new HelpFormatter();
//		formatter.printHelp("vpc -id <vpcId> -r <region> -a <access key> -s secret key",
//				"Type vpc, ec2, s3rds and subnets", options,
//				"vpc for get vpc\n ec2 for describe ec2 instance\n s3rds for describe s3rds");
//	}

//	public static AwsCredentialsProvider getAwsCredentialsProvider(String accessKey, String secretKey) {
//		AwsCredentials credentials = AwsBasicCredentials.create(accessKey, secretKey);
//		AwsCredentialsProvider asAwsCredentialsProvider = StaticCredentialsProvider.create(credentials);
//		return asAwsCredentialsProvider;
//	}

//	public static Region getRegion(String region) {
//		Region rg = null;
//		if (region != null) {
//			rg = Region.of(region);
//		} else {
//			System.out.println("Default region is: " + Constants.DEFAULT_REGION.toString());
//			rg = Constants.DEFAULT_REGION;
//		}
//		return rg;
//	}

	public static void main(String[] args) throws Exception {
		Options options = buildOptions();
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);
		
		if(cmd.hasOption("vpc")) {
			if(cmd.hasOption("vpcId")) {
				XformVpcProcessor processor = new XformVpcProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
				List<XformVpc> list = processor.getXformObjectById(cmd.getOptionValue("vpcId"));
				for(XformVpc vpc : list) {
					System.out.println(Converter.toPrettyJsonString(vpc, XformVpc.class));
				}
			}else {
				XformVpcProcessor processor = new XformVpcProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
				List<XformVpc> list = processor.getXformObject();
				for(XformVpc vpc : list) {
					System.out.println(Converter.toPrettyJsonString(vpc, XformVpc.class));
				}
			}
			System.exit(0);
		}
		
		if(cmd.hasOption("ec2")) {
			XformEc2Processor processor = new XformEc2Processor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
			List<XformEc2> list =  processor.getXformObject();
			for(XformEc2 ec2 : list) {
				System.out.println(Converter.toPrettyJsonString(ec2, XformEc2.class));
			}
			System.exit(0);
		}
		
		if(cmd.hasOption("eksCluster")) {
			XformEksClusterProcessor processor = new XformEksClusterProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
			List<XformEksCluster> list =  processor.getXformObject();
			for(XformEksCluster eksClusterObj : list) {
				System.out.println(Converter.toPrettyJsonString(eksClusterObj, XformEksCluster.class));
			}
			System.exit(0);
		}
		
//		String r = cmd.getOptionValue("r");
//		Region reg = getRegion(r);
//		AwsCredentialsProvider asAwsCredentialsProvider = null;
		
//		if (cmd.hasOption("a") && cmd.hasOption("s")) {
//			asAwsCredentialsProvider = getAwsCredentialsProvider(cmd.getOptionValue("a"), cmd.getOptionValue("s"));
//		} else {
//			asAwsCredentialsProvider = DefaultCredentialsProvider.create();
//		}
		
//		List<String> cmdArgs = cmd.getArgList();
//		if (cmd.hasOption("help")) {
//			getHelp(options);
//			return;
//		}
		
//		if (cmdArgs.size() > 0) {
//			String firstArg = cmdArgs.get(0);
//			if (firstArg.equalsIgnoreCase("ec2")) {
//				DescribeInstances describeInstances = new DescribeInstances(asAwsCredentialsProvider, reg);
//				try {
//					describeInstances.describeEC2Instances();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			} else if (firstArg.equalsIgnoreCase("vpc")) {
//				XformVpcProcessor vp = new XformVpcProcessor(asAwsCredentialsProvider);
//				if (cmd.hasOption("id")) {
//					String vpcId = cmd.getOptionValue("id");
//					System.out.println(vp.getAwsVpcById(vpcId));
//				} else {
//					System.out.println(vp.describeEC2Vpcs());
//				}
//			} else if (firstArg.equalsIgnoreCase("s3rds")) {
//				DescribeS3RdsDBInstances describeS3RdsDBInstances = new DescribeS3RdsDBInstances(
//						asAwsCredentialsProvider, reg);
//				System.out.println(describeS3RdsDBInstances.describeInstances());
//			} else if (firstArg.equalsIgnoreCase("subnets")) {
//				XformVpcProcessor vpcProcessor = new XformVpcProcessor(asAwsCredentialsProvider, reg);
//				System.out.println(vpcProcessor.describeSubnets());
//			} else {
//				System.out.println("please Enter valid command");
//				System.out.println("To get more information type -h or -help");
//			}
//		}
	}
}
