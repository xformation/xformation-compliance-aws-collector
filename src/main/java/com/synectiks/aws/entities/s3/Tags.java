package com.synectiks.aws.entities.s3;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tags {
	private StringClass string;

	@JsonProperty("string")
	public StringClass getString() {
		return string;
	}

	@JsonProperty("string")
	public void setString(StringClass value) {
		this.string = value;
	}
}
