package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class AssociationElement implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String isMain;
    private String subnetID;

    @JsonProperty("isMain")
    public String getIsMain() { return isMain; }
    @JsonProperty("isMain")
    public void setIsMain(String value) { this.isMain = value; }

    @JsonProperty("subnetId")
    public String getSubnetID() { return subnetID; }
    @JsonProperty("subnetId")
    public void setSubnetID(String value) { this.subnetID = value; }
	@Override
	public String toString() {
		return "AssociationElement [isMain=" + isMain + ", subnetID=" + subnetID + "]";
	}
    
    
}
