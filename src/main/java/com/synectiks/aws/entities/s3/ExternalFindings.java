package com.synectiks.aws.entities.s3;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalFindings implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Finding> findings;

	@JsonProperty("findings")
	public List<Finding> getFindings() {
		return findings;
	}

	@JsonProperty("findings")
	public void setFindings(List<Finding> value) {
		this.findings = value;
	}

	@Override
	public String toString() {
		return "ExternalFindings [findings=" + findings + "]";
	}

}
