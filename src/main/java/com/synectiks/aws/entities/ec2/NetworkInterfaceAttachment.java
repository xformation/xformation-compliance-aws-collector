package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkInterfaceAttachment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String attachmentID;
	private String attachTime;
	private String deleteOnTermination;
	private String deviceIndex;
	private String instanceID;
	private String instanceOwnerID;
	private String status;

	@JsonProperty("attachmentId")
	public String getAttachmentID() {
		return attachmentID;
	}

	@JsonProperty("attachmentId")
	public void setAttachmentID(String value) {
		this.attachmentID = value;
	}

	@JsonProperty("attachTime")
	public String getAttachTime() {
		return attachTime;
	}

	@JsonProperty("attachTime")
	public void setAttachTime(String value) {
		this.attachTime = value;
	}

	@JsonProperty("deleteOnTermination")
	public String getDeleteOnTermination() {
		return deleteOnTermination;
	}

	@JsonProperty("deleteOnTermination")
	public void setDeleteOnTermination(String value) {
		this.deleteOnTermination = value;
	}

	@JsonProperty("deviceIndex")
	public String getDeviceIndex() {
		return deviceIndex;
	}

	@JsonProperty("deviceIndex")
	public void setDeviceIndex(String value) {
		this.deviceIndex = value;
	}

	@JsonProperty("instanceId")
	public String getInstanceID() {
		return instanceID;
	}

	@JsonProperty("instanceId")
	public void setInstanceID(String value) {
		this.instanceID = value;
	}

	@JsonProperty("instanceOwnerId")
	public String getInstanceOwnerID() {
		return instanceOwnerID;
	}

	@JsonProperty("instanceOwnerId")
	public void setInstanceOwnerID(String value) {
		this.instanceOwnerID = value;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String value) {
		this.status = value;
	}

	@Override
	public String toString() {
		return "NetworkInterfaceAttachment [attachmentID=" + attachmentID + ", attachTime=" + attachTime
				+ ", deleteOnTermination=" + deleteOnTermination + ", deviceIndex=" + deviceIndex + ", instanceID="
				+ instanceID + ", instanceOwnerID=" + instanceOwnerID + ", status=" + status + "]";
	}
}
