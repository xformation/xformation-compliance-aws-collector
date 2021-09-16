package com.synectiks.aws.entities.vpc;

import com.fasterxml.jackson.annotation.*;

public class Tags {
    private StringClass string;

    @JsonProperty("string")
    public StringClass getString() { return string; }
    @JsonProperty("string")
    public void setString(StringClass value) { this.string = value; }
	@Override
	public String toString() {
		return "Tags [string=" + string + "]";
	}
}
