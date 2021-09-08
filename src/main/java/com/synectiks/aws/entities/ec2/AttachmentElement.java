package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttachmentElement {
	private String attachTime;
	private String deleteOnTermination;
	private String device;
	private String instanceID;
	private String state;
	private String volumeID;

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

	@JsonProperty("device")
	public String getDevice() {
		return device;
	}

	@JsonProperty("device")
	public void setDevice(String value) {
		this.device = value;
	}

	@JsonProperty("instanceId")
	public String getInstanceID() {
		return instanceID;
	}

	@JsonProperty("instanceId")
	public void setInstanceID(String value) {
		this.instanceID = value;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String value) {
		this.state = value;
	}

	@JsonProperty("volumeId")
	public String getVolumeID() {
		return volumeID;
	}

	@JsonProperty("volumeId")
	public void setVolumeID(String value) {
		this.volumeID = value;
	}
}
