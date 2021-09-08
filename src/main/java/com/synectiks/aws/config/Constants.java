package com.synectiks.aws.config;

import software.amazon.awssdk.regions.Region;

public final class Constants {

	public static final String SYSTEM_ACCOUNT = "system";
	public static final String ACTIVE = "ACTIVE";
	public static final String DEACTIVE = "DEACTIVE";
	public static final Region DEFAULT_REGION = Region.US_EAST_1;

	private Constants() {
	}
}
