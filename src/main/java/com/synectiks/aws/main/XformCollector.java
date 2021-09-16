package com.synectiks.aws.main;

import com.amazonaws.services.securitytoken.AWSSecurityTokenService;

public interface XformCollector  {
	
	public String getAwsAccountNumber();
	public AWSSecurityTokenService getAWSSecurityTokenService();
	
}
