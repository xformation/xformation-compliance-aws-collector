package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

public class CustomInstance{
    private String image;
    private ImageDetails imageDetails;
    private String kernelID;
    private String platform;
    private String launchTime;
    private List<BoundRule> inboundRules;
    private List<BoundRule> outboundRules;
    private List<NIC> nics;
    private String isPublic;
    private String instanceType;
    private String isRunning;
    private List<Volume> volumes;
    private String profileArn;
    private List<Role> roles;
    private Scanners scanners;
    private AutoScalingGroup autoScalingGroup;
    private String privateDNS;
    private String publicDNS;
    private SsmAgentInstanceInformation ssmAgentInstanceInformation;
    private List<CustomTag> tags;
    private CustomVpc vpc;
    private String id;
    private String type;
    private String name;
    private String dome9ID;
    private String accountNumber;
    private String region;
    private ExternalFindings externalFindings;

    @JsonProperty("image")
    public String getImage() { return image; }
    @JsonProperty("image")
    public void setImage(String value) { this.image = value; }

    @JsonProperty("imageDetails")
    public ImageDetails getImageDetails() { return imageDetails; }
    @JsonProperty("imageDetails")
    public void setImageDetails(ImageDetails value) { this.imageDetails = value; }

    @JsonProperty("kernelId")
    public String getKernelID() { return kernelID; }
    @JsonProperty("kernelId")
    public void setKernelID(String value) { this.kernelID = value; }

    @JsonProperty("platform")
    public String getPlatform() { return platform; }
    @JsonProperty("platform")
    public void setPlatform(String value) { this.platform = value; }

    @JsonProperty("launchTime")
    public String getLaunchTime() { return launchTime; }
    @JsonProperty("launchTime")
    public void setLaunchTime(String value) { this.launchTime = value; }

    @JsonProperty("inboundRules")
    public List<BoundRule> getInboundRules() { return inboundRules; }
    @JsonProperty("inboundRules")
    public void setInboundRules(List<BoundRule> value) { this.inboundRules = value; }

    @JsonProperty("outboundRules")
    public List<BoundRule> getOutboundRules() { return outboundRules; }
    @JsonProperty("outboundRules")
    public void setOutboundRules(List<BoundRule> value) { this.outboundRules = value; }

    @JsonProperty("nics")
    public List<NIC> getNics() { return nics; }
    @JsonProperty("nics")
    public void setNics(List<NIC> value) { this.nics = value; }

    @JsonProperty("isPublic")
    public String getIsPublic() { return isPublic; }
    @JsonProperty("isPublic")
    public void setIsPublic(String value) { this.isPublic = value; }

    @JsonProperty("instanceType")
    public String getInstanceType() { return instanceType; }
    @JsonProperty("instanceType")
    public void setInstanceType(String value) { this.instanceType = value; }

    @JsonProperty("isRunning")
    public String getIsRunning() { return isRunning; }
    @JsonProperty("isRunning")
    public void setIsRunning(String value) { this.isRunning = value; }

    @JsonProperty("volumes")
    public List<Volume> getVolumes() { return volumes; }
    @JsonProperty("volumes")
    public void setVolumes(List<Volume> value) { this.volumes = value; }

    @JsonProperty("profileArn")
    public String getProfileArn() { return profileArn; }
    @JsonProperty("profileArn")
    public void setProfileArn(String value) { this.profileArn = value; }

    @JsonProperty("roles")
    public List<Role> getRoles() { return roles; }
    @JsonProperty("roles")
    public void setRoles(List<Role> value) { this.roles = value; }

    @JsonProperty("scanners")
    public Scanners getScanners() { return scanners; }
    @JsonProperty("scanners")
    public void setScanners(Scanners value) { this.scanners = value; }

    @JsonProperty("autoScalingGroup")
    public AutoScalingGroup getAutoScalingGroup() { return autoScalingGroup; }
    @JsonProperty("autoScalingGroup")
    public void setAutoScalingGroup(AutoScalingGroup value) { this.autoScalingGroup = value; }

    @JsonProperty("privateDns")
    public String getPrivateDNS() { return privateDNS; }
    @JsonProperty("privateDns")
    public void setPrivateDNS(String value) { this.privateDNS = value; }

    @JsonProperty("publicDns")
    public String getPublicDNS() { return publicDNS; }
    @JsonProperty("publicDns")
    public void setPublicDNS(String value) { this.publicDNS = value; }

    @JsonProperty("ssmAgentInstanceInformation")
    public SsmAgentInstanceInformation getSsmAgentInstanceInformation() { return ssmAgentInstanceInformation; }
    @JsonProperty("ssmAgentInstanceInformation")
    public void setSsmAgentInstanceInformation(SsmAgentInstanceInformation value) { this.ssmAgentInstanceInformation = value; }

    @JsonProperty("tags")
    public List<CustomTag> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<CustomTag> value) { this.tags = value; }

    @JsonProperty("vpc")
    public CustomVpc getVpc() { return vpc; }
    @JsonProperty("vpc")
    public void setVpc(CustomVpc value) { this.vpc = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("dome9Id")
    public String getDome9ID() { return dome9ID; }
    @JsonProperty("dome9Id")
    public void setDome9ID(String value) { this.dome9ID = value; }

    @JsonProperty("accountNumber")
    public String getAccountNumber() { return accountNumber; }
    @JsonProperty("accountNumber")
    public void setAccountNumber(String value) { this.accountNumber = value; }

    @JsonProperty("region")
    public String getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(String value) { this.region = value; }

    @JsonProperty("externalFindings")
    public ExternalFindings getExternalFindings() { return externalFindings; }
    @JsonProperty("externalFindings")
    public void setExternalFindings(ExternalFindings value) { this.externalFindings = value; }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CustomInstance [image=" + image + ", imageDetails=" + imageDetails + ", kernelID=" + kernelID
				+ ", platform=" + platform + ", launchTime=" + launchTime + ", inboundRules=" + inboundRules
				+ ", outboundRules=" + outboundRules + ", nics=" + nics + ", isPublic=" + isPublic + ", instanceType="
				+ instanceType + ", isRunning=" + isRunning + ", volumes=" + volumes + ", profileArn=" + profileArn
				+ ", roles=" + roles + ", scanners=" + scanners + ", autoScalingGroup=" + autoScalingGroup
				+ ", privateDNS=" + privateDNS + ", publicDNS=" + publicDNS + ", ssmAgentInstanceInformation="
				+ ssmAgentInstanceInformation + ", tags=" + tags + ", vpc=" + vpc + ", id=" + id + ", type=" + type
				+ ", name=" + name + ", dome9ID=" + dome9ID + ", accountNumber=" + accountNumber + ", region=" + region
				+ ", externalFindings=" + externalFindings + "]";
	}
    
}
