package com.synectiks.aws.entities.ec2;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.common.Tag;

import software.amazon.awssdk.services.autoscaling.model.AutoScalingInstanceDetails;
import software.amazon.awssdk.services.ec2.model.CapacityReservationSpecificationResponse;
import software.amazon.awssdk.services.ec2.model.CpuOptions;
import software.amazon.awssdk.services.ec2.model.EnclaveOptions;
import software.amazon.awssdk.services.ec2.model.HibernationOptions;
import software.amazon.awssdk.services.ec2.model.IamInstanceProfile;
import software.amazon.awssdk.services.ec2.model.InstanceMetadataOptionsResponse;
import software.amazon.awssdk.services.ec2.model.InstanceState;
import software.amazon.awssdk.services.ec2.model.Monitoring;
import software.amazon.awssdk.services.ec2.model.Placement;
import software.amazon.awssdk.services.ec2.model.StateReason;

public class XformEc2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String image;
	private ImageDetails imageDetails;
	private String kernelID;
	private String platform;
	private Instant launchTime;
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
	private List<Tag> tags;
	private Vpc vpc;
	private String id;
	private String type;
	private String name;
	private String accountNumber;
	private String region;
	private ExternalFindings externalFindings;

	private Integer amiLaunchIndex;
	private String keyName;
	private Monitoring monitoring;
	private Placement placement;
	private String privateIpAddress;
	private List productCodes;
	private String publicIpAddress;
	private String ramdiskId;
	private InstanceState state;
	private String stateTransitionReason;
	private String subnetId;
	private String vpcId;
	private String architecture;
	private List blockDeviceMappings;
	private String clientToken;
	private Boolean ebsOptimized;
	private Boolean enaSupport;
	private String hypervisor;
	private IamInstanceProfile iamInstanceProfile;
	private String instanceLifecycle;
	private List elasticGpuAssociations;
	private List elasticInferenceAcceleratorAssociations;
	private List networkInterfaces;
	private String outpostArn;
	private String rootDeviceName;
	private String rootDeviceType;
	private List securityGroups;
	private Boolean sourceDestCheck;
	private String spotInstanceRequestId;
	private String sriovNetSupport;
	private StateReason stateReason;
	private String virtualizationType;
	private CpuOptions cpuOptions;
	private String capacityReservationId;
	private CapacityReservationSpecificationResponse capacityReservationSpecification;
	private HibernationOptions hibernationOptions;
	private List licenses;
	private InstanceMetadataOptionsResponse metadataOptions;
	private String bootMode;
	private EnclaveOptions enclaveOptions;

	List<AutoScalingInstanceDetails> autoScalingInstanceDetails;
	//////////////////////

	@JsonProperty("image")
	public String getImage() {
		return image;
	}

	@JsonProperty("image")
	public void setImage(String value) {
		this.image = value;
	}

	@JsonProperty("imageDetails")
	public ImageDetails getImageDetails() {
		return imageDetails;
	}

	@JsonProperty("imageDetails")
	public void setImageDetails(ImageDetails value) {
		this.imageDetails = value;
	}

	@JsonProperty("kernelId")
	public String getKernelID() {
		return kernelID;
	}

	@JsonProperty("kernelId")
	public void setKernelID(String value) {
		this.kernelID = value;
	}

	@JsonProperty("platform")
	public String getPlatform() {
		return platform;
	}

	@JsonProperty("platform")
	public void setPlatform(String value) {
		this.platform = value;
	}

	@JsonProperty("launchTime")
	public Instant getLaunchTime() {
		return launchTime;
	}

	@JsonProperty("launchTime")
	public void setLaunchTime(Instant value) {
		this.launchTime = value;
	}

	@JsonProperty("inboundRules")
	public List<BoundRule> getInboundRules() {
		return inboundRules;
	}

	@JsonProperty("inboundRules")
	public void setInboundRules(List<BoundRule> value) {
		this.inboundRules = value;
	}

	@JsonProperty("outboundRules")
	public List<BoundRule> getOutboundRules() {
		return outboundRules;
	}

	@JsonProperty("outboundRules")
	public void setOutboundRules(List<BoundRule> value) {
		this.outboundRules = value;
	}

	@JsonProperty("nics")
	public List<NIC> getNics() {
		return nics;
	}

	@JsonProperty("nics")
	public void setNics(List<NIC> value) {
		this.nics = value;
	}

	@JsonProperty("isPublic")
	public String getIsPublic() {
		return isPublic;
	}

	@JsonProperty("isPublic")
	public void setIsPublic(String value) {
		this.isPublic = value;
	}

	@JsonProperty("instanceType")
	public String getInstanceType() {
		return instanceType;
	}

	@JsonProperty("instanceType")
	public void setInstanceType(String value) {
		this.instanceType = value;
	}

	@JsonProperty("isRunning")
	public String getIsRunning() {
		return isRunning;
	}

	@JsonProperty("isRunning")
	public void setIsRunning(String value) {
		this.isRunning = value;
	}

	@JsonProperty("volumes")
	public List<Volume> getVolumes() {
		return volumes;
	}

	@JsonProperty("volumes")
	public void setVolumes(List<Volume> value) {
		this.volumes = value;
	}

	@JsonProperty("profileArn")
	public String getProfileArn() {
		return profileArn;
	}

	@JsonProperty("profileArn")
	public void setProfileArn(String value) {
		this.profileArn = value;
	}

	@JsonProperty("roles")
	public List<Role> getRoles() {
		return roles;
	}

	@JsonProperty("roles")
	public void setRoles(List<Role> value) {
		this.roles = value;
	}

	@JsonProperty("scanners")
	public Scanners getScanners() {
		return scanners;
	}

	@JsonProperty("scanners")
	public void setScanners(Scanners value) {
		this.scanners = value;
	}

	@JsonProperty("autoScalingGroup")
	public AutoScalingGroup getAutoScalingGroup() {
		return autoScalingGroup;
	}

	@JsonProperty("autoScalingGroup")
	public void setAutoScalingGroup(AutoScalingGroup value) {
		this.autoScalingGroup = value;
	}

	@JsonProperty("privateDns")
	public String getPrivateDNS() {
		return privateDNS;
	}

	@JsonProperty("privateDns")
	public void setPrivateDNS(String value) {
		this.privateDNS = value;
	}

	@JsonProperty("publicDns")
	public String getPublicDNS() {
		return publicDNS;
	}

	@JsonProperty("publicDns")
	public void setPublicDNS(String value) {
		this.publicDNS = value;
	}

	@JsonProperty("ssmAgentInstanceInformation")
	public SsmAgentInstanceInformation getSsmAgentInstanceInformation() {
		return ssmAgentInstanceInformation;
	}

	@JsonProperty("ssmAgentInstanceInformation")
	public void setSsmAgentInstanceInformation(SsmAgentInstanceInformation value) {
		this.ssmAgentInstanceInformation = value;
	}

	@JsonProperty("tags")
	public List<Tag> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<Tag> value) {
		this.tags = value;
	}

	@JsonProperty("vpc")
	public Vpc getVpc() {
		return vpc;
	}

	@JsonProperty("vpc")
	public void setVpc(Vpc value) {
		this.vpc = value;
	}

	@JsonProperty("id")
	public String getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(String value) {
		this.id = value;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String value) {
		this.type = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("accountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}

	@JsonProperty("accountNumber")
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	@JsonProperty("region")
	public void setRegion(String value) {
		this.region = value;
	}

	@JsonProperty("externalFindings")
	public ExternalFindings getExternalFindings() {
		return externalFindings;
	}

	@JsonProperty("externalFindings")
	public void setExternalFindings(ExternalFindings value) {
		this.externalFindings = value;
	}

	@JsonProperty("amiLaunchIndex")
	public Integer getAmiLaunchIndex() {
		return amiLaunchIndex;
	}

	@JsonProperty("amiLaunchIndex")
	public void setAmiLaunchIndex(Integer value) {
		this.amiLaunchIndex = value;
	}

	@JsonProperty("keyName")
	public String getKeyName() {
		return keyName;
	}

	@JsonProperty("keyName")
	public void setKeyName(String value) {
		this.keyName = value;
	}

	@JsonProperty("monitoring")
	public Monitoring getMonitoring() {
		return monitoring;
	}

	@JsonProperty("monitoring")
	public void setMonitoring(Monitoring value) {
		this.monitoring = value;
	}

	@JsonProperty("placement")
	public Placement getPlacement() {
		return placement;
	}

	@JsonProperty("placement")
	public void setPlacement(Placement value) {
		this.placement = value;
	}

	@JsonProperty("privateIpAddress")
	public String getPrivateIpAddress() {
		return privateIpAddress;
	}

	@JsonProperty("privateIpAddress")
	public void setPrivateIpAddress(String value) {
		this.privateIpAddress = value;
	}

	@JsonProperty("productCodes")
	public List getProductCodes() {
		return productCodes;
	}

	@JsonProperty("productCodes")
	public void setProductCodes(List value) {
		this.productCodes = value;
	}

	@JsonProperty("publicIpAddress")
	public String getPublicIpAddress() {
		return publicIpAddress;
	}

	@JsonProperty("publicIpAddress")
	public void setPublicIpAddress(String value) {
		this.publicIpAddress = value;
	}

	@JsonProperty("ramdiskId")
	public String getRamdiskId() {
		return ramdiskId;
	}

	@JsonProperty("ramdiskId")
	public void setRamdiskId(String value) {
		this.ramdiskId = value;
	}

	@JsonProperty("state")
	public InstanceState getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(InstanceState value) {
		this.state = value;
	}

	@JsonProperty("stateTransitionReason")
	public String getStateTransitionReason() {
		return stateTransitionReason;
	}

	@JsonProperty("stateTransitionReason")
	public void setStateTransitionReason(String value) {
		this.stateTransitionReason = value;
	}

	@JsonProperty("subnetId")
	public String getSubnetId() {
		return subnetId;
	}

	@JsonProperty("subnetId")
	public void setSubnetId(String value) {
		this.subnetId = value;
	}

	@JsonProperty("vpcId")
	public String getVpcId() {
		return vpcId;
	}

	@JsonProperty("vpcId")
	public void setVpcId(String value) {
		this.vpcId = value;
	}

	@JsonProperty("architecture")
	public String getArchitecture() {
		return architecture;
	}

	@JsonProperty("architecture")
	public void setArchitecture(String value) {
		this.architecture = value;
	}

	@JsonProperty("blockDeviceMappings")
	public List getBlockDeviceMappings() {
		return blockDeviceMappings;
	}

	@JsonProperty("blockDeviceMappings")
	public void setBlockDeviceMappings(List value) {
		this.blockDeviceMappings = value;
	}

	@JsonProperty("clientToken")
	public String getClientToken() {
		return clientToken;
	}

	@JsonProperty("clientToken")
	public void setClientToken(String value) {
		this.clientToken = value;
	}

	@JsonProperty("ebsOptimized")
	public Boolean getEbsOptimized() {
		return ebsOptimized;
	}

	@JsonProperty("ebsOptimized")
	public void setEbsOptimized(Boolean value) {
		this.ebsOptimized = value;
	}

	@JsonProperty("enaSupport")
	public Boolean getEnaSupport() {
		return enaSupport;
	}

	@JsonProperty("enaSupport")
	public void setEnaSupport(Boolean value) {
		this.enaSupport = value;
	}

	@JsonProperty("hypervisor")
	public String getHypervisor() {
		return hypervisor;
	}

	@JsonProperty("hypervisor")
	public void setHypervisor(String value) {
		this.hypervisor = value;
	}

	@JsonProperty("iamInstanceProfile")
	public IamInstanceProfile getIamInstanceProfile() {
		return iamInstanceProfile;
	}

	@JsonProperty("iamInstanceProfile")
	public void setIamInstanceProfile(IamInstanceProfile value) {
		this.iamInstanceProfile = value;
	}

	@JsonProperty("instanceLifecycle")
	public String getInstanceLifecycle() {
		return instanceLifecycle;
	}

	@JsonProperty("instanceLifecycle")
	public void setInstanceLifecycle(String value) {
		this.instanceLifecycle = value;
	}

	@JsonProperty("elasticGpuAssociations")
	public List getElasticGpuAssociations() {
		return elasticGpuAssociations;
	}

	@JsonProperty("elasticGpuAssociations")
	public void setElasticGpuAssociations(List value) {
		this.elasticGpuAssociations = value;
	}

	@JsonProperty("elasticInferenceAcceleratorAssociations")
	public List getElasticInferenceAcceleratorAssociations() {
		return elasticInferenceAcceleratorAssociations;
	}

	@JsonProperty("elasticInferenceAcceleratorAssociations")
	public void setElasticInferenceAcceleratorAssociations(List value) {
		this.elasticInferenceAcceleratorAssociations = value;
	}

	@JsonProperty("networkInterfaces")
	public List getNetworkInterfaces() {
		return networkInterfaces;
	}

	@JsonProperty("networkInterfaces")
	public void setNetworkInterfaces(List value) {
		this.networkInterfaces = value;
	}

	@JsonProperty("outpostArn")
	public String getOutpostArn() {
		return outpostArn;
	}

	@JsonProperty("outpostArn")
	public void setOutpostArn(String value) {
		this.outpostArn = value;
	}

	@JsonProperty("rootDeviceName")
	public String getRootDeviceName() {
		return rootDeviceName;
	}

	@JsonProperty("rootDeviceName")
	public void setRootDeviceName(String value) {
		this.rootDeviceName = value;
	}

	@JsonProperty("rootDeviceType")
	public String getRootDeviceType() {
		return rootDeviceType;
	}

	@JsonProperty("rootDeviceType")
	public void setRootDeviceType(String value) {
		this.rootDeviceType = value;
	}

	@JsonProperty("securityGroups")
	public List getSecurityGroups() {
		return securityGroups;
	}

	@JsonProperty("securityGroups")
	public void setSecurityGroups(List value) {
		this.securityGroups = value;
	}

	@JsonProperty("sourceDestCheck")
	public Boolean getSourceDestCheck() {
		return sourceDestCheck;
	}

	@JsonProperty("sourceDestCheck")
	public void setSourceDestCheck(Boolean value) {
		this.sourceDestCheck = value;
	}

	@JsonProperty("spotInstanceRequestId")
	public String getSpotInstanceRequestId() {
		return spotInstanceRequestId;
	}

	@JsonProperty("spotInstanceRequestId")
	public void setSpotInstanceRequestId(String value) {
		this.spotInstanceRequestId = value;
	}

	@JsonProperty("sriovNetSupport")
	public String getSriovNetSupport() {
		return sriovNetSupport;
	}

	@JsonProperty("sriovNetSupport")
	public void setSriovNetSupport(String value) {
		this.sriovNetSupport = value;
	}

	@JsonProperty("stateReason")
	public StateReason getStateReason() {
		return stateReason;
	}

	@JsonProperty("stateReason")
	public void setStateReason(StateReason value) {
		this.stateReason = value;
	}

	@JsonProperty("virtualizationType")
	public String getVirtualizationType() {
		return virtualizationType;
	}

	@JsonProperty("virtualizationType")
	public void setVirtualizationType(String value) {
		this.virtualizationType = value;
	}

	@JsonProperty("cpuOptions")
	public CpuOptions getCpuOptions() {
		return cpuOptions;
	}

	@JsonProperty("cpuOptions")
	public void setCpuOptions(CpuOptions value) {
		this.cpuOptions = value;
	}

	@JsonProperty("capacityReservationId")
	public String getCapacityReservationId() {
		return capacityReservationId;
	}

	@JsonProperty("capacityReservationId")
	public void setCapacityReservationId(String value) {
		this.capacityReservationId = value;
	}

	@JsonProperty("capacityReservationSpecification")
	public CapacityReservationSpecificationResponse getCapacityReservationSpecification() {
		return capacityReservationSpecification;
	}

	@JsonProperty("capacityReservationSpecification")
	public void setCapacityReservationSpecification(CapacityReservationSpecificationResponse value) {
		this.capacityReservationSpecification = value;
	}

	@JsonProperty("hibernationOptions")
	public HibernationOptions getHibernationOptions() {
		return hibernationOptions;
	}

	@JsonProperty("hibernationOptions")
	public void setHibernationOptions(HibernationOptions value) {
		this.hibernationOptions = value;
	}

	@JsonProperty("licenses")
	public List getLicenses() {
		return licenses;
	}

	@JsonProperty("licenses")
	public void setLicenses(List value) {
		this.licenses = value;
	}

	@JsonProperty("metadataOptions")
	public InstanceMetadataOptionsResponse getMetadataOptions() {
		return metadataOptions;
	}

	@JsonProperty("metadataOptions")
	public void setMetadataOptions(InstanceMetadataOptionsResponse value) {
		this.metadataOptions = value;
	}

	@JsonProperty("enclaveOptions")
	public EnclaveOptions getEnclaveOptions() {
		return enclaveOptions;
	}

	@JsonProperty("enclaveOptions")
	public void setEnclaveOptions(EnclaveOptions value) {
		this.enclaveOptions = value;
	}

	@JsonProperty("bootMode")
	public String getBootMode() {
		return bootMode;
	}

	@JsonProperty("bootMode")
	public void setBootMode(String value) {
		this.bootMode = value;
	}

	@Override
	public String toString() {
		return "Welcome [image=" + image + ", imageDetails=" + imageDetails + ", kernelID=" + kernelID + ", platform="
				+ platform + ", launchTime=" + launchTime + ", inboundRules=" + inboundRules + ", outboundRules="
				+ outboundRules + ", nics=" + nics + ", isPublic=" + isPublic + ", instanceType=" + instanceType
				+ ", isRunning=" + isRunning + ", volumes=" + volumes + ", profileArn=" + profileArn + ", roles="
				+ roles + ", scanners=" + scanners + ", autoScalingGroup=" + autoScalingGroup + ", privateDNS="
				+ privateDNS + ", publicDNS=" + publicDNS + ", ssmAgentInstanceInformation="
				+ ssmAgentInstanceInformation + ", tags=" + tags + ", vpc=" + vpc + ", id=" + id + ", type=" + type
				+ ", name=" + name + ", accountNumber=" + accountNumber + ", region=" + region + ", externalFindings="
				+ externalFindings + "]";
	}

	@JsonProperty("autoScalingInstanceDetails")
	public List<AutoScalingInstanceDetails> getAutoScalingInstanceDetails() {
		return autoScalingInstanceDetails;
	}

	@JsonProperty("autoScalingInstanceDetails")
	public void setAutoScalingInstanceDetails(List<AutoScalingInstanceDetails> autoScalingInstanceDetails) {
		this.autoScalingInstanceDetails = autoScalingInstanceDetails;
	}
}
