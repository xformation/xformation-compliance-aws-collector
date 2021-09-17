package com.synectiks.aws.entities.vpc;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.*;

public class TransitGateway implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String creationTime;
    private String description;
    private Options options;
    private String ownerID;
    private String state;
    private String transitGatewayArn;
    private String transitGatewayID;
    private Tag[] tags;

    @JsonProperty("creationTime")
    public String getCreationTime() { return creationTime; }
    @JsonProperty("creationTime")
    public void setCreationTime(String value) { this.creationTime = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("options")
    public Options getOptions() { return options; }
    @JsonProperty("options")
    public void setOptions(Options value) { this.options = value; }

    @JsonProperty("ownerId")
    public String getOwnerID() { return ownerID; }
    @JsonProperty("ownerId")
    public void setOwnerID(String value) { this.ownerID = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("transitGatewayArn")
    public String getTransitGatewayArn() { return transitGatewayArn; }
    @JsonProperty("transitGatewayArn")
    public void setTransitGatewayArn(String value) { this.transitGatewayArn = value; }

    @JsonProperty("transitGatewayId")
    public String getTransitGatewayID() { return transitGatewayID; }
    @JsonProperty("transitGatewayId")
    public void setTransitGatewayID(String value) { this.transitGatewayID = value; }

    @JsonProperty("tags")
    public Tag[] getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(Tag[] value) { this.tags = value; }
	@Override
	public String toString() {
		return "TransitGateway [creationTime=" + creationTime + ", description=" + description + ", options=" + options
				+ ", ownerID=" + ownerID + ", state=" + state + ", transitGatewayArn=" + transitGatewayArn
				+ ", transitGatewayID=" + transitGatewayID + ", tags=" + Arrays.toString(tags) + "]";
	}
}
