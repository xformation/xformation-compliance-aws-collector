package com.synectiks.aws.entities.s3;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AssetsStat {
	private String type;
	private String count;

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String value) {
		this.type = value;
	}

	@JsonProperty("count")
	public String getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(String value) {
		this.count = value;
	}
}
