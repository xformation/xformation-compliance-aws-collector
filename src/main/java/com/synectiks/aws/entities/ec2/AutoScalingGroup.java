package com.synectiks.aws.entities.ec2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class AutoScalingGroup implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
    private String name;
    private String region;
    private String launchConfigurationName;
    private Integer minSize;
    private Integer maxSize;
    private Integer desiredCapacity;
    private String defaultCooldown;
    private String launchTemplateName;
    private String vpcZoneIdentifier;
    private String newInstanceProtectedFromScaleIn;
    private String serviceLinkedRoleARN;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("region")
    public String getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(String value) { this.region = value; }

    @JsonProperty("launchConfigurationName")
    public String getLaunchConfigurationName() { return launchConfigurationName; }
    @JsonProperty("launchConfigurationName")
    public void setLaunchConfigurationName(String value) { this.launchConfigurationName = value; }

    @JsonProperty("minSize")
    public Integer getMinSize() { return minSize; }
    @JsonProperty("minSize")
    public void setMinSize(Integer value) { this.minSize = value; }

    @JsonProperty("maxSize")
    public Integer getMaxSize() { return maxSize; }
    @JsonProperty("maxSize")
    public void setMaxSize(Integer value) { this.maxSize = value; }

    @JsonProperty("desiredCapacity")
    public Integer getDesiredCapacity() { return desiredCapacity; }
    @JsonProperty("desiredCapacity")
    public void setDesiredCapacity(Integer value) { this.desiredCapacity = value; }

    @JsonProperty("defaultCooldown")
    public String getDefaultCooldown() { return defaultCooldown; }
    @JsonProperty("defaultCooldown")
    public void setDefaultCooldown(String value) { this.defaultCooldown = value; }

    @JsonProperty("launchTemplateName")
    public String getLaunchTemplateName() { return launchTemplateName; }
    @JsonProperty("launchTemplateName")
    public void setLaunchTemplateName(String value) { this.launchTemplateName = value; }

    @JsonProperty("vpcZoneIdentifier")
    public String getVpcZoneIdentifier() { return vpcZoneIdentifier; }
    @JsonProperty("vpcZoneIdentifier")
    public void setVpcZoneIdentifier(String value) { this.vpcZoneIdentifier = value; }

    @JsonProperty("newInstanceProtectedFromScaleIn")
    public String getNewInstanceProtectedFromScaleIn() { return newInstanceProtectedFromScaleIn; }
    @JsonProperty("newInstanceProtectedFromScaleIn")
    public void setNewInstanceProtectedFromScaleIn(String value) { this.newInstanceProtectedFromScaleIn = value; }

    @JsonProperty("serviceLinkedRoleARN")
    public String getServiceLinkedRoleARN() { return serviceLinkedRoleARN; }
    @JsonProperty("serviceLinkedRoleARN")
    public void setServiceLinkedRoleARN(String value) { this.serviceLinkedRoleARN = value; }
	@Override
	public String toString() {
		return "AutoScalingGroup [id=" + id + ", name=" + name + ", region=" + region + ", launchConfigurationName="
				+ launchConfigurationName + ", minSize=" + minSize + ", maxSize=" + maxSize + ", desiredCapacity="
				+ desiredCapacity + ", defaultCooldown=" + defaultCooldown + ", launchTemplateName="
				+ launchTemplateName + ", vpcZoneIdentifier=" + vpcZoneIdentifier + ", newInstanceProtectedFromScaleIn="
				+ newInstanceProtectedFromScaleIn + ", serviceLinkedRoleARN=" + serviceLinkedRoleARN + "]";
	}
}
