package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ElasticIP implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String associationID;
	private String allocationID;

	@JsonProperty("associationId")
	public String getAssociationID() {
		return associationID;
	}

	@JsonProperty("associationId")
	public void setAssociationID(String value) {
		this.associationID = value;
	}

	@JsonProperty("allocationId")
	public String getAllocationID() {
		return allocationID;
	}

	@JsonProperty("allocationId")
	public void setAllocationID(String value) {
		this.allocationID = value;
	}

	@Override
	public String toString() {
		return "ElasticIP [associationID=" + associationID + ", allocationID=" + allocationID + "]";
	}

}
