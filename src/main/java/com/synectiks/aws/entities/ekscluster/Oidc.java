package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class Oidc implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String issuer;

    @JsonProperty("issuer")
    public String getIssuer() { return issuer; }
    @JsonProperty("issuer")
    public void setIssuer(String value) { this.issuer = value; }
    
	@Override
	public String toString() {
		return "Oidc [issuer=" + issuer + "]";
	}
}
