package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.common.Tag;

public class Selector implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Tag> labels;
	private String namespace;

	@JsonProperty("labels")
	public List<Tag> getLabels() {
		return labels;
	}

	@JsonProperty("labels")
	public void setLabels(List<Tag> value) {
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
