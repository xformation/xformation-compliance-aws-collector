package com.synectiks.aws.entities.vpc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlowLog {
	private String id;
	private String vpcID;
	private String logGroupName;
	private String statusActive;
	private String trafficType;
	private String creationTime;
	private String deliverLogsErrorMessage;
	private String deliverLogsPermissionArn;
	private String deliverLogsStatus;

	@JsonProperty("id")
	public String getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(String value) {
		this.id = value;
	}

	@JsonProperty("vpcId")
	public String getVpcID() {
		return vpcID;
	}

	@JsonProperty("vpcId")
	public void setVpcID(String value) {
		this.vpcID = value;
	}

	@JsonProperty("logGroupName")
	public String getLogGroupName() {
		return logGroupName;
	}

	@JsonProperty("logGroupName")
	public void setLogGroupName(String value) {
		this.logGroupName = value;
	}

	@JsonProperty("statusActive")
	public String getStatusActive() {
		return statusActive;
	}

	@JsonProperty("statusActive")
	public void setStatusActive(String value) {
		this.statusActive = value;
	}

	@JsonProperty("trafficType")
	public String getTrafficType() {
		return trafficType;
	}

	@JsonProperty("trafficType")
	public void setTrafficType(String value) {
		this.trafficType = value;
	}

	@JsonProperty("creationTime")
	public String getCreationTime() {
		return creationTime;
	}

	@JsonProperty("creationTime")
	public void setCreationTime(String value) {
		this.creationTime = value;
	}

	@JsonProperty("deliverLogsErrorMessage")
	public String getDeliverLogsErrorMessage() {
		return deliverLogsErrorMessage;
	}

	@JsonProperty("deliverLogsErrorMessage")
	public void setDeliverLogsErrorMessage(String value) {
		this.deliverLogsErrorMessage = value;
	}

	@JsonProperty("deliverLogsPermissionArn")
	public String getDeliverLogsPermissionArn() {
		return deliverLogsPermissionArn;
	}

	@JsonProperty("deliverLogsPermissionArn")
	public void setDeliverLogsPermissionArn(String value) {
		this.deliverLogsPermissionArn = value;
	}

	@JsonProperty("deliverLogsStatus")
	public String getDeliverLogsStatus() {
		return deliverLogsStatus;
	}

	@JsonProperty("deliverLogsStatus")
	public void setDeliverLogsStatus(String value) {
		this.deliverLogsStatus = value;
	}
}
