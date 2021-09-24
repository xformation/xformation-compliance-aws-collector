package com.synectiks.aws.entities.cloudtrail;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class Alarm implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String actionsEnabled;
    private String arn;
    private String description;
    private String name;
    private String metricName;
    private String namespace;
    private List<Action> actions;

    @JsonProperty("actionsEnabled")
    public String getActionsEnabled() { return actionsEnabled; }
    @JsonProperty("actionsEnabled")
    public void setActionsEnabled(String value) { this.actionsEnabled = value; }

    @JsonProperty("arn")
    public String getArn() { return arn; }
    @JsonProperty("arn")
    public void setArn(String value) { this.arn = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("metricName")
    public String getMetricName() { return metricName; }
    @JsonProperty("metricName")
    public void setMetricName(String value) { this.metricName = value; }

    @JsonProperty("namespace")
    public String getNamespace() { return namespace; }
    @JsonProperty("namespace")
    public void setNamespace(String value) { this.namespace = value; }

    @JsonProperty("actions")
    public List<Action> getActions() { return actions; }
    @JsonProperty("actions")
    public void setActions(List<Action> value) { this.actions = value; }
}
