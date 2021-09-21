package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Selector implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Tag[] labels;
	private String namespace;

	@JsonProperty("labels")
	public Tag[] getLabels() {
		return labels;
	}

	@JsonProperty("labels")
	public void setLabels(Tag[] value) {
		this.labels = value;
	}

	@JsonProperty("namespace")
	public String getNamespace() {
		return namespace;
	}

	@JsonProperty("namespace")
	public void setNamespace(String value) {
		this.namespace = value;
	}
}
