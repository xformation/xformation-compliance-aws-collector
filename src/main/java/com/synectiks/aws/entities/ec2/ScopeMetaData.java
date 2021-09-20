package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class ScopeMetaData implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vpcID;
    private String region;
    private AccountInfo accountInfo;
    private String accountNumber;

    @JsonProperty("vpcId")
    public String getVpcID() { return vpcID; }
    @JsonProperty("vpcId")
    public void setVpcID(String value) { this.vpcID = value; }

    @JsonProperty("region")
    public String getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(String value) { this.region = value; }

    @JsonProperty("accountInfo")
    public AccountInfo getAccountInfo() { return accountInfo; }
    @JsonProperty("accountInfo")
    public void setAccountInfo(AccountInfo value) { this.accountInfo = value; }

    @JsonProperty("accountNumber")
    public String getAccountNumber() { return accountNumber; }
    @JsonProperty("accountNumber")
    public void setAccountNumber(String value) { this.accountNumber = value; }
	@Override
	public String toString() {
		return "ScopeMetaData [vpcID=" + vpcID + ", region=" + region + ", accountInfo=" + accountInfo
				+ ", accountNumber=" + accountNumber + "]";
	}
    
    
}
