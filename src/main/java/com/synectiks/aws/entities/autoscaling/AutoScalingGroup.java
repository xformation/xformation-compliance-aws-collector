package com.synectiks.aws.entities.autoscaling;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import software.amazon.awssdk.services.autoscaling.model.LaunchTemplateSpecification;
import software.amazon.awssdk.services.autoscaling.model.MixedInstancesPolicy;
import software.amazon.awssdk.services.autoscaling.model.WarmPoolConfiguration;

public class AutoScalingGroup implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String region;
	private String launchConfigurationName;
	private Integer minSize;
	private Integer maxSize;
	private Integer desiredCapacity;
	private Integer defaultCooldown;
	private String launchTemplateName;
	private String vpcZoneIdentifier;
	private String newInstanceProtectedFromScaleIn;
	private String serviceLinkedRoleARN;

	private String autoScalingGroupName;
	private String autoScalingGroupARN;
	private LaunchTemplateSpecification launchTemplate;
	private MixedInstancesPolicy mixedInstancesPolicy;
	private Integer predictedCapacity;
	private List availabilityZones;
	private List loadBalancerNames;
	private List targetGroupARNs;
	private List healthCheckType;
	private Integer healthCheckGracePeriod;
	private List instances;
	private Instant createdTime;
	private List suspendedProcesses;
	private String placementGroup;
	private String vPCZoneIdentifier;
	private List enabledMetrics;
	private String status;
	private List tags;
	private List terminationPolicies;
	private Boolean newInstancesProtectedFromScaleIn;
	private Integer maxInstanceLifetime;
	private Boolean capacityRebalance;
	private WarmPoolConfiguration warmPoolConfiguration;
	private Integer warmPoolSize;
	private String context;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	@JsonProperty("region")
	public void setRegion(String value) {
		this.region = value;
	}

	@JsonProperty("launchConfigurationName")
	public String getLaunchConfigurationName() {
		return launchConfigurationName;
	}

	@JsonProperty("launchConfigurationName")
	public void setLaunchConfigurationName(String value) {
		this.launchConfigurationName = value;
	}

	@JsonProperty("minSize")
	public Integer getMinSize() {
		return minSize;
	}

	@JsonProperty("minSize")
	public void setMinSize(Integer value) {
		this.minSize = value;
	}

	@JsonProperty("maxSize")
	public Integer getMaxSize() {
		return maxSize;
	}

	@JsonProperty("maxSize")
	public void setMaxSize(Integer value) {
		this.maxSize = value;
	}

	@JsonProperty("desiredCapacity")
	public Integer getDesiredCapacity() {
		return desiredCapacity;
	}

	@JsonProperty("desiredCapacity")
	public void setDesiredCapacity(Integer value) {
		this.desiredCapacity = value;
	}

	@JsonProperty("defaultCooldown")
	public Integer getDefaultCooldown() {
		return defaultCooldown;
	}

	@JsonProperty("defaultCooldown")
	public void setDefaultCooldown(Integer value) {
		this.defaultCooldown = value;
	}

	@JsonProperty("launchTemplateName")
	public String getLaunchTemplateName() {
		return launchTemplateName;
	}

	@JsonProperty("launchTemplateName")
	public void setLaunchTemplateName(String value) {
		this.launchTemplateName = value;
	}

	@JsonProperty("vpcZoneIdentifier")
	public String getVpcZoneIdentifier() {
		return vpcZoneIdentifier;
	}

	@JsonProperty("vpcZoneIdentifier")
	public void setVpcZoneIdentifier(String value) {
		this.vpcZoneIdentifier = value;
	}

	@JsonProperty("newInstanceProtectedFromScaleIn")
	public String getNewInstanceProtectedFromScaleIn() {
		return newInstanceProtectedFromScaleIn;
	}

	@JsonProperty("newInstanceProtectedFromScaleIn")
	public void setNewInstanceProtectedFromScaleIn(String value) {
		this.newInstanceProtectedFromScaleIn = value;
	}

	@JsonProperty("serviceLinkedRoleARN")
	public String getServiceLinkedRoleARN() {
		return serviceLinkedRoleARN;
	}

	@JsonProperty("serviceLinkedRoleARN")
	public void setServiceLinkedRoleARN(String value) {
		this.serviceLinkedRoleARN = value;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("autoScalingGroupName")
	public String getAutoScalingGroupName() {
		return autoScalingGroupName;
	}

	@JsonProperty("autoScalingGroupName")
	public void setAutoScalingGroupName(String autoScalingGroupName) {
		this.autoScalingGroupName = autoScalingGroupName;
	}

	@JsonProperty("autoScalingGroupARN")
	public String getAutoScalingGroupARN() {
		return autoScalingGroupARN;
	}

	@JsonProperty("autoScalingGroupARN")
	public void setAutoScalingGroupARN(String autoScalingGroupARN) {
		this.autoScalingGroupARN = autoScalingGroupARN;
	}

	@JsonProperty("launchTemplate")
	public LaunchTemplateSpecification getLaunchTemplate() {
		return launchTemplate;
	}

	@JsonProperty("launchTemplate")
	public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
		this.launchTemplate = launchTemplate;
	}

	@JsonProperty("mixedInstancesPolicy")
	public MixedInstancesPolicy getMixedInstancesPolicy() {
		return mixedInstancesPolicy;
	}

	@JsonProperty("mixedInstancesPolicy")
	public void setMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
		this.mixedInstancesPolicy = mixedInstancesPolicy;
	}

	@JsonProperty("predictedCapacity")
	public Integer getPredictedCapacity() {
		return predictedCapacity;
	}

	@JsonProperty("predictedCapacity")
	public void setPredictedCapacity(Integer predictedCapacity) {
		this.predictedCapacity = predictedCapacity;
	}

	@JsonProperty("availabilityZones")
	public List getAvailabilityZones() {
		return availabilityZones;
	}

	@JsonProperty("availabilityZones")
	public void setAvailabilityZones(List availabilityZones) {
		this.availabilityZones = availabilityZones;
	}

	@JsonProperty("loadBalancerNames")
	public List getLoadBalancerNames() {
		return loadBalancerNames;
	}
	
	@JsonProperty("loadBalancerNames")
	public void setLoadBalancerNames(List loadBalancerNames) {
		this.loadBalancerNames = loadBalancerNames;
	}

	@JsonProperty("targetGroupARNs")
	public List getTargetGroupARNs() {
		return targetGroupARNs;
	}

	@JsonProperty("targetGroupARNs")
	public void setTargetGroupARNs(List targetGroupARNs) {
		this.targetGroupARNs = targetGroupARNs;
	}

	@JsonProperty("healthCheckType")
	public List getHealthCheckType() {
		return healthCheckType;
	}

	@JsonProperty("healthCheckType")
	public void setHealthCheckType(List healthCheckType) {
		this.healthCheckType = healthCheckType;
	}

	@JsonProperty("healthCheckGracePeriod")
	public Integer getHealthCheckGracePeriod() {
		return healthCheckGracePeriod;
	}

	@JsonProperty("healthCheckGracePeriod")
	public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
		this.healthCheckGracePeriod = healthCheckGracePeriod;
	}

	@JsonProperty("instances")
	public List getInstances() {
		return instances;
	}

	@JsonProperty("instances")
	public void setInstances(List instances) {
		this.instances = instances;
	}

	@JsonProperty("createdTime")
	public Instant getCreatedTime() {
		return createdTime;
	}

	@JsonProperty("createdTime")
	public void setCreatedTime(Instant createdTime) {
		this.createdTime = createdTime;
	}

	@JsonProperty("suspendedProcesses")
	public List getSuspendedProcesses() {
		return suspendedProcesses;
	}

	@JsonProperty("suspendedProcesses")
	public void setSuspendedProcesses(List suspendedProcesses) {
		this.suspendedProcesses = suspendedProcesses;
	}

	@JsonProperty("placementGroup")
	public String getPlacementGroup() {
		return placementGroup;
	}

	@JsonProperty("placementGroup")
	public void setPlacementGroup(String placementGroup) {
		this.placementGroup = placementGroup;
	}

	@JsonProperty("vPCZoneIdentifier")
	public String getvPCZoneIdentifier() {
		return vPCZoneIdentifier;
	}

	@JsonProperty("vPCZoneIdentifier")
	public void setvPCZoneIdentifier(String vPCZoneIdentifier) {
		this.vPCZoneIdentifier = vPCZoneIdentifier;
	}

	@JsonProperty("enabledMetrics")
	public List getEnabledMetrics() {
		return enabledMetrics;
	}

	@JsonProperty("enabledMetrics")
	public void setEnabledMetrics(List enabledMetrics) {
		this.enabledMetrics = enabledMetrics;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("tags")
	public List getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List tags) {
		this.tags = tags;
	}

	@JsonProperty("terminationPolicies")
	public List getTerminationPolicies() {
		return terminationPolicies;
	}

	@JsonProperty("terminationPolicies")
	public void setTerminationPolicies(List terminationPolicies) {
		this.terminationPolicies = terminationPolicies;
	}

	@JsonProperty("newInstancesProtectedFromScaleIn")
	public Boolean getNewInstancesProtectedFromScaleIn() {
		return newInstancesProtectedFromScaleIn;
	}

	@JsonProperty("newInstancesProtectedFromScaleIn")
	public void setNewInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
		this.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
	}

	@JsonProperty("maxInstanceLifetime")
	public Integer getMaxInstanceLifetime() {
		return maxInstanceLifetime;
	}

	@JsonProperty("maxInstanceLifetime")
	public void setMaxInstanceLifetime(Integer maxInstanceLifetime) {
		this.maxInstanceLifetime = maxInstanceLifetime;
	}

	@JsonProperty("capacityRebalance")
	public Boolean getCapacityRebalance() {
		return capacityRebalance;
	}

	@JsonProperty("capacityRebalance")
	public void setCapacityRebalance(Boolean capacityRebalance) {
		this.capacityRebalance = capacityRebalance;
	}

	@JsonProperty("warmPoolConfiguration")
	public WarmPoolConfiguration getWarmPoolConfiguration() {
		return warmPoolConfiguration;
	}

	@JsonProperty("warmPoolConfiguration")
	public void setWarmPoolConfiguration(WarmPoolConfiguration warmPoolConfiguration) {
		this.warmPoolConfiguration = warmPoolConfiguration;
	}

	@JsonProperty("warmPoolSize")
	public Integer getWarmPoolSize() {
		return warmPoolSize;
	}

	@JsonProperty("warmPoolSize")
	public void setWarmPoolSize(Integer warmPoolSize) {
		this.warmPoolSize = warmPoolSize;
	}

	@JsonProperty("context")
	public String getContext() {
		return context;
	}

	@JsonProperty("context")
	public void setContext(String context) {
		this.context = context;
	}

	
}
