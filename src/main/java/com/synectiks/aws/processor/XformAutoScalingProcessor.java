package com.synectiks.aws.processor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.autoscaling.AutoScalingClient;
import software.amazon.awssdk.services.autoscaling.model.AutoScalingGroup;
import software.amazon.awssdk.services.autoscaling.model.AutoScalingInstanceDetails;
import software.amazon.awssdk.services.autoscaling.model.DescribeAutoScalingGroupsResponse;
import software.amazon.awssdk.services.autoscaling.model.DescribeAutoScalingInstancesRequest;
import software.amazon.awssdk.services.autoscaling.model.DescribeAutoScalingInstancesResponse;
import software.amazon.awssdk.services.autoscaling.model.LaunchTemplateSpecification;
import software.amazon.awssdk.services.autoscaling.model.MixedInstancesPolicy;
import software.amazon.awssdk.services.autoscaling.model.WarmPoolConfiguration;

public class XformAutoScalingProcessor extends XformAwsProcessor {

	private static final Logger logger = LoggerFactory.getLogger(XformAutoScalingProcessor.class);
	
	public XformAutoScalingProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
	}

	@Override
	public List<AutoScalingGroup> getCloudObject() throws Exception {
		AutoScalingClient client = AutoScalingClient
									.builder()
									.credentialsProvider(awsCredentialsProvider)
									.region(region)
									.build();
		DescribeAutoScalingGroupsResponse response=client.describeAutoScalingGroups();
		List<AutoScalingGroup> autoScalingGroups=response.autoScalingGroups();
		return autoScalingGroups;
	}
	
	@Override
	public List<com.synectiks.aws.entities.autoscaling.AutoScalingGroup> getXformObject() throws Exception {
		XformAutoScalingProcessor xformAutoScalingProcessor = new XformAutoScalingProcessor(getAccessKey(), getSecretKey(), getRegionAsText()); 
		List<AutoScalingGroup>  autoScalingGroups = xformAutoScalingProcessor.getCloudObject();
		
		List<com.synectiks.aws.entities.autoscaling.AutoScalingGroup> autoScalingGroupsList = new ArrayList<>();
		
		for (AutoScalingGroup awsAutoScalingGroup : autoScalingGroups) {
			Optional<String> autoScalingGroupName = awsAutoScalingGroup.getValueForField("AutoScalingGroupName", String.class);
			Optional<String> autoScalingGroupARN = awsAutoScalingGroup.getValueForField("AutoScalingGroupARN", String.class);
			Optional<String> launchConfigurationName = awsAutoScalingGroup.getValueForField("LaunchConfigurationName", String.class);
			Optional<LaunchTemplateSpecification> launchTemplate = awsAutoScalingGroup.getValueForField("LaunchTemplate", LaunchTemplateSpecification.class);
			Optional<MixedInstancesPolicy> mixedInstancesPolicy = awsAutoScalingGroup.getValueForField("MixedInstancesPolicy", MixedInstancesPolicy.class);
			Optional<Integer> minSize = awsAutoScalingGroup.getValueForField("MinSize", Integer.class);
			Optional<Integer> maxSize = awsAutoScalingGroup.getValueForField("MaxSize", Integer.class);
			Optional<Integer> desiredCapacity = awsAutoScalingGroup.getValueForField("DesiredCapacity", Integer.class);
			Optional<Integer> predictedCapacity = awsAutoScalingGroup.getValueForField("PredictedCapacity", Integer.class);
			Optional<Integer> defaultCooldown = awsAutoScalingGroup.getValueForField("DefaultCooldown", Integer.class);
			Optional<List> availabilityZones = awsAutoScalingGroup.getValueForField("AvailabilityZones", List.class);
			Optional<List> loadBalancerNames = awsAutoScalingGroup.getValueForField("LoadBalancerNames", List.class);
			Optional<List> targetGroupARNs = awsAutoScalingGroup.getValueForField("TargetGroupARNs", List.class);
			Optional<List> healthCheckType = awsAutoScalingGroup.getValueForField("HealthCheckType", List.class);
			Optional<Integer> healthCheckGracePeriod = awsAutoScalingGroup.getValueForField("HealthCheckGracePeriod", Integer.class);
			Optional<List> instances = awsAutoScalingGroup.getValueForField("Instances", List.class);
			Optional<Instant> createdTime = awsAutoScalingGroup.getValueForField("CreatedTime", Instant.class);
			Optional<List> suspendedProcesses = awsAutoScalingGroup.getValueForField("SuspendedProcesses", List.class);
			Optional<String> placementGroup = awsAutoScalingGroup.getValueForField("PlacementGroup", String.class);
			Optional<String> vPCZoneIdentifier = awsAutoScalingGroup.getValueForField("VPCZoneIdentifier", String.class);
			Optional<List> enabledMetrics = awsAutoScalingGroup.getValueForField("EnabledMetrics", List.class);
			Optional<String> status = awsAutoScalingGroup.getValueForField("Status", String.class);
			Optional<List> tags = awsAutoScalingGroup.getValueForField("Tags", List.class);
			Optional<List> terminationPolicies = awsAutoScalingGroup.getValueForField("TerminationPolicies", List.class);
			Optional<Boolean> newInstancesProtectedFromScaleIn = awsAutoScalingGroup.getValueForField("NewInstancesProtectedFromScaleIn", Boolean.class);
			Optional<String> serviceLinkedRoleARN = awsAutoScalingGroup.getValueForField("ServiceLinkedRoleARN", String.class);
			Optional<Integer> maxInstanceLifetime = awsAutoScalingGroup.getValueForField("MaxInstanceLifetime", Integer.class);
			Optional<Boolean> capacityRebalance = awsAutoScalingGroup.getValueForField("CapacityRebalance", Boolean.class);
			Optional<WarmPoolConfiguration> warmPoolConfiguration = awsAutoScalingGroup.getValueForField("WarmPoolConfiguration", WarmPoolConfiguration.class);
			Optional<Integer> warmPoolSize = awsAutoScalingGroup.getValueForField("WarmPoolSize", Integer.class);
			Optional<String> context = awsAutoScalingGroup.getValueForField("Context", String.class);
			
			com.synectiks.aws.entities.autoscaling.AutoScalingGroup xformEc2AutoScalingGroup = new com.synectiks.aws.entities.autoscaling.AutoScalingGroup();
			
			if (autoScalingGroupName.isPresent()) {
				xformEc2AutoScalingGroup.setAutoScalingGroupName(autoScalingGroupName.get());
			}
			if (autoScalingGroupARN.isPresent()) {
				xformEc2AutoScalingGroup.setAutoScalingGroupARN(autoScalingGroupARN.get());
			}
			if (launchConfigurationName.isPresent()) {
				xformEc2AutoScalingGroup.setLaunchConfigurationName(launchConfigurationName.get());
			}

			if (launchTemplate.isPresent()) {
				xformEc2AutoScalingGroup.setLaunchTemplate(launchTemplate.get());
			}
			if (mixedInstancesPolicy.isPresent()) {
				xformEc2AutoScalingGroup.setMixedInstancesPolicy(mixedInstancesPolicy.get());
			}
			if (minSize.isPresent()) {
				xformEc2AutoScalingGroup.setMinSize(minSize.get());
			}
			if (maxSize.isPresent()) {
				xformEc2AutoScalingGroup.setMaxSize(maxSize.get());
			}
			if (desiredCapacity.isPresent()) {
				xformEc2AutoScalingGroup.setDesiredCapacity(desiredCapacity.get());
			}
			if (predictedCapacity.isPresent()) {
				xformEc2AutoScalingGroup.setPredictedCapacity(predictedCapacity.get());
			}
			if (defaultCooldown.isPresent()) {
				xformEc2AutoScalingGroup.setDefaultCooldown(defaultCooldown.get());
			}
			if (availabilityZones.isPresent()) {
				xformEc2AutoScalingGroup.setAvailabilityZones(availabilityZones.get());
			}
			if (loadBalancerNames.isPresent()) {
				xformEc2AutoScalingGroup.setLoadBalancerNames(loadBalancerNames.get());
			}
			if (targetGroupARNs.isPresent()) {
				xformEc2AutoScalingGroup.setTargetGroupARNs(targetGroupARNs.get());
			}
			if (healthCheckType.isPresent()) {
				xformEc2AutoScalingGroup.setHealthCheckType(healthCheckType.get());
			}
			if (healthCheckGracePeriod.isPresent()) {
				xformEc2AutoScalingGroup.setHealthCheckGracePeriod(healthCheckGracePeriod.get());
			}
			if (instances.isPresent()) {
				xformEc2AutoScalingGroup.setInstances(instances.get());
			}
			if (createdTime.isPresent()) {
				xformEc2AutoScalingGroup.setCreatedTime(createdTime.get());
			}
			if (suspendedProcesses.isPresent()) {
				xformEc2AutoScalingGroup.setSuspendedProcesses(suspendedProcesses.get());
			}
			if (placementGroup.isPresent()) {
				xformEc2AutoScalingGroup.setPlacementGroup(placementGroup.get());
			}
			if (vPCZoneIdentifier.isPresent()) {
				xformEc2AutoScalingGroup.setvPCZoneIdentifier(vPCZoneIdentifier.get());
			}
			if (enabledMetrics.isPresent()) {
				xformEc2AutoScalingGroup.setEnabledMetrics(enabledMetrics.get());
			}
			if (status.isPresent()) {
				xformEc2AutoScalingGroup.setStatus(status.get());
			}
			if (tags.isPresent()) {
				xformEc2AutoScalingGroup.setTags(tags.get());
			}
			if (terminationPolicies.isPresent()) {
				xformEc2AutoScalingGroup.setTerminationPolicies(terminationPolicies.get());
			}
			if (newInstancesProtectedFromScaleIn.isPresent()) {
				xformEc2AutoScalingGroup.setNewInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn.get());
			}
			if (serviceLinkedRoleARN.isPresent()) {
				xformEc2AutoScalingGroup.setServiceLinkedRoleARN(serviceLinkedRoleARN.get());
			}
			if (maxInstanceLifetime.isPresent()) {
				xformEc2AutoScalingGroup.setMaxInstanceLifetime(maxInstanceLifetime.get());
			}
			if(capacityRebalance.isPresent()) {
				xformEc2AutoScalingGroup.setCapacityRebalance(capacityRebalance.get());
			}
			if (warmPoolConfiguration.isPresent()) {
				xformEc2AutoScalingGroup.setWarmPoolConfiguration(warmPoolConfiguration.get());
			}
			if (warmPoolSize.isPresent()) {
				xformEc2AutoScalingGroup.setWarmPoolSize(warmPoolSize.get());
			}
			if (context.isPresent()) {
				xformEc2AutoScalingGroup.setContext(context.get());
			}
			autoScalingGroupsList.add(xformEc2AutoScalingGroup);
			
		}
		return autoScalingGroupsList;
	}
	
	public List<AutoScalingInstanceDetails> getAwsEc2AutScaling(String instanceId) throws Exception {
		AutoScalingClient client = AutoScalingClient
									.builder()
									.credentialsProvider(awsCredentialsProvider)
									.region(region)
									.build();
		DescribeAutoScalingInstancesRequest req = DescribeAutoScalingInstancesRequest
																.builder()
																.instanceIds(instanceId) 
																.build();
		DescribeAutoScalingInstancesResponse response = client.describeAutoScalingInstances(req);
		List<AutoScalingInstanceDetails> autoScalingInstanceDetails = response.autoScalingInstances();
		return autoScalingInstanceDetails;
	}
	
	public List<AutoScalingInstanceDetails> getAwsEc2AutScaling() throws Exception {
		AutoScalingClient client = AutoScalingClient
									.builder()
									.credentialsProvider(awsCredentialsProvider)
									.region(region)
									.build();
		DescribeAutoScalingInstancesRequest req = DescribeAutoScalingInstancesRequest
																.builder()
																.build();
		DescribeAutoScalingInstancesResponse response = client.describeAutoScalingInstances(req);
		List<AutoScalingInstanceDetails> autoScalingInstanceDetails = response.autoScalingInstances();
		return autoScalingInstanceDetails;
	}

	@Override
	protected <T> T getXformObjectById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
