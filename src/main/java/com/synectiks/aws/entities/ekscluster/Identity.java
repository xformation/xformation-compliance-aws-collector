package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Identity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Oidc oidc;

	@JsonProperty("oidc")
	public Oidc getOidc() {
		return oidc;
	}

	@JsonProperty("oidc")
	public void setOidc(Oidc value) {
		this.oidc = value;
	}

	@Override
	public String toString() {
		return "Identity [oidc=" + oidc + "]";
	}
}
