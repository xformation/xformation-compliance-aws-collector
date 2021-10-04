package com.synectiks.aws.processor;

import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.iam.IamClient;
import software.amazon.awssdk.services.iam.model.IamException;
import software.amazon.awssdk.services.iam.model.ListUsersRequest;
import software.amazon.awssdk.services.iam.model.ListUsersResponse;
import software.amazon.awssdk.services.iam.model.User;

public class IAMProcessor extends XformAwsProcessor {

	public IAMProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
	}

	@Override
	public IamClient getCloudObject() throws Exception {
		Region region = Region.AWS_GLOBAL;
		IamClient iam = IamClient.builder().credentialsProvider(awsCredentialsProvider).region(region).build();
		return iam;
	}

	@Override
	protected <T> T getXformObject() throws Exception {
		return null;
	}

	@Override
	protected <T> T getXformObjectById(String id) throws Exception {
		return null;
	}

	public ListUsersResponse listAllUsers(IamClient iam) {
		ListUsersResponse response = null;
		try {

			boolean done = false;
			String newMarker = null;

			while (!done) {
				if (newMarker == null) {
					ListUsersRequest request = ListUsersRequest.builder().build();
					response = iam.listUsers(request);
				} else {
					ListUsersRequest request = ListUsersRequest.builder().marker(newMarker).build();
					response = iam.listUsers(request);
				}
//				for (User user : response.users()) {
//					System.out.format("\n Retrieved user %s", user.userName());
//				}
				if (!response.isTruncated()) {
					done = true;
				} else {
					newMarker = response.marker();
				}
			}
		} catch (IamException e) {
			System.err.println(e.awsErrorDetails().errorMessage());
			System.exit(1);
		}

		// snippet-end:[iam.java2.list_users.main]
		return response;
	}

}
