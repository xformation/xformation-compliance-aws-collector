package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.common.Tag;

public class NodeGroup implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nodegroupName;
	private String status;
	private String version;
	private String releaseVersion;
	private Health health;
	private String createdAt;
	private String nodeRole;
	private String nodegroupArn;
	private String clusterName;
	private String amiType;
	private String diskSize;
	private ScalingConfig scalingConfig;
	private Resources resources;
	private RemoteAccess remoteAccess;
	private PublicAccessCIDR[] instanceTypes;
	private PublicAccessCIDR[] subnets;
	private List<Tag> tags;
	private List<Tag> labels;

	@JsonProperty("nodegroupName")
	public String getNodegroupName() {
		return nodegroupName;
	}

	@JsonProperty("nodegroupName")
	public void setNodegroupName(String value) {
		this.nodegroupName = value;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String value) {
		this.status = value;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String value) {
		this.version = value;
	}

	@JsonProperty("releaseVersion")
	public String getReleaseVersion() {
		return releaseVersion;
	}

	@JsonProperty("releaseVersion")
	public void setReleaseVersion(String value) {
		this.releaseVersion = value;
	}

	@JsonProperty("health")
	public Health getHealth() {
		return health;
	}

	@JsonProperty("health")
	public void setHealth(Health value) {
		this.health = value;
	}

	@JsonProperty("createdAt")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("createdAt")
	public void setCreatedAt(String value) {
		this.createdAt = value;
	}

	@JsonProperty("nodeRole")
	public String getNodeRole() {
		return nodeRole;
	}

	@JsonProperty("nodeRole")
	public void setNodeRole(String value) {
		this.nodeRole = value;
	}

	@JsonProperty("nodegroupArn")
	public String getNodegroupArn() {
		return nodegroupArn;
	}

	@JsonProperty("nodegroupArn")
	public void setNodegroupArn(String value) {
		this.nodegroupArn = value;
	}

	@JsonProperty("clusterName")
	public String getClusterName() {
		return clusterName;
	}

	@JsonProperty("clusterName")
	public void setClusterName(String value) {
		this.clusterName = value;
	}

	@JsonProperty("amiType")
	public String getAmiType() {
		return amiType;
	}

	@JsonProperty("amiType")
	public void setAmiType(String value) {
		this.amiType = value;
	}

	@JsonProperty("diskSize")
	public String getDiskSize() {
		return diskSize;
	}

	@JsonProperty("diskSize")
	public void setDiskSize(String value) {
		this.diskSize = value;
	}

	@JsonProperty("scalingConfig")
	public ScalingConfig getScalingConfig() {
		return scalingConfig;
	}

	@JsonProperty("scalingConfig")
	public void setScalingConfig(ScalingConfig value) {
		this.scalingConfig = value;
	}

	@JsonProperty("resources")
	public Resources getResources() {
		return resources;
	}

	@JsonProperty("resources")
	public void setResources(Resources value) {
		this.resources = value;
	}

	@JsonProperty("remoteAccess")
	public RemoteAccess getRemoteAccess() {
		return remoteAccess;
	}

	@JsonProperty("remoteAccess")
	public void setRemoteAccess(RemoteAccess value) {
		this.remoteAccess = value;
	}

	@JsonProperty("instanceTypes")
	public PublicAccessCIDR[] getInstanceTypes() {
		return instanceTypes;
	}

	@JsonProperty("instanceTypes")
	public void setInstanceTypes(PublicAccessCIDR[] value) {
		this.instanceTypes = value;
	}

	@JsonProperty("subnets")
	public PublicAccessCIDR[] getSubnets() {
		return subnets;
	}

	@JsonProperty("subnets")
	public void setSubnets(PublicAccessCIDR[] value) {
		this.subnets = value;
	}

	@JsonProperty("tags")
	public List<Tag> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<Tag> value) {
		this.tags = value;
	}

	@JsonProperty("labels")
	public List<Tag> getLabels() {
		return labels;
	}

	@JsonProperty("labels")
	public void setLabels(List<Tag> value) {
		this.labels = value;
	}

	@Override
	public String toString() {
		return "NodeGroup [nodegroupName=" + nodegroupName + ", status=" + status + ", version=" + version
				+ ", releaseVersion=" + releaseVersion + ", health=" + health + ", createdAt=" + createdAt
				+ ", nodeRole=" + nodeRole + ", nodegroupArn=" + nodegroupArn + ", clusterName=" + clusterName
				+ ", amiType=" + amiType + ", diskSize=" + diskSize + ", scalingConfig=" + scalingConfig
				+ ", resources=" + resources + ", remoteAccess=" + remoteAccess + ", instanceTypes="
				+ Arrays.toString(instanceTypes) + ", subnets=" + Arrays.toString(subnets) + ", tags="
				+ tags + ", labels=" + labels + "]";
	}
}
