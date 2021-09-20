package com.synectiks.aws.entities.s3;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tag implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String key;
	private String value;

	@JsonProperty("key")
	public String getKey() {
		return key;
	}

	@JsonProperty("key")
	public void setKey(String value) {
		this.key = value;
	}

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Tag [key=" + key + ", value=" + value + "]";
	}
	
}
