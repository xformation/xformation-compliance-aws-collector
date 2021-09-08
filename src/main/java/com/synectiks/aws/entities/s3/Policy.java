package com.synectiks.aws.entities.s3;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Policy {
	private String name;
	private Document document;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("document")
	public Document getDocument() {
		return document;
	}

	@JsonProperty("document")
	public void setDocument(Document value) {
		this.document = value;
	}
}
