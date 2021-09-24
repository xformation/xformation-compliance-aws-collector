package com.synectiks.aws.entities.cloudtrail;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class MetricTransformation implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String defaultValue;
    private String metricName;
    private String metricNamespace;
    private String metricValue;
    private List<Alarm> alarms;

    @JsonProperty("defaultValue")
    public String getDefaultValue() { return defaultValue; }
    @JsonProperty("defaultValue")
    public void setDefaultValue(String value) { this.defaultValue = value; }

    @JsonProperty("metricName")
    public String getMetricName() { return metricName; }
    @JsonProperty("metricName")
    public void setMetricName(String value) { this.metricName = value; }

    @JsonProperty("metricNamespace")
    public String getMetricNamespace() { return metricNamespace; }
    @JsonProperty("metricNamespace")
    public void setMetricNamespace(String value) { this.metricNamespace = value; }

    @JsonProperty("metricValue")
    public String getMetricValue() { return metricValue; }
    @JsonProperty("metricValue")
    public void setMetricValue(String value) { this.metricValue = value; }

    @JsonProperty("alarms")
    public List<Alarm> getAlarms() { return alarms; }
    @JsonProperty("alarms")
    public void setAlarms(List<Alarm> value) { this.alarms = value; }
}
