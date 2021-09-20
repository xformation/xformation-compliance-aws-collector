package com.synectiks.aws.entities.lambda;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class DeadLetterConfig implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String targetArn;

    @JsonProperty("targetArn")
    public String getTargetArn() { return targetArn; }
    @JsonProperty("targetArn")
    public void setTargetArn(String value) { this.targetArn = value; }
	@Override
	public String toString() {
		return "DeadLetterConfig [targetArn=" + targetArn + "]";
	}
}
