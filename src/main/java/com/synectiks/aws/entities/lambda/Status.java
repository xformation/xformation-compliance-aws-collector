package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private String code;

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String value) {
		this.message = value;
	}

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String value) {
		this.code = value;
	}

	@Override
	public String toString() {
		return "Status [message=" + message + ", code=" + code + "]";
	}
}
