package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountNumber implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accountNumber;
	private Integer length;

	@JsonProperty("length")
	public Integer getLength() {
		return length;
	}

	@JsonProperty("length")
	public void setLength(Integer value) {
		this.length = value;
	}

	@JsonProperty("accountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}

	@JsonProperty("accountNumber")
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	@Override
	public String toString() {
		return "AccountNumber [accountNumber=" + accountNumber + ", length=" + length + "]";
	}
}
