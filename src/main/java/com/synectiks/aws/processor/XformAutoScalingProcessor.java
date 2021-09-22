package com.synectiks.aws.processor;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synectiks.aws.entities.ec2.XformEc2;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.autoscaling.AutoScalingClient;
import software.amazon.awssdk.services.autoscaling.model.AutoScalingGroup;
import software.amazon.awssdk.services.autoscaling.model.DescribeAutoScalingGroupsResponse;
import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.CapacityReservationSpecificationResponse;
import software.amazon.awssdk.services.ec2.model.CpuOptions;
import software.amazon.awssdk.services.ec2.model.DescribeInstancesRequest;
import software.amazon.awssdk.services.ec2.model.EnclaveOptions;
import software.amazon.awssdk.services.ec2.model.HibernationOptions;
import software.amazon.awssdk.services.ec2.model.IamInstanceProfile;
import software.amazon.awssdk.services.ec2.model.Instance;
import software.amazon.awssdk.services.ec2.model.InstanceMetadataOptionsResponse;
import software.amazon.awssdk.services.ec2.model.InstanceState;
import software.amazon.awssdk.services.ec2.model.Monitoring;
import software.amazon.awssdk.services.ec2.model.Placement;
import software.amazon.awssdk.services.ec2.model.Reservation;
import software.amazon.awssdk.services.ec2.model.StateReason;
import software.amazon.awssdk.services.ec2.model.Tag;
import software.amazon.awssdk.services.ec2.model.Vpc;

public class XformAutoScalingProcessor extends XformAwsProcessor {

	public XformAutoScalingProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
		// TODO Auto-generated constructor stub
	}

	private static final Logger logger = LoggerFactory.getLogger(XformAutoScalingProcessor.class);

	@Override
	protected List<AutoScalingGroup> getCloudObject() throws Exception {
		AutoScalingClient client = AutoScalingClient.builder().credentialsProvider(awsCredentialsProvider)
				.region(region).build();
		DescribeAutoScalingGroupsResponse response=client.describeAutoScalingGroups();
		List<AutoScalingGroup> autoScalingGroups=response.autoScalingGroups();
		return autoScalingGroups;
	}

	@Override
	protected <T> T getXformObject() throws Exception {
		List<AutoScalingGroup>  autoScalingGroups=getCloudObject();
		for (AutoScalingGroup autoScalingGroup : autoScalingGroups) {
			Optional<Integer> autoScalingGroupName = autoScalingGroup.getValueForField("AutoScalingGroupName", Integer.class);
			Optional<String> autoScalingGroupARN = autoScalingGroup.getValueForField("AutoScalingGroupARN", String.class);
			Optional<String> launchConfigurationName = autoScalingGroup.getValueForField("LaunchConfigurationName", String.class);
			Optional<String> launchTemplate = autoScalingGroup.getValueForField("LaunchTemplate", String.class);
			Optional<String> mixedInstancesPolicy = autoScalingGroup.getValueForField("MixedInstancesPolicy", String.class);
			Optional<String> minSize = autoScalingGroup.getValueForField("MinSize", String.class);
			Optional<Instant> maxSize = autoScalingGroup.getValueForField("MaxSize", Instant.class);
			Optional<Monitoring> monitoring = autoScalingGroup.getValueForField("Monitoring", Monitoring.class);
			Optional<Placement> placement = autoScalingGroup.getValueForField("Placement", Placement.class);
			Optional<String> platform = autoScalingGroup.getValueForField("Platform", String.class);
			Optional<String> privateDnsName = autoScalingGroup.getValueForField("PrivateDnsName", String.class);
			Optional<String> privateIpAddress = autoScalingGroup.getValueForField("PrivateIpAddress", String.class);
			Optional<List> productCodes = autoScalingGroup.getValueForField("ProductCodes", List.class);
			Optional<String> publicDnsName = autoScalingGroup.getValueForField("PublicDnsName", String.class);
			Optional<String> publicIpAddress = autoScalingGroup.getValueForField("PublicIpAddress", String.class);
			Optional<String> ramdiskId = autoScalingGroup.getValueForField("RamdiskId", String.class);
			Optional<InstanceState> state = autoScalingGroup.getValueForField("State", InstanceState.class);
			Optional<String> stateTransitionReason = autoScalingGroup.getValueForField("StateTransitionReason", String.class);
			Optional<String> subnetId = autoScalingGroup.getValueForField("SubnetId", String.class);
			Optional<String> vpcId = autoScalingGroup.getValueForField("VpcId", String.class);
			Optional<String> architecture = autoScalingGroup.getValueForField("Architecture", String.class);
			Optional<List> blockDeviceMappings = autoScalingGroup.getValueForField("BlockDeviceMappings", List.class);
			Optional<String> clientToken = autoScalingGroup.getValueForField("ClientToken", String.class);
			Optional<Boolean> ebsOptimized = autoScalingGroup.getValueForField("EbsOptimized", Boolean.class);
			Optional<Boolean> enaSupport = autoScalingGroup.getValueForField("EnaSupport", Boolean.class);
			Optional<String> hypervisor = autoScalingGroup.getValueForField("Hypervisor", String.class);
			Optional<IamInstanceProfile> iamInstanceProfile = autoScalingGroup.getValueForField("IamInstanceProfile",
					IamInstanceProfile.class);
		}
		return null;
	}

}
