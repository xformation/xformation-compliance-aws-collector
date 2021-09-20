package com.synectiks.aws.entities.rds;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Nacl {
    private List<Tag> tags;
    private ExternalFindings externalFindings;
    private String source;
    private String type;
    private Vpc vpc;
    private String name;
    private String id;
    private String dome9ID;
    private String accountNumber;
    private String region;
    private List<Bound> inbound;
    private List<Bound> outbound;
    private String isDefault;

    @JsonProperty("tags")
    public List<Tag> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<Tag> value) { this.tags = value; }

    @JsonProperty("externalFindings")
    public ExternalFindings getExternalFindings() { return externalFindings; }
    @JsonProperty("externalFindings")
    public void setExternalFindings(ExternalFindings value) { this.externalFindings = value; }

    @JsonProperty("source")
    public String getSource() { return source; }
    @JsonProperty("source")
    public void setSource(String value) { this.source = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("vpc")
    public Vpc getVpc() { return vpc; }
    @JsonProperty("vpc")
    public void setVpc(Vpc value) { this.vpc = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

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

    @JsonProperty("inbound")
    public List<Bound> getInbound() { return inbound; }
    @JsonProperty("inbound")
    public void setInbound(List<Bound> value) { this.inbound = value; }

    @JsonProperty("outbound")
    public List<Bound> getOutbound() { return outbound; }
    @JsonProperty("outbound")
    public void setOutbound(List<Bound> value) { this.outbound = value; }

    @JsonProperty("isDefault")
    public String getIsDefault() { return isDefault; }
    @JsonProperty("isDefault")
    public void setIsDefault(String value) { this.isDefault = value; }
}
