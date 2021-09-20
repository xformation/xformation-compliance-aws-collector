package com.synectiks.aws.entities.s3;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Alias implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	@Override
	public String toString() {
		return "Alias [name=" + name + ", arn=" + arn + "]";
	}

}
