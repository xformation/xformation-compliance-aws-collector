package com.synectiks.aws.entities.cloudtrail;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class Status implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String isLogging;
    private String latestCloudWatchLogsDeliveryError;
    private String latestCloudWatchLogsDeliveryTime;
    private String latestDeliveryAttemptSucceeded;
    private String latestDeliveryAttemptTime;
    private String latestDeliveryError;
    private String latestDeliveryErrorString;
    private String latestDeliveryTime;
    private String latestDigestDeliveryError;
    private String latestDigestDeliveryTime;
    private String latestNotificationAttemptSucceeded;
    private String latestNotificationAttemptTime;
    private String latestNotificationError;
    private String latestNotificationTime;
    private String startLoggingTime;
    private String stopLoggingTime;
    private String timeLoggingStarted;
    private String timeLoggingStopped;

    @JsonProperty("isLogging")
    public String getIsLogging() { return isLogging; }
    @JsonProperty("isLogging")
    public void setIsLogging(String value) { this.isLogging = value; }

    @JsonProperty("latestCloudWatchLogsDeliveryError")
    public String getLatestCloudWatchLogsDeliveryError() { return latestCloudWatchLogsDeliveryError; }
    @JsonProperty("latestCloudWatchLogsDeliveryError")
    public void setLatestCloudWatchLogsDeliveryError(String value) { this.latestCloudWatchLogsDeliveryError = value; }

    @JsonProperty("latestCloudWatchLogsDeliveryTime")
    public String getLatestCloudWatchLogsDeliveryTime() { return latestCloudWatchLogsDeliveryTime; }
    @JsonProperty("latestCloudWatchLogsDeliveryTime")
    public void setLatestCloudWatchLogsDeliveryTime(String value) { this.latestCloudWatchLogsDeliveryTime = value; }

    @JsonProperty("latestDeliveryAttemptSucceeded")
    public String getLatestDeliveryAttemptSucceeded() { return latestDeliveryAttemptSucceeded; }
    @JsonProperty("latestDeliveryAttemptSucceeded")
    public void setLatestDeliveryAttemptSucceeded(String value) { this.latestDeliveryAttemptSucceeded = value; }

    @JsonProperty("latestDeliveryAttemptTime")
    public String getLatestDeliveryAttemptTime() { return latestDeliveryAttemptTime; }
    @JsonProperty("latestDeliveryAttemptTime")
    public void setLatestDeliveryAttemptTime(String value) { this.latestDeliveryAttemptTime = value; }

    @JsonProperty("latestDeliveryError")
    public String getLatestDeliveryError() { return latestDeliveryError; }
    @JsonProperty("latestDeliveryError")
    public void setLatestDeliveryError(String value) { this.latestDeliveryError = value; }

    @JsonProperty("latestDeliveryErrorString")
    public String getLatestDeliveryErrorString() { return latestDeliveryErrorString; }
    @JsonProperty("latestDeliveryErrorString")
    public void setLatestDeliveryErrorString(String value) { this.latestDeliveryErrorString = value; }

    @JsonProperty("latestDeliveryTime")
    public String getLatestDeliveryTime() { return latestDeliveryTime; }
    @JsonProperty("latestDeliveryTime")
    public void setLatestDeliveryTime(String value) { this.latestDeliveryTime = value; }

    @JsonProperty("latestDigestDeliveryError")
    public String getLatestDigestDeliveryError() { return latestDigestDeliveryError; }
    @JsonProperty("latestDigestDeliveryError")
    public void setLatestDigestDeliveryError(String value) { this.latestDigestDeliveryError = value; }

    @JsonProperty("latestDigestDeliveryTime")
    public String getLatestDigestDeliveryTime() { return latestDigestDeliveryTime; }
    @JsonProperty("latestDigestDeliveryTime")
    public void setLatestDigestDeliveryTime(String value) { this.latestDigestDeliveryTime = value; }

    @JsonProperty("latestNotificationAttemptSucceeded")
    public String getLatestNotificationAttemptSucceeded() { return latestNotificationAttemptSucceeded; }
    @JsonProperty("latestNotificationAttemptSucceeded")
    public void setLatestNotificationAttemptSucceeded(String value) { this.latestNotificationAttemptSucceeded = value; }

    @JsonProperty("latestNotificationAttemptTime")
    public String getLatestNotificationAttemptTime() { return latestNotificationAttemptTime; }
    @JsonProperty("latestNotificationAttemptTime")
    public void setLatestNotificationAttemptTime(String value) { this.latestNotificationAttemptTime = value; }

    @JsonProperty("latestNotificationError")
    public String getLatestNotificationError() { return latestNotificationError; }
    @JsonProperty("latestNotificationError")
    public void setLatestNotificationError(String value) { this.latestNotificationError = value; }

    @JsonProperty("latestNotificationTime")
    public String getLatestNotificationTime() { return latestNotificationTime; }
    @JsonProperty("latestNotificationTime")
    public void setLatestNotificationTime(String value) { this.latestNotificationTime = value; }

    @JsonProperty("startLoggingTime")
    public String getStartLoggingTime() { return startLoggingTime; }
    @JsonProperty("startLoggingTime")
    public void setStartLoggingTime(String value) { this.startLoggingTime = value; }

    @JsonProperty("stopLoggingTime")
    public String getStopLoggingTime() { return stopLoggingTime; }
    @JsonProperty("stopLoggingTime")
    public void setStopLoggingTime(String value) { this.stopLoggingTime = value; }

    @JsonProperty("timeLoggingStarted")
    public String getTimeLoggingStarted() { return timeLoggingStarted; }
    @JsonProperty("timeLoggingStarted")
    public void setTimeLoggingStarted(String value) { this.timeLoggingStarted = value; }

    @JsonProperty("timeLoggingStopped")
    public String getTimeLoggingStopped() { return timeLoggingStopped; }
    @JsonProperty("timeLoggingStopped")
    public void setTimeLoggingStopped(String value) { this.timeLoggingStopped = value; }
}
