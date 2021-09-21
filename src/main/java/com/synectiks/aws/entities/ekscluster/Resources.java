package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resources implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AutoScalingGroup[] autoScalingGroups;
	private String remoteAccessSecurityGroup;

	@JsonProperty("autoScalingGroups")
	public AutoScalingGroup[] getAutoScalingGroups() {
		return autoScalingGroups;
	}

	@JsonProperty("autoScalingGroups")
	public void setAutoScalingGroups(AutoScalingGroup[] value) {
		this.autoScalingGroups = value;
	}

	@JsonProperty("remoteAccessSecurityGroup")
	public String getRemoteAccessSecurityGroup() {
		return remoteAccessSecurityGroup;
	}

	@JsonProperty("remoteAccessSecurityGroup")
	public void setRemoteAccessSecurityGroup(String value) {
		this.remoteAccessSecurityGroup = value;
	}

	@Override
	public String toString() {
		return "Resources [autoScalingGroups=" + Arrays.toString(autoScalingGroups) + ", remoteAccessSecurityGroup="
				+ remoteAccessSecurityGroup + "]";
	}
}
