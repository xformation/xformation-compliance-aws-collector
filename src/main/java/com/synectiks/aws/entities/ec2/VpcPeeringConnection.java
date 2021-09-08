package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VpcPeeringConnection {
	private String vpcPeeringConnectionID;
	private TargetVpc targetVpc;
	private Stat status;
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
	public Stat getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Stat value) {
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
}
