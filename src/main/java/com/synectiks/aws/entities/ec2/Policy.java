package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Policy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private AssumeRolePolicy document;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("document")
	public AssumeRolePolicy getDocument() {
		return document;
	}

	@JsonProperty("document")
	public void setDocument(AssumeRolePolicy value) {
		this.document = value;
	}

	@Override
	public String toString() {
		return "Policy [name=" + name + ", document=" + document + "]";
	}
}
