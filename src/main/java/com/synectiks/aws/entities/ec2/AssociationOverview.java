package com.synectiks.aws.entities.ec2;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AssociationOverview implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String detailedStatus;
	private List<Tag> instanceAssociationStatusAggregatedCount;

	@JsonProperty("detailedStatus")
	public String getDetailedStatus() {
		return detailedStatus;
	}

	@JsonProperty("detailedStatus")
	public void setDetailedStatus(String value) {
		this.detailedStatus = value;
	}

	@JsonProperty("instanceAssociationStatusAggregatedCount")
	public List<Tag> getInstanceAssociationStatusAggregatedCount() {
		return instanceAssociationStatusAggregatedCount;
	}

	@JsonProperty("instanceAssociationStatusAggregatedCount")
	public void setInstanceAssociationStatusAggregatedCount(List<Tag> value) {
		this.instanceAssociationStatusAggregatedCount = value;
	}

	@Override
	public String toString() {
		return "AssociationOverview [detailedStatus=" + detailedStatus + ", instanceAssociationStatusAggregatedCount="
				+ instanceAssociationStatusAggregatedCount + "]";
	}

}
