package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RemoteAccess implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ec2SSHKey;
	private PublicAccessCIDR[] sourceSecurityGroups;

	@JsonProperty("ec2SshKey")
	public String getEc2SSHKey() {
		return ec2SSHKey;
	}

	@JsonProperty("ec2SshKey")
	public void setEc2SSHKey(String value) {
		this.ec2SSHKey = value;
	}

	@JsonProperty("sourceSecurityGroups")
	public PublicAccessCIDR[] getSourceSecurityGroups() {
		return sourceSecurityGroups;
	}

	@JsonProperty("sourceSecurityGroups")
	public void setSourceSecurityGroups(PublicAccessCIDR[] value) {
		this.sourceSecurityGroups = value;
	}

	@Override
	public String toString() {
		return "RemoteAccess [ec2SSHKey=" + ec2SSHKey + ", sourceSecurityGroups="
				+ Arrays.toString(sourceSecurityGroups) + "]";
	}
}
