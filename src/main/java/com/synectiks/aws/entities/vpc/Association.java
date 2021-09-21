package com.synectiks.aws.entities.vpc;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Association implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String isMain;
	private String subnetID;

	@JsonProperty("isMain")
	public String getIsMain() {
		return isMain;
	}

	@JsonProperty("isMain")
	public void setIsMain(String value) {
		this.isMain = value;
	}

	@JsonProperty("subnetId")
	public String getSubnetID() {
		return subnetID;
	}

	@JsonProperty("subnetId")
	public void setSubnetID(String value) {
		this.subnetID = value;
	}

	@Override
	public String toString() {
		return "Association [isMain=" + isMain + ", subnetID=" + subnetID + "]";
	}
}
