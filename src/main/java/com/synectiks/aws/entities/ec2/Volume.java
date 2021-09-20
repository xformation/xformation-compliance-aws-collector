package com.synectiks.aws.entities.ec2;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class Volume implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<AttachmentElement> attachments;
    private String availabilityZone;
    private String createTime;
    private String encrypted;
    private String iops;
    private String kmsKeyID;
    private String size;
    private String snapshotID;
    private String state;
    private List<Tag> tags;
    private String volumeID;
    private String volumeType;
    private EncryptionKey encryptionKey;

    @JsonProperty("attachments")
    public List<AttachmentElement> getAttachments() { return attachments; }
    @JsonProperty("attachments")
    public void setAttachments(List<AttachmentElement> value) { this.attachments = value; }

    @JsonProperty("availabilityZone")
    public String getAvailabilityZone() { return availabilityZone; }
    @JsonProperty("availabilityZone")
    public void setAvailabilityZone(String value) { this.availabilityZone = value; }

    @JsonProperty("createTime")
    public String getCreateTime() { return createTime; }
    @JsonProperty("createTime")
    public void setCreateTime(String value) { this.createTime = value; }

    @JsonProperty("encrypted")
    public String getEncrypted() { return encrypted; }
    @JsonProperty("encrypted")
    public void setEncrypted(String value) { this.encrypted = value; }

    @JsonProperty("iops")
    public String getIops() { return iops; }
    @JsonProperty("iops")
    public void setIops(String value) { this.iops = value; }

    @JsonProperty("kmsKeyId")
    public String getKmsKeyID() { return kmsKeyID; }
    @JsonProperty("kmsKeyId")
    public void setKmsKeyID(String value) { this.kmsKeyID = value; }

    @JsonProperty("size")
    public String getSize() { return size; }
    @JsonProperty("size")
    public void setSize(String value) { this.size = value; }

    @JsonProperty("snapshotId")
    public String getSnapshotID() { return snapshotID; }
    @JsonProperty("snapshotId")
    public void setSnapshotID(String value) { this.snapshotID = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("tags")
    public List<Tag> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<Tag> value) { this.tags = value; }

    @JsonProperty("volumeId")
    public String getVolumeID() { return volumeID; }
    @JsonProperty("volumeId")
    public void setVolumeID(String value) { this.volumeID = value; }

    @JsonProperty("volumeType")
    public String getVolumeType() { return volumeType; }
    @JsonProperty("volumeType")
    public void setVolumeType(String value) { this.volumeType = value; }

    @JsonProperty("encryptionKey")
    public EncryptionKey getEncryptionKey() { return encryptionKey; }
    @JsonProperty("encryptionKey")
    public void setEncryptionKey(EncryptionKey value) { this.encryptionKey = value; }
	@Override
	public String toString() {
		return "Volume [attachments=" + attachments + ", availabilityZone=" + availabilityZone + ", createTime="
				+ createTime + ", encrypted=" + encrypted + ", iops=" + iops + ", kmsKeyID=" + kmsKeyID + ", size="
				+ size + ", snapshotID=" + snapshotID + ", state=" + state + ", tags=" + tags + ", volumeID=" + volumeID
				+ ", volumeType=" + volumeType + ", encryptionKey=" + encryptionKey + "]";
	}
}
