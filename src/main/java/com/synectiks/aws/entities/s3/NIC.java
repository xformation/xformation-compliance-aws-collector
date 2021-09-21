package com.synectiks.aws.entities.s3;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NIC implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Subnet subnet;
	private List<SecurityGroup> securityGroups;

	@JsonProperty("subnet")
	public Subnet getSubnet() {
		return subnet;
	}

	@JsonProperty("subnet")
	public void setSubnet(Subnet value) {
		this.subnet = value;
	}

	@JsonProperty("securityGroups")
	public List<SecurityGroup> getSecurityGroups() {
		return securityGroups;
	}

	@JsonProperty("securityGroups")
	public void setSecurityGroups(List<SecurityGroup> value) {
		this.securityGroups = value;
	}

	@Override
	public String toString() {
		return "NIC [subnet=" + subnet + ", securityGroups=" + securityGroups + "]";
	}

}
