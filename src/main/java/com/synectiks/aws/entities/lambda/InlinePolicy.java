package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InlinePolicy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private ResourcePolicy document;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("document")
	public ResourcePolicy getDocument() {
		return document;
	}

	@JsonProperty("document")
	public void setDocument(ResourcePolicy value) {
		this.document = value;
	}

	@Override
	public String toString() {
		return "InlinePolicy [name=" + name + ", document=" + document + "]";
	}
}
