package com.synectiks.aws.s3;

import java.util.List;

import com.synectiks.aws.config.Constants;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.rds.RdsClient;
import software.amazon.awssdk.services.rds.model.AccountQuota;
import software.amazon.awssdk.services.rds.model.DescribeAccountAttributesRequest;
import software.amazon.awssdk.services.rds.model.DescribeAccountAttributesResponse;
import software.amazon.awssdk.services.rds.model.RdsException;

public class DescribeAccountAttributes {

	public static void main(String[] args) {

		Region region = Constants.DEFAULT_REGION;
		RdsClient rdsClient = RdsClient.builder().region(region).build();

		getAccountAttributes(rdsClient);
		rdsClient.close();
	}

	// snippet-start:[rds.java2.describe_account.main]
	public static void getAccountAttributes(RdsClient rdsClient) {

		try {
			DescribeAccountAttributesRequest accountAttributesRequest = DescribeAccountAttributesRequest.builder()
					.build();

			DescribeAccountAttributesResponse response = rdsClient.describeAccountAttributes();
			List<AccountQuota> quotasList = response.accountQuotas();

			for (AccountQuota quotas : quotasList) {
				System.out.println("Name is: " + quotas.accountQuotaName());
				System.out.println("Max value is " + quotas.max());
			}

		} catch (RdsException e) {
			System.out.println(e.getLocalizedMessage());
			System.exit(1);
		}
	}
}
