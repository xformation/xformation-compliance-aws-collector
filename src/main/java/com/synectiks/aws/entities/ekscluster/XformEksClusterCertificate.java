package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;

import software.amazon.awssdk.services.eks.model.Certificate;

public class XformEksClusterCertificate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public static XformEksClusterCertificate build(Certificate awsObj) {
		XformEksClusterCertificate obj = null;
		if(awsObj != null) {
			obj = new XformEksClusterCertificate();
			obj.setData(awsObj.data());
		}
		return obj;
	}
}
