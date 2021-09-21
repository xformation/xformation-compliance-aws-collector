package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ManagedPolicy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String arn;
	private String name;

	@JsonProperty("arn")
	public String getArn() {
		return arn;
	}

	@JsonProperty("arn")
	public void setArn(String value) {
		this.arn = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@Override
	public String toString() {
		return "ManagedPolicy [arn=" + arn + ", name=" + name + "]";
	}
}
