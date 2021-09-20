package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class ICMPProtocol implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
    private String code;
    private String description;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }
	@Override
	public String toString() {
		return "ICMPProtocol [type=" + type + ", code=" + code + ", description=" + description + "]";
	}
}
