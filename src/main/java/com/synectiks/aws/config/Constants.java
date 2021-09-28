package com.synectiks.aws.config;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import software.amazon.awssdk.regions.Region;

public final class Constants {

	public static final String SYSTEM_ACCOUNT = "system";
	public static final String ACTIVE = "ACTIVE";
	public static final String DEACTIVE = "DEACTIVE";
	public static final Region DEFAULT_REGION = Region.US_EAST_1;
	public static final String DEFAULT_TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_TIMESTAMP_FORMAT).withZone(ZoneId.systemDefault());
	
	private Constants() {
	}
}
