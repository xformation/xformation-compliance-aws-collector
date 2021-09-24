package com.synectiks.aws.entities.cloudtrail;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class Action implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String action;
    private List<Subscription> subscriptions;

    @JsonProperty("action")
    public String getAction() { return action; }
    @JsonProperty("action")
    public void setAction(String value) { this.action = value; }

    @JsonProperty("subscriptions")
    public List<Subscription> getSubscriptions() { return subscriptions; }
    @JsonProperty("subscriptions")
    public void setSubscriptions(List<Subscription> value) { this.subscriptions = value; }
}
