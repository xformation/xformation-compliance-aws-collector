package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import software.amazon.awssdk.services.ec2.model.VpcCidrBlockState;

public class XformEc2VpcCidrBlockState implements Serializable {

	private String state;
    private String statusMessage;
    
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	
	public static XformEc2VpcCidrBlockState build(VpcCidrBlockState awsObj) {
		XformEc2VpcCidrBlockState obj = null;
		if(awsObj != null) {
			obj = new XformEc2VpcCidrBlockState();
			obj.setState(awsObj.stateAsString());
			obj.setStatusMessage(awsObj.statusMessage());
		}
		return obj;
	}
}
