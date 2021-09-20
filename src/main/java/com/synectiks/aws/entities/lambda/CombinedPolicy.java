package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class CombinedPolicy implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String id;
    private String relationType;
    private ResourcePolicy policyDocument;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("relationType")
    public String getRelationType() { return relationType; }
    @JsonProperty("relationType")
    public void setRelationType(String value) { this.relationType = value; }

    @JsonProperty("policyDocument")
    public ResourcePolicy getPolicyDocument() { return policyDocument; }
    @JsonProperty("policyDocument")
    public void setPolicyDocument(ResourcePolicy value) { this.policyDocument = value; }
	@Override
	public String toString() {
		return "CombinedPolicy [name=" + name + ", id=" + id + ", relationType=" + relationType + ", policyDocument="
				+ policyDocument + "]";
	}
}
