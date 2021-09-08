package com.synectiks.aws.main;

import java.io.IOException;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.synectiks.aws.config.Constants;
import com.synectiks.aws.ec2.DescribeInstances;
import com.synectiks.aws.s3.DescribeS3RdsDBInstances;
import com.synectiks.aws.vpc.VpcProcessor;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;

public class CMDRunnerAll {
	private static Options buildOptions() {
		Options options = new Options();
		Option regionOpt = new Option("r", "r", true, "Enter Region");
		regionOpt.setRequired(false);
		options.addOption(regionOpt);
		Option id = new Option("id", "id", true, "Enter id");
		id.setRequired(false);
		options.addOption(id);
		Option accessKey = new Option("a", "a", true, "Enter access key");
		accessKey.setRequired(false);
		options.addOption(accessKey);
		Option secretKey = new Option("s", "s", true, "Enter secret key");
		secretKey.setRequired(false);
		options.addOption(secretKey);
		Option helpOpt = new Option("help", "help", false, "For print helps");
		helpOpt.setRequired(false);
		options.addOption(helpOpt);
		Option helpOpt1 = new Option("h", "h", false, "For print helps");
		helpOpt1.setRequired(false);
		options.addOption(helpOpt1);
		return options;
	}

	public static void getHelp(Options options) {
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("vpc -id <vpcId> -r <region> -a <access key> -s secret key", "Type vpc, ec2, s3rds and subnets",
				options, "vpc for get vpc\n ec2 for describe ec2 instance\n s3rds for describe s3rds");
	}

	public static AwsCredentialsProvider getAwsCredentialsProvider(String accessKey, String secretKey) {
		AwsCredentials credentials = AwsBasicCredentials.create(accessKey, secretKey);
		AwsCredentialsProvider asAwsCredentialsProvider = StaticCredentialsProvider.create(credentials);
		return asAwsCredentialsProvider;
	}

	public static Region getRegion(String region) {
		Region rg = null;
		if (region != null) {
			rg = Region.of(region);
		} else {
			System.out.println("Default region is: " + Constants.DEFAULT_REGION.toString());
			rg = Constants.DEFAULT_REGION;
		}
		return rg;
	}

	public static void main(String[] args) throws ParseException {
		Options options = buildOptions();
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);
		String r = cmd.getOptionValue("r");
		Region reg = getRegion(r);
		AwsCredentialsProvider asAwsCredentialsProvider = null;
		if (cmd.hasOption("a") && cmd.hasOption("s")) {
			asAwsCredentialsProvider = getAwsCredentialsProvider(cmd.getOptionValue("a"), cmd.getOptionValue("s"));
		} else {
			asAwsCredentialsProvider = DefaultCredentialsProvider.create();
		}
		List<String> cmdArgs = cmd.getArgList();
		if (cmd.hasOption("help")) {
			getHelp(options);
			return;
		}
		if (cmdArgs.size() > 0) {
			String firstArg = cmdArgs.get(0);
			if (firstArg.equalsIgnoreCase("ec2")) {
				DescribeInstances describeInstances = new DescribeInstances(reg, asAwsCredentialsProvider);
				try {
					describeInstances.describeEC2Instances();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (firstArg.equalsIgnoreCase("vpc")) {
				VpcProcessor vp = new VpcProcessor();
				if (cmd.hasOption("id")) {
					String vpcId = cmd.getOptionValue("id");
					System.out.println(vp.describeEC2VpcById(reg, vpcId));
				} else {
					System.out.println(vp.describeEC2Vpcs(reg));
				}
			} else if (firstArg.equalsIgnoreCase("s3rds")) {
				DescribeS3RdsDBInstances describeS3RdsDBInstances = new DescribeS3RdsDBInstances(reg,
						asAwsCredentialsProvider);
				System.out.println(describeS3RdsDBInstances.describeInstances());
			} else if (firstArg.equalsIgnoreCase("subnets")) {
				VpcProcessor vpcProcessor=new VpcProcessor();
				System.out.println(vpcProcessor.describeSubnets());
			} 
			else {
				System.out.println("please Enter valid command");
				System.out.println("To get more information type -h or -help");
			}
		}
	}
}
