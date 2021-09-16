package com.synectiks.aws.entities.vpc;

import com.fasterxml.jackson.annotation.*;

public class FindingRulesPackage {
    private String id;
    private String name;
    private String provider;
    private String version;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("provider")
    public String getProvider() { return provider; }
    @JsonProperty("provider")
    public void setProvider(String value) { this.provider = value; }

    @JsonProperty("version")
    public String getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(String value) { this.version = value; }
	@Override
	public String toString() {
		return "FindingRulesPackage [id=" + id + ", name=" + name + ", provider=" + provider + ", version=" + version
				+ "]";
	}
}
