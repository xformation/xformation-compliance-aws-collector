package com.synectiks.aws.main;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

import com.synectiks.aws.config.Converter;
import com.synectiks.aws.entities.autoscaling.AutoScalingGroup;
import com.synectiks.aws.entities.cloudtrail.XformCloudTrail;
import com.synectiks.aws.entities.ec2.XformEc2;
import com.synectiks.aws.entities.ekscluster.XformEksCluster;
import com.synectiks.aws.entities.lambda.XformLambda;
import com.synectiks.aws.entities.rds.XformRds;
import com.synectiks.aws.entities.subnet.XformSubnet;
import com.synectiks.aws.entities.vpc.XformVpc;
import com.synectiks.aws.processor.XformAutoScalingProcessor;
import com.synectiks.aws.processor.XformCloudTrailProcessor;
import com.synectiks.aws.processor.XformEc2Processor;
import com.synectiks.aws.processor.XformEksClusterProcessor;
import com.synectiks.aws.processor.XformLambdaProcessor;
import com.synectiks.aws.processor.XformRdsProcessor;
import com.synectiks.aws.processor.XformSubnetProcessor;
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

		Option ec2Id = new Option("ec2Id", "ec2Id", true, "Enter ec2 instance id");
		ec2Id.setRequired(false);
		options.addOption(ec2Id);
		
		Option eksCluster = new Option("eksCluster", "eksCluster");
		eksCluster.setRequired(false);
		options.addOption(eksCluster);

		Option s3Rds = new Option("rds", "rds");
		s3Rds.setRequired(false);
		options.addOption(s3Rds);

		Option lambda = new Option("lambda", "lambda");
		lambda.setRequired(false);
		options.addOption(lambda);

		Option subnet = new Option("subnet", "subnet");
		subnet.setRequired(false);
		options.addOption(subnet);
		
		Option subnetId = new Option("subnetId", "subnetId", true, "Enter subnetId id");
		subnetId.setRequired(false);
		options.addOption(subnetId);
		
		Option autoscaling = new Option("autoScaling", "autoScaling");
		autoscaling.setRequired(false);
		options.addOption(autoscaling);

		Option cloudTrail = new Option("cloudTrail", "cloudTrail");
		cloudTrail.setRequired(false);
		options.addOption(cloudTrail);
		
		Option cloudTrailName = new Option("trailName", "trailName", true, "Enter cloud trail name");
		cloudTrailName.setRequired(false);
		options.addOption(cloudTrailName);
		
		return options;
	}




	public static void main(String[] args) throws Exception {
		Options options = buildOptions();
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);

		if (cmd.hasOption("vpc")) {
			List<XformVpc> list = null;
			if (cmd.hasOption("vpcId")) {
				XformVpcProcessor processor = new XformVpcProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
				list = processor.getXformObjectById(cmd.getOptionValue("vpcId"));
			} else {
				XformVpcProcessor processor = new XformVpcProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
				list = processor.getXformObject();
			}
			System.out.println(Converter.toPrettyJsonString(list, List.class));
			System.exit(0);
		}

		if (cmd.hasOption("ec2")) {
			List<XformEc2> list = null;
			if(cmd.hasOption("ec2Id")) {
				XformEc2Processor processor = new XformEc2Processor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
				list = processor.getXformObjectById(cmd.getOptionValue("ec2Id"));
			}else {
				XformEc2Processor processor = new XformEc2Processor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
				list = processor.getXformObject();
			}
			System.out.println(Converter.toPrettyJsonString(list, List.class));
			System.exit(0);
		}

		if (cmd.hasOption("eksCluster")) {
			XformEksClusterProcessor processor = new XformEksClusterProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
			List<XformEksCluster> list = processor.getXformObject();
			System.out.println(Converter.toPrettyJsonString(list, List.class));
			System.exit(0);
		}
		
		if (cmd.hasOption("rds")) {
			XformRdsProcessor processor = new XformRdsProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
			List<XformRds> list = processor.getXformObject();
			System.out.println(Converter.toPrettyJsonString(list, List.class));
			System.exit(0);
		}
		
		if (cmd.hasOption("lambda")) {
			XformLambdaProcessor processor = new XformLambdaProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
			List<XformLambda> list = processor.getXformObject();
			System.out.println(Converter.toPrettyJsonString(list, List.class));
			System.exit(0);
		}

		if (cmd.hasOption("subnet")) {
			List<XformSubnet> list = null;
			if (cmd.hasOption("subnetId")) {
				XformSubnetProcessor processor = new XformSubnetProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
				list = processor.getXformObjectById(cmd.getOptionValue("subnetId"));
				System.out.println(Converter.toPrettyJsonString(list, List.class));
			} else {
				XformSubnetProcessor processor = new XformSubnetProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
				list = processor.getXformObject();
				System.out.println(Converter.toPrettyJsonString(list, List.class));
			}
			System.exit(0);
		}

		if (cmd.hasOption("autoScaling")) {
			XformAutoScalingProcessor processor = new XformAutoScalingProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
			List<AutoScalingGroup> list = processor.getXformObject();
			System.out.println(Converter.toPrettyJsonString(list, List.class));
			System.exit(0);
		}
		
		
		if (cmd.hasOption("cloudTrail")) {
			List<XformCloudTrail> list = null;
			if (cmd.hasOption("trailName")) {
				XformCloudTrailProcessor processor = new XformCloudTrailProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
				list = processor.getXformObjectById(cmd.getOptionValue("trailName"));
				System.out.println(Converter.toPrettyJsonString(list, List.class));
			} else {
				XformCloudTrailProcessor processor = new XformCloudTrailProcessor(cmd.getOptionValue("a"), cmd.getOptionValue("s"), cmd.getOptionValue("r"));
				list = processor.getXformObject();
				System.out.println(Converter.toPrettyJsonString(list, List.class));
			}
			System.exit(0);
		}
		
		System.out.println("Please provide some options like vpc, subnet etc... ");
		System.exit(0);
	}
}
