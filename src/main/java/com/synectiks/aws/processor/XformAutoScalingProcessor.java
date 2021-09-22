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
import com.synectiks.aws.entities.s3.XformS3RDSEntity;
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
	public <T> T getXformObject() throws Exception {
		List<AutoScalingGroup>  autoScalingGroups=getCloudObject();
		for (AutoScalingGroup autoScalingGroup : autoScalingGroups) {
			Optional<String> autoScalingGroupName = autoScalingGroup.getValueForField("AutoScalingGroupName", String.class);
			Optional<String> autoScalingGroupARN = autoScalingGroup.getValueForField("AutoScalingGroupARN", String.class);
			Optional<String> launchConfigurationName = autoScalingGroup.getValueForField("LaunchConfigurationName", String.class);
			Optional<String> launchTemplate = autoScalingGroup.getValueForField("LaunchTemplate", String.class);
			Optional<String> mixedInstancesPolicy = autoScalingGroup.getValueForField("MixedInstancesPolicy", String.class);
			Optional<String> minSize = autoScalingGroup.getValueForField("MinSize", String.class);
			Optional<String> desiredCapacity = autoScalingGroup.getValueForField("DesiredCapacity", String.class);
			Optional<String> predictedCapacity = autoScalingGroup.getValueForField("PredictedCapacity", String.class);
			Optional<String> defaultCooldown = autoScalingGroup.getValueForField("DefaultCooldown", String.class);
			Optional<String> availabilityZones = autoScalingGroup.getValueForField("AvailabilityZones", String.class);
			Optional<String> loadBalancerNames = autoScalingGroup.getValueForField("LoadBalancerNames", String.class);
			Optional<String> targetGroupARNs = autoScalingGroup.getValueForField("TargetGroupARNs", String.class);
			Optional<List> healthCheckType = autoScalingGroup.getValueForField("HealthCheckType", List.class);
			Optional<String> healthCheckGracePeriod = autoScalingGroup.getValueForField("HealthCheckGracePeriod", String.class);
			Optional<String> instances = autoScalingGroup.getValueForField("Instances", String.class);
			Optional<String> createdTime = autoScalingGroup.getValueForField("CreatedTime", String.class);
			Optional<String> suspendedProcesses = autoScalingGroup.getValueForField("SuspendedProcesses", String.class);
			Optional<String> placementGroup = autoScalingGroup.getValueForField("PlacementGroup", String.class);
			Optional<String> vPCZoneIdentifier = autoScalingGroup.getValueForField("VPCZoneIdentifier", String.class);
			Optional<String> enabledMetrics = autoScalingGroup.getValueForField("EnabledMetrics", String.class);
			Optional<String> status = autoScalingGroup.getValueForField("Status", String.class);
			Optional<String> tags = autoScalingGroup.getValueForField("Tags", String.class);
			Optional<String> terminationPolicies = autoScalingGroup.getValueForField("TerminationPolicies", String.class);
			Optional<String> newInstancesProtectedFromScaleIn = autoScalingGroup.getValueForField("NewInstancesProtectedFromScaleIn", String.class);
			Optional<String> serviceLinkedRoleARN = autoScalingGroup.getValueForField("ServiceLinkedRoleARN", String.class);
			Optional<String> maxInstanceLifetime = autoScalingGroup.getValueForField("MaxInstanceLifetime", String.class);
			Optional<String> warmPoolConfiguration = autoScalingGroup.getValueForField("WarmPoolConfiguration", String.class);
			Optional<String> warmPoolSize = autoScalingGroup.getValueForField("WarmPoolSize", String.class);
			Optional<String> context = autoScalingGroup.getValueForField("Context", String.class);
			
			
			com.synectiks.aws.entities.ec2.AutoScalingGroup AutoScalingGroup = new com.synectiks.aws.entities.ec2.AutoScalingGroup();
	
//			xformS3RDSEntity.setAddress(null);
			if (autoScalingGroupName.isPresent()) {
//				AutoScalingGroup.setAutoScalingGroupName(autoScalingGroupName.get());
			}
			if (autoScalingGroupARN.isPresent()) {
//				AutoScalingGroup.setAutoScalingGroupARN(autoScalingGroupARN.get());
			}
			if (launchConfigurationName.isPresent()) {
//				AutoScalingGroup.setlAunchConfigurationName(launchConfigurationName.get());
			}
			if (autoScalingGroupName.isPresent()) {
//				AutoScalingGroup.setAutoScalingGroupName(autoScalingGroupName.get());
			}
			if (launchTemplate.isPresent()) {
//				AutoScalingGroup.setLaunchTemplate(launchTemplate.get());
			}
			if (mixedInstancesPolicy.isPresent()) {
//				AutoScalingGroup.setMixedInstancesPolicy(mixedInstancesPolicy.get());
			}
			if (minSize.isPresent()) {
//				AutoScalingGroup.setMinSize(minSize.get());
			}
			if (desiredCapacity.isPresent()) {
//				AutoScalingGroup.setDesiredCapacity(desiredCapacity.get());
			}
			if (predictedCapacity.isPresent()) {
//				AutoScalingGroup.setPredictedCapacity(predictedCapacity.get());
			}
			if (defaultCooldown.isPresent()) {
				AutoScalingGroup.setDefaultCooldown(defaultCooldown.get());
			}
			if (availabilityZones.isPresent()) {
//				AutoScalingGroup.setAvailabilityZones(availabilityZones.get());
			}
			if (loadBalancerNames.isPresent()) {
//				AutoScalingGroup.setLoadBalancerNames(loadBalancerNames.get());
			}
			if (targetGroupARNs.isPresent()) {
//				AutoScalingGroup.setTargetGroupARNs(targetGroupARNs.get());
			}
			if (healthCheckType.isPresent()) {
//				AutoScalingGroup.setHealthCheckType(healthCheckType.get());
			}
			if (healthCheckGracePeriod.isPresent()) {
//				AutoScalingGroup.setHealthCheckGracePeriod(healthCheckGracePeriod.get());
			}
			if (instances.isPresent()) {
//				AutoScalingGroup.setInstances(instances.get());
			}
			if (createdTime.isPresent()) {
//				AutoScalingGroup.setCreatedTime(createdTime.get());
			}
			if (suspendedProcesses.isPresent()) {
//				AutoScalingGroup.setSuspendedProcesses(suspendedProcesses.get());
			}
			if (placementGroup.isPresent()) {
//				AutoScalingGroup.setPlacementGroup(placementGroup.get());
			}
			if (vPCZoneIdentifier.isPresent()) {
//				AutoScalingGroup.setvPCZoneIdentifier(vPCZoneIdentifier.get());
			}
			if (enabledMetrics.isPresent()) {
//				AutoScalingGroup.setEnabledMetrics(enabledMetrics.get());
			}
			if (status.isPresent()) {
//				AutoScalingGroup.setStatus(status.get());
			}
			if (tags.isPresent()) {
//				AutoScalingGroup.setTags(tags.get());
			}
			if (terminationPolicies.isPresent()) {
//				AutoScalingGroup.setTerminationPolicies(terminationPolicies.get());
			}
			if (newInstancesProtectedFromScaleIn.isPresent()) {
//				AutoScalingGroup.setNewInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn.get());
			}
			if (serviceLinkedRoleARN.isPresent()) {
				AutoScalingGroup.setServiceLinkedRoleARN(serviceLinkedRoleARN.get());
			}
			if (maxInstanceLifetime.isPresent()) {
//				AutoScalingGroup.setMaxInstanceLifetime(maxInstanceLifetime.get());
			}
			if (warmPoolConfiguration.isPresent()) {
//				AutoScalingGroup.setWarmPoolConfiguration(warmPoolConfiguration.get());
			}
			if (warmPoolSize.isPresent()) {
//				AutoScalingGroup.setWarmPoolSize(warmPoolSize.get());
			}
			if (context.isPresent()) {
//				AutoScalingGroup.setContext(context.get());
			}
			
			
			
		}
		return null;
	}

}
