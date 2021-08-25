package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class AssociationOverview {
    private String detailedStatus;
    private List<CustomTag> instanceAssociationStatusAggregatedCount;

    @JsonProperty("detailedStatus")
    public String getDetailedStatus() { return detailedStatus; }
    @JsonProperty("detailedStatus")
    public void setDetailedStatus(String value) { this.detailedStatus = value; }

    @JsonProperty("instanceAssociationStatusAggregatedCount")
    public List<CustomTag> getInstanceAssociationStatusAggregatedCount() { return instanceAssociationStatusAggregatedCount; }
    @JsonProperty("instanceAssociationStatusAggregatedCount")
    public void setInstanceAssociationStatusAggregatedCount(List<CustomTag> value) { this.instanceAssociationStatusAggregatedCount = value; }
}
