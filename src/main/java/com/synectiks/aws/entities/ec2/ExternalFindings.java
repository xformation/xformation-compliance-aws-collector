package com.synectiks.aws.entities.ec2;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalFindings implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ExternalFindingsFinding> findings;

	@JsonProperty("findings")
	public List<ExternalFindingsFinding> getFindings() {
		return findings;
	}

	@JsonProperty("findings")
	public void setFindings(List<ExternalFindingsFinding> value) {
		this.findings = value;
	}

	@Override
	public String toString() {
		return "ExternalFindings [findings=" + findings + "]";
	}

}
