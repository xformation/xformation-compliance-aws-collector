package com.synectiks.aws.entities.cloudtrail;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class DataResource implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
    private List<RelatedFindingsRef> values;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("values")
    public List<RelatedFindingsRef> getValues() { return values; }
    @JsonProperty("values")
    public void setValues(List<RelatedFindingsRef> value) { this.values = value; }
}
