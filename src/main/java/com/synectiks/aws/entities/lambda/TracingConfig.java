package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TracingConfig implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mode;

	@JsonProperty("mode")
	public String getMode() {
		return mode;
	}

	@JsonProperty("mode")
	public void setMode(String value) {
		this.mode = value;
	}

	@Override
	public String toString() {
		return "TracingConfig [mode=" + mode + "]";
	}
}
