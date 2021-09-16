package com.synectiks.aws.entities.vpc;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.*;

public class InternetGateway {
    private String externalID;
    private VpcAttachment[] vpcAttachments;
    private String name;

    @JsonProperty("externalId")
    public String getExternalID() { return externalID; }
    @JsonProperty("externalId")
    public void setExternalID(String value) { this.externalID = value; }

    @JsonProperty("vpcAttachments")
    public VpcAttachment[] getVpcAttachments() { return vpcAttachments; }
    @JsonProperty("vpcAttachments")
    public void setVpcAttachments(VpcAttachment[] value) { this.vpcAttachments = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }
	@Override
	public String toString() {
		return "InternetGateway [externalID=" + externalID + ", vpcAttachments=" + Arrays.toString(vpcAttachments)
				+ ", name=" + name + "]";
	}
}
