package com.synectiks.aws.entities.s3;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PropagatingVgw implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String gatewayID;

	@JsonProperty("gatewayId")
	public String getGatewayID() {
		return gatewayID;
	}

	@JsonProperty("gatewayId")
	public void setGatewayID(String value) {
		this.gatewayID = value;
	}

	@Override
	public String toString() {
		return "PropagatingVgw [gatewayID=" + gatewayID + "]";
	}
	
	
	
}
