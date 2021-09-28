package com.synectiks.aws.entities.rds;

import java.io.Serializable;

import software.amazon.awssdk.services.rds.model.AvailabilityZone;

public class XformRdsAvailabilityZone implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static XformRdsAvailabilityZone build(AvailabilityZone awsObj) {
		XformRdsAvailabilityZone obj = null;
		if(awsObj != null) {
			obj = new XformRdsAvailabilityZone();
			obj.setName(awsObj.name());
		}
		return obj;
	}
}
