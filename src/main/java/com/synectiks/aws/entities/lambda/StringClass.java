package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StringClass implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String length;

	@JsonProperty("length")
	public String getLength() {
		return length;
	}

	@JsonProperty("length")
	public void setLength(String value) {
		this.length = value;
	}

	@Override
	public String toString() {
		return "StringClass [length=" + length + "]";
	}
}
