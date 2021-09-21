package com.synectiks.aws.entities.lambda;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InternetGateway implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String externalID;
	private List<VpcAttachment> vpcAttachments;
	private String name;

	@JsonProperty("externalId")
	public String getExternalID() {
		return externalID;
	}

	@JsonProperty("externalId")
	public void setExternalID(String value) {
		this.externalID = value;
	}

	@JsonProperty("vpcAttachments")
	public List<VpcAttachment> getVpcAttachments() {
		return vpcAttachments;
	}

	@JsonProperty("vpcAttachments")
	public void setVpcAttachments(List<VpcAttachment> value) {
		this.vpcAttachments = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@Override
	public String toString() {
		return "InternetGateway [externalID=" + externalID + ", vpcAttachments=" + vpcAttachments + ", name=" + name
				+ "]";
	}
}
