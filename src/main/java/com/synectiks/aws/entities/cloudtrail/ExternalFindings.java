package com.synectiks.aws.entities.cloudtrail;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class ExternalFindings implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Finding> findings;

    @JsonProperty("findings")
    public List<Finding> getFindings() { return findings; }
    @JsonProperty("findings")
    public void setFindings(List<Finding> value) { this.findings = value; }
}
