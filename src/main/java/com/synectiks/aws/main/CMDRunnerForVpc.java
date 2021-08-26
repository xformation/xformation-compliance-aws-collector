package com.synectiks.aws.main;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.synectiks.aws.vpc.VpcProcessor;

import software.amazon.awssdk.regions.Region;

public class CMDRunnerForVpc {
	private static Options buildOptions() {
		Options options = new Options();
		Option getOpt = new Option("get", "get", true, "get param value");
		getOpt.setRequired(false);
		options.addOption(getOpt);
		Option kafkaTopic = new Option("id", "id", true, "Enter Vpc Id");
		kafkaTopic.setRequired(false);
		options.addOption(kafkaTopic);
		Option region = new Option("r", "r", true, "Enter Region");
		region.setRequired(false);
		options.addOption(region);
		Option help = new Option("help", "help", false, "Help Command");
		help.setRequired(false);
		options.addOption(help);
		return options;
	}

	public static void getHelp(Options options) {
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("CMD Runner", options);
	}

	public static void main(String[] args) throws ParseException {
		Options options = buildOptions();
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);
		VpcProcessor vp = new VpcProcessor();
		String r = cmd.getOptionValue("r");
		Region reg = null;
		if (r != null) {
			reg = Region.of(r);
		}
		if (cmd.hasOption("help")) {
			getHelp(options);
			return;
		}
		if (cmd.hasOption("get")) {
			if (cmd.getOptionValue("get").equalsIgnoreCase("vpcs")) {
				System.out.println(vp.describeEC2Vpcs(reg));
			} else if (cmd.getOptionValue("get").equalsIgnoreCase("vpc")) {
				if (cmd.hasOption("id")) {
					String vpcId = cmd.getOptionValue("id");
					System.out.println(vp.describeEC2VpcById(reg, vpcId));
				} else {
					System.out.println("Please enter vpc id by using -id <vpcId>");
				}
			}
		} else {
			System.out.println("please enter option value using -get <vpcs or vpc>");
		}
	}
}
