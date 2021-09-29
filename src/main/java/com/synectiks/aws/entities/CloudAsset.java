package com.synectiks.aws.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CloudAsset implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Boolean hasPerformance;
	private Boolean hasAvailability;
	private Boolean hasSecurity;
	private Boolean hasDataProtection;
	private Boolean hasUserExp;
	
	
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonProperty("hasPerformance")
	public Boolean getHasPerformance() {
		return hasPerformance;
	}
	
	@JsonProperty("hasPerformance")
	public void setHasPerformance(Boolean hasPerformance) {
		this.hasPerformance = hasPerformance;
	}
	
	@JsonProperty("hasAvailability")
	public Boolean getHasAvailability() {
		return hasAvailability;
	}
	
	@JsonProperty("hasAvailability")
	public void setHasAvailability(Boolean hasAvailability) {
		this.hasAvailability = hasAvailability;
	}
	
	@JsonProperty("hasSecurity")
	public Boolean getHasSecurity() {
		return hasSecurity;
	}
	
	@JsonProperty("hasSecurity")
	public void setHasSecurity(Boolean hasSecurity) {
		this.hasSecurity = hasSecurity;
	}
	
	@JsonProperty("hasDataProtection")
	public Boolean getHasDataProtection() {
		return hasDataProtection;
	}
	
	@JsonProperty("hasDataProtection")
	public void setHasDataProtection(Boolean hasDataProtection) {
		this.hasDataProtection = hasDataProtection;
	}
	@JsonProperty("hasUserExp")
	public Boolean getHasUserExp() {
		return hasUserExp;
	}
	
	@JsonProperty("hasUserExp")
	public void setHasUserExp(Boolean hasUserExp) {
		this.hasUserExp = hasUserExp;
	}

	
}
