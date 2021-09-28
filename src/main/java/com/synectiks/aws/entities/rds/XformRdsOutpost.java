package com.synectiks.aws.entities.rds;

import java.io.Serializable;

import software.amazon.awssdk.services.rds.model.Outpost;

public class XformRdsOutpost implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String arn;

	public String getArn() {
		return arn;
	}

	public void setArn(String arn) {
		this.arn = arn;
	}
	
	public static XformRdsOutpost build(Outpost awsObj) {
		XformRdsOutpost obj = null;
		if(awsObj != null) {
			obj = new XformRdsOutpost();
			obj.setArn(awsObj.arn());
		}
		return obj;
	}
}
