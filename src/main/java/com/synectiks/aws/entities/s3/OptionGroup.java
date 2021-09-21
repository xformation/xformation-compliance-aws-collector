package com.synectiks.aws.entities.s3;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OptionGroup implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String allowsVpcAndNonVpcInstanceMemberships;
	private String engineName;
	private String majorEngineVersion;
	private String optionGroupArn;
	private String optionGroupDescription;
	private String optionGroupName;
	private String vpcID;
	private String status;

	@JsonProperty("allowsVpcAndNonVpcInstanceMemberships")
	public String getAllowsVpcAndNonVpcInstanceMemberships() {
		return allowsVpcAndNonVpcInstanceMemberships;
	}

	@JsonProperty("allowsVpcAndNonVpcInstanceMemberships")
	public void setAllowsVpcAndNonVpcInstanceMemberships(String value) {
		this.allowsVpcAndNonVpcInstanceMemberships = value;
	}

	@JsonProperty("engineName")
	public String getEngineName() {
		return engineName;
	}

	@JsonProperty("engineName")
	public void setEngineName(String value) {
		this.engineName = value;
	}

	@JsonProperty("majorEngineVersion")
	public String getMajorEngineVersion() {
		return majorEngineVersion;
	}

	@JsonProperty("majorEngineVersion")
	public void setMajorEngineVersion(String value) {
		this.majorEngineVersion = value;
	}

	@JsonProperty("optionGroupArn")
	public String getOptionGroupArn() {
		return optionGroupArn;
	}

	@JsonProperty("optionGroupArn")
	public void setOptionGroupArn(String value) {
		this.optionGroupArn = value;
	}

	@JsonProperty("optionGroupDescription")
	public String getOptionGroupDescription() {
		return optionGroupDescription;
	}

	@JsonProperty("optionGroupDescription")
	public void setOptionGroupDescription(String value) {
		this.optionGroupDescription = value;
	}

	@JsonProperty("optionGroupName")
	public String getOptionGroupName() {
		return optionGroupName;
	}

	@JsonProperty("optionGroupName")
	public void setOptionGroupName(String value) {
		this.optionGroupName = value;
	}

	@JsonProperty("vpcId")
	public String getVpcID() {
		return vpcID;
	}

	@JsonProperty("vpcId")
	public void setVpcID(String value) {
		this.vpcID = value;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String value) {
		this.status = value;
	}

	@Override
	public String toString() {
		return "OptionGroup [allowsVpcAndNonVpcInstanceMemberships=" + allowsVpcAndNonVpcInstanceMemberships
				+ ", engineName=" + engineName + ", majorEngineVersion=" + majorEngineVersion + ", optionGroupArn="
				+ optionGroupArn + ", optionGroupDescription=" + optionGroupDescription + ", optionGroupName="
				+ optionGroupName + ", vpcID=" + vpcID + ", status=" + status + "]";
	}

}
