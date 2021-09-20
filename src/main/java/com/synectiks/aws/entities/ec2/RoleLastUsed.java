package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class RoleLastUsed implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String lastUsedDate;
    private String region;

    @JsonProperty("lastUsedDate")
    public String getLastUsedDate() { return lastUsedDate; }
    @JsonProperty("lastUsedDate")
    public void setLastUsedDate(String value) { this.lastUsedDate = value; }

    @JsonProperty("region")
    public String getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(String value) { this.region = value; }
	@Override
	public String toString() {
		return "RoleLastUsed [lastUsedDate=" + lastUsedDate + ", region=" + region + "]";
	}
    
    
}
