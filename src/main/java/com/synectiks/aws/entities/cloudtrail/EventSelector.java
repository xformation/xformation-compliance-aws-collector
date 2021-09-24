package com.synectiks.aws.entities.cloudtrail;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class EventSelector implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<DataResource> dataResources;
    private String includeManagementEvents;
    private String readWriteType;

    @JsonProperty("dataResources")
    public List<DataResource> getDataResources() { return dataResources; }
    @JsonProperty("dataResources")
    public void setDataResources(List<DataResource> value) { this.dataResources = value; }

    @JsonProperty("includeManagementEvents")
    public String getIncludeManagementEvents() { return includeManagementEvents; }
    @JsonProperty("includeManagementEvents")
    public void setIncludeManagementEvents(String value) { this.includeManagementEvents = value; }

    @JsonProperty("readWriteType")
    public String getReadWriteType() { return readWriteType; }
    @JsonProperty("readWriteType")
    public void setReadWriteType(String value) { this.readWriteType = value; }
}
