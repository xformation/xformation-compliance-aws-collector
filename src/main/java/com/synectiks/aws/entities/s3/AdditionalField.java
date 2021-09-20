package com.synectiks.aws.entities.s3;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalField implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String value;
	private String comment;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	@JsonProperty("comment")
	public String getComment() {
		return comment;
	}

	@JsonProperty("comment")
	public void setComment(String value) {
		this.comment = value;
	}

	@Override
	public String toString() {
		return "AdditionalField [name=" + name + ", value=" + value + ", comment=" + comment + "]";
	}

}
