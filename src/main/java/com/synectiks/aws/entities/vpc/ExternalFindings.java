package com.synectiks.aws.entities.vpc;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalFindings {
	private List<Finding> findings;

	@JsonProperty("findings")
	public List<Finding> getFindings() {
		return findings;
	}

	@JsonProperty("findings")
	public void setFindings(List<Finding> value) {
		this.findings = value;
	}
}
