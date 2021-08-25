package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

public class Ebs {
    private String deleteOnTermination;
    private String encrypted;
    private String iops;
    private String snapshotID;
    private String volumeSize;
    private String volumeType;

    @JsonProperty("deleteOnTermination")
    public String getDeleteOnTermination() { return deleteOnTermination; }
    @JsonProperty("deleteOnTermination")
    public void setDeleteOnTermination(String value) { this.deleteOnTermination = value; }

    @JsonProperty("encrypted")
    public String getEncrypted() { return encrypted; }
    @JsonProperty("encrypted")
    public void setEncrypted(String value) { this.encrypted = value; }

    @JsonProperty("iops")
    public String getIops() { return iops; }
    @JsonProperty("iops")
    public void setIops(String value) { this.iops = value; }

    @JsonProperty("snapshotId")
    public String getSnapshotID() { return snapshotID; }
    @JsonProperty("snapshotId")
    public void setSnapshotID(String value) { this.snapshotID = value; }

    @JsonProperty("volumeSize")
    public String getVolumeSize() { return volumeSize; }
    @JsonProperty("volumeSize")
    public void setVolumeSize(String value) { this.volumeSize = value; }

    @JsonProperty("volumeType")
    public String getVolumeType() { return volumeType; }
    @JsonProperty("volumeType")
    public void setVolumeType(String value) { this.volumeType = value; }
}
