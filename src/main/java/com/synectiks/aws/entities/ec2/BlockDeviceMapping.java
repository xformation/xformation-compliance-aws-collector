package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class BlockDeviceMapping implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String deviceName;
    private Ebs ebs;
    private String noDevice;
    private String virtualName;

    @JsonProperty("deviceName")
    public String getDeviceName() { return deviceName; }
    @JsonProperty("deviceName")
    public void setDeviceName(String value) { this.deviceName = value; }

    @JsonProperty("ebs")
    public Ebs getEbs() { return ebs; }
    @JsonProperty("ebs")
    public void setEbs(Ebs value) { this.ebs = value; }

    @JsonProperty("noDevice")
    public String getNoDevice() { return noDevice; }
    @JsonProperty("noDevice")
    public void setNoDevice(String value) { this.noDevice = value; }

    @JsonProperty("virtualName")
    public String getVirtualName() { return virtualName; }
    @JsonProperty("virtualName")
    public void setVirtualName(String value) { this.virtualName = value; }
	@Override
	public String toString() {
		return "BlockDeviceMapping [deviceName=" + deviceName + ", ebs=" + ebs + ", noDevice=" + noDevice
				+ ", virtualName=" + virtualName + "]";
	}
    
    
}
