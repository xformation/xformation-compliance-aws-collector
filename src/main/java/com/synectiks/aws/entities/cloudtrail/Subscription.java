package com.synectiks.aws.entities.cloudtrail;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class Subscription implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String subscriptionArn;
    private String topicArn;
    private String owner;
    private String endpoint;
    private String protocol;

    @JsonProperty("subscriptionArn")
    public String getSubscriptionArn() { return subscriptionArn; }
    @JsonProperty("subscriptionArn")
    public void setSubscriptionArn(String value) { this.subscriptionArn = value; }

    @JsonProperty("topicArn")
    public String getTopicArn() { return topicArn; }
    @JsonProperty("topicArn")
    public void setTopicArn(String value) { this.topicArn = value; }

    @JsonProperty("owner")
    public String getOwner() { return owner; }
    @JsonProperty("owner")
    public void setOwner(String value) { this.owner = value; }

    @JsonProperty("endpoint")
    public String getEndpoint() { return endpoint; }
    @JsonProperty("endpoint")
    public void setEndpoint(String value) { this.endpoint = value; }

    @JsonProperty("protocol")
    public String getProtocol() { return protocol; }
    @JsonProperty("protocol")
    public void setProtocol(String value) { this.protocol = value; }
}
