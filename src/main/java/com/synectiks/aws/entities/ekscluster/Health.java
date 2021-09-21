package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Health implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Issue[] issues;

	@JsonProperty("issues")
	public Issue[] getIssues() {
		return issues;
	}

	@JsonProperty("issues")
	public void setIssues(Issue[] value) {
		this.issues = value;
	}

	@Override
	public String toString() {
		return "Health [issues=" + Arrays.toString(issues) + "]";
	}
}
