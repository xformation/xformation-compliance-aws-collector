package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TargetVpc {
	private String cloudAccountID;
	private String cidr;
	private String id;
	private String dhcpOptionsID;
	private String instanceTenancy;
	private String isDefault;
	private String state;
	private String name;
	private String type;
	private String ownerID;
	private Tags tags;

	@JsonProperty("cloudAccountId")
	public String getCloudAccountID() {
		return cloudAccountID;
	}

	@JsonProperty("cloudAccountId")
	public void setCloudAccountID(String value) {
		this.cloudAccountID = value;
	}

	@JsonProperty("cidr")
	public String getCIDR() {
		return cidr;
	}

	@JsonProperty("cidr")
	public void setCIDR(String value) {
		this.cidr = value;
	}

	@JsonProperty("id")
	public String getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(String value) {
		this.id = value;
	}

	@JsonProperty("dhcpOptionsId")
	public String getDHCPOptionsID() {
		return dhcpOptionsID;
	}

	@JsonProperty("dhcpOptionsId")
	public void setDHCPOptionsID(String value) {
		this.dhcpOptionsID = value;
	}

	@JsonProperty("instanceTenancy")
	public String getInstanceTenancy() {
		return instanceTenancy;
	}

	@JsonProperty("instanceTenancy")
	public void setInstanceTenancy(String value) {
		this.instanceTenancy = value;
	}

	@JsonProperty("isDefault")
	public String getIsDefault() {
		return isDefault;
	}

	@JsonProperty("isDefault")
	public void setIsDefault(String value) {
		this.isDefault = value;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String value) {
		this.state = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String value) {
		this.type = value;
	}

	@JsonProperty("ownerId")
	public String getOwnerID() {
		return ownerID;
	}

	@JsonProperty("ownerId")
	public void setOwnerID(String value) {
		this.ownerID = value;
	}

	@JsonProperty("tags")
	public Tags getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(Tags value) {
		this.tags = value;
	}
}
