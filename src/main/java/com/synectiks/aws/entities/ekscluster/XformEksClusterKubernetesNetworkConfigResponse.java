package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;

import software.amazon.awssdk.services.eks.model.KubernetesNetworkConfigResponse;

public class XformEksClusterKubernetesNetworkConfigResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String serviceIpv4Cidr;

	public String getServiceIpv4Cidr() {
		return serviceIpv4Cidr;
	}

	public void setServiceIpv4Cidr(String serviceIpv4Cidr) {
		this.serviceIpv4Cidr = serviceIpv4Cidr;
	}
	
	public static XformEksClusterKubernetesNetworkConfigResponse build(KubernetesNetworkConfigResponse awsObj) {
		XformEksClusterKubernetesNetworkConfigResponse obj = null;
		if(awsObj!= null) {
			obj = new XformEksClusterKubernetesNetworkConfigResponse();
			obj.setServiceIpv4Cidr(awsObj.serviceIpv4Cidr());
		}
		return obj;
	}
}
