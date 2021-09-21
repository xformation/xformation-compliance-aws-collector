package com.synectiks.aws.entities.s3;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VpcPeeringConnection implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vpcPeeringConnectionID;
	private TargetVpc targetVpc;
	private Status status;
	private String expirationTime;

	@JsonProperty("vpcPeeringConnectionId")
	public String getVpcPeeringConnectionID() {
		return vpcPeeringConnectionID;
	}

	@JsonProperty("vpcPeeringConnectionId")
	public void setVpcPeeringConnectionID(String value) {
		this.vpcPeeringConnectionID = value;
	}

	@JsonProperty("targetVpc")
	public TargetVpc getTargetVpc() {
		return targetVpc;
	}

	@JsonProperty("targetVpc")
	public void setTargetVpc(TargetVpc value) {
		this.targetVpc = value;
	}

	@JsonProperty("status")
	public Status getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Status value) {
		this.status = value;
	}

	@JsonProperty("expirationTime")
	public String getExpirationTime() {
		return expirationTime;
	}

	@JsonProperty("expirationTime")
	public void setExpirationTime(String value) {
		this.expirationTime = value;
	}

	@Override
	public String toString() {
		return "VpcPeeringConnection [vpcPeeringConnectionID=" + vpcPeeringConnectionID + ", targetVpc=" + targetVpc
				+ ", status=" + status + ", expirationTime=" + expirationTime + "]";
	}
}
