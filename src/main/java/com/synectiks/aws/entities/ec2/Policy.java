package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Policy {
	private String name;
	private AssumeRolePolicy document;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("document")
	public AssumeRolePolicy getDocument() {
		return document;
	}

	@JsonProperty("document")
	public void setDocument(AssumeRolePolicy value) {
		this.document = value;
	}
}
