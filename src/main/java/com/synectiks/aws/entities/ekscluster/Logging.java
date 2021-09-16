package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Logging implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ClusterLogging> clusterLogging;

    @JsonProperty("clusterLogging")
    public List<ClusterLogging> getClusterLogging() { return clusterLogging; }
    @JsonProperty("clusterLogging")
    public void setClusterLogging(List<ClusterLogging> value) { this.clusterLogging = value; }
    
	@Override
	public String toString() {
		return "Logging [clusterLogging=" + clusterLogging + "]";
	}
}
