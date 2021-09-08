package com.synectiks.aws.entities.ec2;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalFindings {
	private List<ExternalFindingsFinding> findings;

	@JsonProperty("findings")
	public List<ExternalFindingsFinding> getFindings() {
		return findings;
	}

	@JsonProperty("findings")
	public void setFindings(List<ExternalFindingsFinding> value) {
		this.findings = value;
	}
}
