package com.synectiks.aws.entities.vpc;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class VpcAttachment implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String state;
    private String vpcID;

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("vpcId")
    public String getVpcID() { return vpcID; }
    @JsonProperty("vpcId")
    public void setVpcID(String value) { this.vpcID = value; }
	@Override
	public String toString() {
		return "VpcAttachment [state=" + state + ", vpcID=" + vpcID + "]";
	}
}
