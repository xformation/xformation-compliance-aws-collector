package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class ImageDetails implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String ownerID;
    private String imageLocation;
    private String isPublic;
    private String state;
    private String description;
    private String creationDate;
    private String hypervisor;
    private String platform;
    private String architecture;
    private String rootDeviceName;
    private String rootDeviceType;
    private String virtualizationType;
    private String ramdiskID;
    private String imageOwnerAlias;
    private String imageType;
    private String kernelID;
    private List<BlockDeviceMapping> blockDeviceMappings;
    private List<ProductCode> productCodes;
    private String enaSupport;
    private String sriovNetSupport;
    private Status stateReason;
    private List<Tag> tags;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("ownerId")
    public String getOwnerID() { return ownerID; }
    @JsonProperty("ownerId")
    public void setOwnerID(String value) { this.ownerID = value; }

    @JsonProperty("imageLocation")
    public String getImageLocation() { return imageLocation; }
    @JsonProperty("imageLocation")
    public void setImageLocation(String value) { this.imageLocation = value; }

    @JsonProperty("isPublic")
    public String getIsPublic() { return isPublic; }
    @JsonProperty("isPublic")
    public void setIsPublic(String value) { this.isPublic = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("creationDate")
    public String getCreationDate() { return creationDate; }
    @JsonProperty("creationDate")
    public void setCreationDate(String value) { this.creationDate = value; }

    @JsonProperty("hypervisor")
    public String getHypervisor() { return hypervisor; }
    @JsonProperty("hypervisor")
    public void setHypervisor(String value) { this.hypervisor = value; }

    @JsonProperty("platform")
    public String getPlatform() { return platform; }
    @JsonProperty("platform")
    public void setPlatform(String value) { this.platform = value; }

    @JsonProperty("architecture")
    public String getArchitecture() { return architecture; }
    @JsonProperty("architecture")
    public void setArchitecture(String value) { this.architecture = value; }

    @JsonProperty("rootDeviceName")
    public String getRootDeviceName() { return rootDeviceName; }
    @JsonProperty("rootDeviceName")
    public void setRootDeviceName(String value) { this.rootDeviceName = value; }

    @JsonProperty("rootDeviceType")
    public String getRootDeviceType() { return rootDeviceType; }
    @JsonProperty("rootDeviceType")
    public void setRootDeviceType(String value) { this.rootDeviceType = value; }

    @JsonProperty("virtualizationType")
    public String getVirtualizationType() { return virtualizationType; }
    @JsonProperty("virtualizationType")
    public void setVirtualizationType(String value) { this.virtualizationType = value; }

    @JsonProperty("ramdiskId")
    public String getRamdiskID() { return ramdiskID; }
    @JsonProperty("ramdiskId")
    public void setRamdiskID(String value) { this.ramdiskID = value; }

    @JsonProperty("imageOwnerAlias")
    public String getImageOwnerAlias() { return imageOwnerAlias; }
    @JsonProperty("imageOwnerAlias")
    public void setImageOwnerAlias(String value) { this.imageOwnerAlias = value; }

    @JsonProperty("imageType")
    public String getImageType() { return imageType; }
    @JsonProperty("imageType")
    public void setImageType(String value) { this.imageType = value; }

    @JsonProperty("kernelId")
    public String getKernelID() { return kernelID; }
    @JsonProperty("kernelId")
    public void setKernelID(String value) { this.kernelID = value; }

    @JsonProperty("blockDeviceMappings")
    public List<BlockDeviceMapping> getBlockDeviceMappings() { return blockDeviceMappings; }
    @JsonProperty("blockDeviceMappings")
    public void setBlockDeviceMappings(List<BlockDeviceMapping> value) { this.blockDeviceMappings = value; }

    @JsonProperty("productCodes")
    public List<ProductCode> getProductCodes() { return productCodes; }
    @JsonProperty("productCodes")
    public void setProductCodes(List<ProductCode> value) { this.productCodes = value; }

    @JsonProperty("enaSupport")
    public String getEnaSupport() { return enaSupport; }
    @JsonProperty("enaSupport")
    public void setEnaSupport(String value) { this.enaSupport = value; }

    @JsonProperty("sriovNetSupport")
    public String getSriovNetSupport() { return sriovNetSupport; }
    @JsonProperty("sriovNetSupport")
    public void setSriovNetSupport(String value) { this.sriovNetSupport = value; }

    @JsonProperty("stateReason")
    public Status getStateReason() { return stateReason; }
    @JsonProperty("stateReason")
    public void setStateReason(Status value) { this.stateReason = value; }

    @JsonProperty("tags")
    public List<Tag> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<Tag> value) { this.tags = value; }
	@Override
	public String toString() {
		return "ImageDetails [name=" + name + ", ownerID=" + ownerID + ", imageLocation=" + imageLocation
				+ ", isPublic=" + isPublic + ", state=" + state + ", description=" + description + ", creationDate="
				+ creationDate + ", hypervisor=" + hypervisor + ", platform=" + platform + ", architecture="
				+ architecture + ", rootDeviceName=" + rootDeviceName + ", rootDeviceType=" + rootDeviceType
				+ ", virtualizationType=" + virtualizationType + ", ramdiskID=" + ramdiskID + ", imageOwnerAlias="
				+ imageOwnerAlias + ", imageType=" + imageType + ", kernelID=" + kernelID + ", blockDeviceMappings="
				+ blockDeviceMappings + ", productCodes=" + productCodes + ", enaSupport=" + enaSupport
				+ ", sriovNetSupport=" + sriovNetSupport + ", stateReason=" + stateReason + ", tags=" + tags + "]";
	}
}
