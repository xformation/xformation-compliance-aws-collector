package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class ScalingConfig implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String desiredSize;
    private String maxSize;
    private String minSize;

    @JsonProperty("desiredSize")
    public String getDesiredSize() { return desiredSize; }
    @JsonProperty("desiredSize")
    public void setDesiredSize(String value) { this.desiredSize = value; }

    @JsonProperty("maxSize")
    public String getMaxSize() { return maxSize; }
    @JsonProperty("maxSize")
    public void setMaxSize(String value) { this.maxSize = value; }

    @JsonProperty("minSize")
    public String getMinSize() { return minSize; }
    @JsonProperty("minSize")
    public void setMinSize(String value) { this.minSize = value; }
    
	@Override
	public String toString() {
		return "ScalingConfig [desiredSize=" + desiredSize + ", maxSize=" + maxSize + ", minSize=" + minSize + "]";
	}
}
