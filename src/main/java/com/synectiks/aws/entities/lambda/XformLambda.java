package com.synectiks.aws.entities.lambda;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class XformLambda implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description;
	private String vendor;
	private String arn;
	private String environment;
	private String handler;
	private String codeSize;
	private String memory;
	private String executionRoleArn;
	private String lastModified;
	private String version;
	private String codeSha256;
	private String kmsKeyArn;
	private DeadLetterConfig deadLetterConfig;
	private TracingConfig tracingConfig;
	private List<EnvironmentVariable> environmentVariables;
	private List<BoundRule> inboundRules;
	private List<BoundRule> outboundRules;
	private List<SecurityGroup> securityGroups;
	private List<NIC> nics;
	private ExecutionRole executionRole;
	private ResourcePolicy resourcePolicy;
	private String accessAnalyzerFindingCount;
	private Vpc vpc;
	private List<EnvironmentVariable> tags;
	private String id;
	private String type;
	private String name;
	private String accountNumber;
	private String region;
	private ExternalFindings externalFindings;

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String value) {
		this.description = value;
	}

	@JsonProperty("vendor")
	public String getVendor() {
		return vendor;
	}

	@JsonProperty("vendor")
	public void setVendor(String value) {
		this.vendor = value;
	}

	@JsonProperty("arn")
	public String getArn() {
		return arn;
	}

	@JsonProperty("arn")
	public void setArn(String value) {
		this.arn = value;
	}

	@JsonProperty("environment")
	public String getEnvironment() {
		return environment;
	}

	@JsonProperty("environment")
	public void setEnvironment(String value) {
		this.environment = value;
	}

	@JsonProperty("handler")
	public String getHandler() {
		return handler;
	}

	@JsonProperty("handler")
	public void setHandler(String value) {
		this.handler = value;
	}

	@JsonProperty("codeSize")
	public String getCodeSize() {
		return codeSize;
	}

	@JsonProperty("codeSize")
	public void setCodeSize(String value) {
		this.codeSize = value;
	}

	@JsonProperty("memory")
	public String getMemory() {
		return memory;
	}

	@JsonProperty("memory")
	public void setMemory(String value) {
		this.memory = value;
	}

	@JsonProperty("executionRoleArn")
	public String getExecutionRoleArn() {
		return executionRoleArn;
	}

	@JsonProperty("executionRoleArn")
	public void setExecutionRoleArn(String value) {
		this.executionRoleArn = value;
	}

	@JsonProperty("lastModified")
	public String getLastModified() {
		return lastModified;
	}

	@JsonProperty("lastModified")
	public void setLastModified(String value) {
		this.lastModified = value;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String value) {
		this.version = value;
	}

	@JsonProperty("codeSha256")
	public String getCodeSha256() {
		return codeSha256;
	}

	@JsonProperty("codeSha256")
	public void setCodeSha256(String value) {
		this.codeSha256 = value;
	}

	@JsonProperty("kmsKeyArn")
	public String getKmsKeyArn() {
		return kmsKeyArn;
	}

	@JsonProperty("kmsKeyArn")
	public void setKmsKeyArn(String value) {
		this.kmsKeyArn = value;
	}

	@JsonProperty("deadLetterConfig")
	public DeadLetterConfig getDeadLetterConfig() {
		return deadLetterConfig;
	}

	@JsonProperty("deadLetterConfig")
	public void setDeadLetterConfig(DeadLetterConfig value) {
		this.deadLetterConfig = value;
	}

	@JsonProperty("tracingConfig")
	public TracingConfig getTracingConfig() {
		return tracingConfig;
	}

	@JsonProperty("tracingConfig")
	public void setTracingConfig(TracingConfig value) {
		this.tracingConfig = value;
	}

	@JsonProperty("environmentVariables")
	public List<EnvironmentVariable> getEnvironmentVariables() {
		return environmentVariables;
	}

	@JsonProperty("environmentVariables")
	public void setEnvironmentVariables(List<EnvironmentVariable> value) {
		this.environmentVariables = value;
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

	@JsonProperty("securityGroups")
	public List<SecurityGroup> getSecurityGroups() {
		return securityGroups;
	}

	@JsonProperty("securityGroups")
	public void setSecurityGroups(List<SecurityGroup> value) {
		this.securityGroups = value;
	}

	@JsonProperty("nics")
	public List<NIC> getNics() {
		return nics;
	}

	@JsonProperty("nics")
	public void setNics(List<NIC> value) {
		this.nics = value;
	}

	@JsonProperty("executionRole")
	public ExecutionRole getExecutionRole() {
		return executionRole;
	}

	@JsonProperty("executionRole")
	public void setExecutionRole(ExecutionRole value) {
		this.executionRole = value;
	}

	@JsonProperty("resourcePolicy")
	public ResourcePolicy getResourcePolicy() {
		return resourcePolicy;
	}

	@JsonProperty("resourcePolicy")
	public void setResourcePolicy(ResourcePolicy value) {
		this.resourcePolicy = value;
	}

	@JsonProperty("accessAnalyzerFindingCount")
	public String getAccessAnalyzerFindingCount() {
		return accessAnalyzerFindingCount;
	}

	@JsonProperty("accessAnalyzerFindingCount")
	public void setAccessAnalyzerFindingCount(String value) {
		this.accessAnalyzerFindingCount = value;
	}

	@JsonProperty("vpc")
	public Vpc getVpc() {
		return vpc;
	}

	@JsonProperty("vpc")
	public void setVpc(Vpc value) {
		this.vpc = value;
	}

	@JsonProperty("tags")
	public List<EnvironmentVariable> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<EnvironmentVariable> value) {
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "XformLambda [description=" + description + ", vendor=" + vendor + ", arn=" + arn + ", environment="
				+ environment + ", handler=" + handler + ", codeSize=" + codeSize + ", memory=" + memory
				+ ", executionRoleArn=" + executionRoleArn + ", lastModified=" + lastModified + ", version=" + version
				+ ", codeSha256=" + codeSha256 + ", kmsKeyArn=" + kmsKeyArn + ", deadLetterConfig=" + deadLetterConfig
				+ ", tracingConfig=" + tracingConfig + ", environmentVariables=" + environmentVariables
				+ ", inboundRules=" + inboundRules + ", outboundRules=" + outboundRules + ", securityGroups="
				+ securityGroups + ", nics=" + nics + ", executionRole=" + executionRole + ", resourcePolicy="
				+ resourcePolicy + ", accessAnalyzerFindingCount=" + accessAnalyzerFindingCount + ", vpc=" + vpc
				+ ", tags=" + tags + ", id=" + id + ", type=" + type + ", name=" + name + ", accountNumber="
				+ accountNumber + ", region=" + region + ", externalFindings=" + externalFindings + "]";
	}

}
