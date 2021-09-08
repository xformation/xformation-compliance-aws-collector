package com.synectiks.aws.entities.s3;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StringClass {
	private String length;

	@JsonProperty("length")
	public String getLength() {
		return length;
	}

	@JsonProperty("length")
	public void setLength(String value) {
		this.length = value;
	}
}
