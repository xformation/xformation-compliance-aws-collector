package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SsmAgentInstanceInformation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String activationID;
	private String agentVersion;
	private AssociationOverview associationOverview;
	private String associationStatus;
	private String computerName;
	private String iamRole;
	private String instanceID;
	private String ipAddress;
	private String isLatestVersion;
	private String lastAssociationExecutionDate;
	private String lastPingDateTime;
	private String lastSuccessfulAssociationExecutionDate;
	private String name;
	private String pingStatus;
	private String platformName;
	private String platformType;
	private String platformVersion;
	private String registrationDate;
	private String resourceType;

	@JsonProperty("activationId")
	public String getActivationID() {
		return activationID;
	}

	@JsonProperty("activationId")
	public void setActivationID(String value) {
		this.activationID = value;
	}

	@JsonProperty("agentVersion")
	public String getAgentVersion() {
		return agentVersion;
	}

	@JsonProperty("agentVersion")
	public void setAgentVersion(String value) {
		this.agentVersion = value;
	}

	@JsonProperty("associationOverview")
	public AssociationOverview getAssociationOverview() {
		return associationOverview;
	}

	@JsonProperty("associationOverview")
	public void setAssociationOverview(AssociationOverview value) {
		this.associationOverview = value;
	}

	@JsonProperty("associationStatus")
	public String getAssociationStatus() {
		return associationStatus;
	}

	@JsonProperty("associationStatus")
	public void setAssociationStatus(String value) {
		this.associationStatus = value;
	}

	@JsonProperty("computerName")
	public String getComputerName() {
		return computerName;
	}

	@JsonProperty("computerName")
	public void setComputerName(String value) {
		this.computerName = value;
	}

	@JsonProperty("iamRole")
	public String getIamRole() {
		return iamRole;
	}

	@JsonProperty("iamRole")
	public void setIamRole(String value) {
		this.iamRole = value;
	}

	@JsonProperty("instanceId")
	public String getInstanceID() {
		return instanceID;
	}

	@JsonProperty("instanceId")
	public void setInstanceID(String value) {
		this.instanceID = value;
	}

	@JsonProperty("ipAddress")
	public String getIPAddress() {
		return ipAddress;
	}

	@JsonProperty("ipAddress")
	public void setIPAddress(String value) {
		this.ipAddress = value;
	}

	@JsonProperty("isLatestVersion")
	public String getIsLatestVersion() {
		return isLatestVersion;
	}

	@JsonProperty("isLatestVersion")
	public void setIsLatestVersion(String value) {
		this.isLatestVersion = value;
	}

	@JsonProperty("lastAssociationExecutionDate")
	public String getLastAssociationExecutionDate() {
		return lastAssociationExecutionDate;
	}

	@JsonProperty("lastAssociationExecutionDate")
	public void setLastAssociationExecutionDate(String value) {
		this.lastAssociationExecutionDate = value;
	}

	@JsonProperty("lastPingDateTime")
	public String getLastPingDateTime() {
		return lastPingDateTime;
	}

	@JsonProperty("lastPingDateTime")
	public void setLastPingDateTime(String value) {
		this.lastPingDateTime = value;
	}

	@JsonProperty("lastSuccessfulAssociationExecutionDate")
	public String getLastSuccessfulAssociationExecutionDate() {
		return lastSuccessfulAssociationExecutionDate;
	}

	@JsonProperty("lastSuccessfulAssociationExecutionDate")
	public void setLastSuccessfulAssociationExecutionDate(String value) {
		this.lastSuccessfulAssociationExecutionDate = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("pingStatus")
	public String getPingStatus() {
		return pingStatus;
	}

	@JsonProperty("pingStatus")
	public void setPingStatus(String value) {
		this.pingStatus = value;
	}

	@JsonProperty("platformName")
	public String getPlatformName() {
		return platformName;
	}

	@JsonProperty("platformName")
	public void setPlatformName(String value) {
		this.platformName = value;
	}

	@JsonProperty("platformType")
	public String getPlatformType() {
		return platformType;
	}

	@JsonProperty("platformType")
	public void setPlatformType(String value) {
		this.platformType = value;
	}

	@JsonProperty("platformVersion")
	public String getPlatformVersion() {
		return platformVersion;
	}

	@JsonProperty("platformVersion")
	public void setPlatformVersion(String value) {
		this.platformVersion = value;
	}

	@JsonProperty("registrationDate")
	public String getRegistrationDate() {
		return registrationDate;
	}

	@JsonProperty("registrationDate")
	public void setRegistrationDate(String value) {
		this.registrationDate = value;
	}

	@JsonProperty("resourceType")
	public String getResourceType() {
		return resourceType;
	}

	@JsonProperty("resourceType")
	public void setResourceType(String value) {
		this.resourceType = value;
	}

	@Override
	public String toString() {
		return "SsmAgentInstanceInformation [activationID=" + activationID + ", agentVersion=" + agentVersion
				+ ", associationOverview=" + associationOverview + ", associationStatus=" + associationStatus
				+ ", computerName=" + computerName + ", iamRole=" + iamRole + ", instanceID=" + instanceID
				+ ", ipAddress=" + ipAddress + ", isLatestVersion=" + isLatestVersion
				+ ", lastAssociationExecutionDate=" + lastAssociationExecutionDate + ", lastPingDateTime="
				+ lastPingDateTime + ", lastSuccessfulAssociationExecutionDate="
				+ lastSuccessfulAssociationExecutionDate + ", name=" + name + ", pingStatus=" + pingStatus
				+ ", platformName=" + platformName + ", platformType=" + platformType + ", platformVersion="
				+ platformVersion + ", registrationDate=" + registrationDate + ", resourceType=" + resourceType + "]";
	}
}
