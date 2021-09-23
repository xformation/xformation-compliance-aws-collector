package com.synectiks.aws.entities.ekscluster;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.common.Tag;

import software.amazon.awssdk.services.eks.model.Certificate;
import software.amazon.awssdk.services.eks.model.EncryptionConfig;
import software.amazon.awssdk.services.eks.model.KubernetesNetworkConfigResponse;

public class XformEksCluster implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String clusterName;
	private String version;
	private String status;
	private String createdAt;
	private String arn;
	private String roleArn;
	private String endpoint;
	private Identity identity;
	private Logging logging;
	private ResourcesVpcConfig resourcesVpcConfig;

	private List<Tag> tags;
	private String name;
	private String accountNumber;
	private String region;
	private ExternalFindings externalFindings;

	private KubernetesNetworkConfigResponse kubernetesNetworkConfig;
	private Certificate certificateAuthority;
	private String clientRequestToken;
	private String platformVersion;
	private List<EncryptionConfig> encryptionConfig;

	/** TO DO. Yet to identify NodeGroup */
	private NodeGroup[] nodeGroups;

	/** TO DO. Yet to identify FargateProfile */
	private FargateProfile[] fargateProfiles;

	/** TO DO. Yet to identify id */
	private String id;

	/** TO DO. Yet to identify type */
	private String type;

	@JsonProperty("clusterName")
	public String getClusterName() {
		return clusterName;
	}

	@JsonProperty("clusterName")
	public void setClusterName(String value) {
		this.clusterName = value;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String value) {
		this.version = value;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String value) {
		this.status = value;
	}

	@JsonProperty("createdAt")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("createdAt")
	public void setCreatedAt(String value) {
		this.createdAt = value;
	}

	@JsonProperty("arn")
	public String getArn() {
		return arn;
	}

	@JsonProperty("arn")
	public void setArn(String value) {
		this.arn = value;
	}

	@JsonProperty("roleArn")
	public String getRoleArn() {
		return roleArn;
	}

	@JsonProperty("roleArn")
	public void setRoleArn(String value) {
		this.roleArn = value;
	}

	@JsonProperty("endpoint")
	public String getEndpoint() {
		return endpoint;
	}

	@JsonProperty("endpoint")
	public void setEndpoint(String value) {
		this.endpoint = value;
	}

	@JsonProperty("identity")
	public Identity getIdentity() {
		return identity;
	}

	@JsonProperty("identity")
	public void setIdentity(Identity value) {
		this.identity = value;
	}

	@JsonProperty("logging")
	public Logging getLogging() {
		return logging;
	}

	@JsonProperty("logging")
	public void setLogging(Logging value) {
		this.logging = value;
	}

	@JsonProperty("resourcesVpcConfig")
	public ResourcesVpcConfig getResourcesVpcConfig() {
		return resourcesVpcConfig;
	}

	@JsonProperty("resourcesVpcConfig")
	public void setResourcesVpcConfig(ResourcesVpcConfig value) {
		this.resourcesVpcConfig = value;
	}

	@JsonProperty("nodeGroups")
	public NodeGroup[] getNodeGroups() {
		return nodeGroups;
	}

	@JsonProperty("nodeGroups")
	public void setNodeGroups(NodeGroup[] value) {
		this.nodeGroups = value;
	}

	@JsonProperty("fargateProfiles")
	public FargateProfile[] getFargateProfiles() {
		return fargateProfiles;
	}

	@JsonProperty("fargateProfiles")
	public void setFargateProfiles(FargateProfile[] value) {
		this.fargateProfiles = value;
	}

	@JsonProperty("tags")
	public List<Tag> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<Tag> value) {
		this.tags = value;
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

	@JsonProperty("kubernetesNetworkConfig")
	public KubernetesNetworkConfigResponse getKubernetesNetworkConfig() {
		return kubernetesNetworkConfig;
	}

	@JsonProperty("kubernetesNetworkConfig")
	public void setKubernetesNetworkConfig(KubernetesNetworkConfigResponse value) {
		this.kubernetesNetworkConfig = value;
	}

	@JsonProperty("certificateAuthority")
	public Certificate getCertificateAuthority() {
		return certificateAuthority;
	}

	@JsonProperty("certificateAuthority")
	public void setCertificateAuthority(Certificate value) {
		this.certificateAuthority = value;
	}

	@JsonProperty("clientRequestToken")
	public String getClientRequestToken() {
		return clientRequestToken;
	}

	@JsonProperty("clientRequestToken")
	public void setClientRequestToken(String value) {
		this.clientRequestToken = value;
	}

	@JsonProperty("platformVersion")
	public String getPlatformVersion() {
		return platformVersion;
	}

	@JsonProperty("platformVersion")
	public void setPlatformVersion(String value) {
		this.platformVersion = value;
	}

	@JsonProperty("encryptionConfig")
	public List<EncryptionConfig> getEncryptionConfig() {
		return encryptionConfig;
	}

	@JsonProperty("encryptionConfig")
	public void setEncryptionConfig(List<EncryptionConfig> value) {
		this.encryptionConfig = value;
	}

	@Override
	public String toString() {
		return "XformEksCluster [clusterName=" + clusterName + ", version=" + version + ", status=" + status
				+ ", createdAt=" + createdAt + ", arn=" + arn + ", roleArn=" + roleArn + ", endpoint=" + endpoint
				+ ", identity=" + identity + ", logging=" + logging + ", resourcesVpcConfig=" + resourcesVpcConfig
				+ ", nodeGroups=" + Arrays.toString(nodeGroups) + ", fargateProfiles="
				+ Arrays.toString(fargateProfiles) + ", tags=" + tags + ", id=" + id + ", type=" + type + ", name="
				+ name + ", accountNumber=" + accountNumber + ", region=" + region + ", externalFindings="
				+ externalFindings + ", kubernetesNetworkConfig=" + kubernetesNetworkConfig + ", certificateAuthority="
				+ certificateAuthority + ", clientRequestToken=" + clientRequestToken + ", platformVersion="
				+ platformVersion + ", encryptionConfig=" + encryptionConfig + "]";
	}

}
