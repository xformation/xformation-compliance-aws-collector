package com.synectiks.aws.entities.vpc;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tags implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StringClass string;

	@JsonProperty("string")
	public StringClass getString() {
		return string;
	}

	@JsonProperty("string")
	public void setString(StringClass value) {
		this.string = value;
	}

	@Override
	public String toString() {
		return "Tags [string=" + string + "]";
	}
}
