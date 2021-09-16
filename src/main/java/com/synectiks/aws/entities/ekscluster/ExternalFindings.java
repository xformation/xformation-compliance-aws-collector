package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.*;

public class ExternalFindings implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Finding[] findings;

    @JsonProperty("findings")
    public Finding[] getFindings() { return findings; }
    @JsonProperty("findings")
    public void setFindings(Finding[] value) { this.findings = value; }
    
	@Override
	public String toString() {
		return "ExternalFindings [findings=" + Arrays.toString(findings) + "]";
	}
}
