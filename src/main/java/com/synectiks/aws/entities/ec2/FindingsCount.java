package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindingsCount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String high;
	private String medium;
	private String low;
	private String info;

	@JsonProperty("high")
	public String getHigh() {
		return high;
	}

	@JsonProperty("high")
	public void setHigh(String value) {
		this.high = value;
	}

	@JsonProperty("medium")
	public String getMedium() {
		return medium;
	}

	@JsonProperty("medium")
	public void setMedium(String value) {
		this.medium = value;
	}

	@JsonProperty("low")
	public String getLow() {
		return low;
	}

	@JsonProperty("low")
	public void setLow(String value) {
		this.low = value;
	}

	@JsonProperty("info")
	public String getInfo() {
		return info;
	}

	@JsonProperty("info")
	public void setInfo(String value) {
		this.info = value;
	}

	@Override
	public String toString() {
		return "FindingsCount [high=" + high + ", medium=" + medium + ", low=" + low + ", info=" + info + "]";
	}

}
