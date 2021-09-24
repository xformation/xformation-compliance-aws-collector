package com.synectiks.aws.entities.cloudtrail;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class MetricFilter implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String creationTime;
    private String filterName;
    private String filterPattern;
    private List<MetricTransformation> metricTransformations;

    @JsonProperty("creationTime")
    public String getCreationTime() { return creationTime; }
    @JsonProperty("creationTime")
    public void setCreationTime(String value) { this.creationTime = value; }

    @JsonProperty("filterName")
    public String getFilterName() { return filterName; }
    @JsonProperty("filterName")
    public void setFilterName(String value) { this.filterName = value; }

    @JsonProperty("filterPattern")
    public String getFilterPattern() { return filterPattern; }
    @JsonProperty("filterPattern")
    public void setFilterPattern(String value) { this.filterPattern = value; }

    @JsonProperty("metricTransformations")
    public List<MetricTransformation> getMetricTransformations() { return metricTransformations; }
    @JsonProperty("metricTransformations")
    public void setMetricTransformations(List<MetricTransformation> value) { this.metricTransformations = value; }
}
