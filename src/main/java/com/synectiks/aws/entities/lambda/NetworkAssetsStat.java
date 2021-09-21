package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkAssetsStat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	@Override
	public String toString() {
		return "NetworkAssetsStat [type=" + type + ", count=" + count + "]";
	}
}
