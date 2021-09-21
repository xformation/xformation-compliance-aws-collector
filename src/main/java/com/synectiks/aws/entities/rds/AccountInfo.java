package com.synectiks.aws.entities.rds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountInfo {
	private String id;
	private String name;
	private String externalAccountNumber;

	@JsonProperty("id")
	public String getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(String value) {
		this.id = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("externalAccountNumber")
	public String getExternalAccountNumber() {
		return externalAccountNumber;
	}

	@JsonProperty("externalAccountNumber")
	public void setExternalAccountNumber(String value) {
		this.externalAccountNumber = value;
	}
}
