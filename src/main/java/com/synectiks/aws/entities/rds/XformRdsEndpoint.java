package com.synectiks.aws.entities.rds;

import java.io.Serializable;

import software.amazon.awssdk.services.rds.model.Endpoint;

public class XformRdsEndpoint implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String address;
    private Integer port;
    private String hostedZoneId;
    
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getHostedZoneId() {
		return hostedZoneId;
	}
	public void setHostedZoneId(String hostedZoneId) {
		this.hostedZoneId = hostedZoneId;
	}
    
	public static XformRdsEndpoint build(Endpoint awsEndpoint) {
		XformRdsEndpoint obj = null;
		if(awsEndpoint != null) {
			obj = new XformRdsEndpoint();
			obj.setAddress(awsEndpoint.address());
			obj.setPort(awsEndpoint.port());
			obj.setHostedZoneId(awsEndpoint.hostedZoneId());
		}
		return obj;
	}
}
