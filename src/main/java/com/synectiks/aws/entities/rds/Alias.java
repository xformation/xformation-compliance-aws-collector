package com.synectiks.aws.entities.rds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Alias {
	private String name;
	private String arn;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("arn")
	public String getArn() {
		return arn;
	}

	@JsonProperty("arn")
	public void setArn(String value) {
		this.arn = value;
	}
}
