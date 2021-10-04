package com.synectiks.aws.processor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.synectiks.aws.entities.common.ProcessorUtils;
import com.synectiks.aws.entities.iam.XformIAM;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.model.IamInstanceProfile;
import software.amazon.awssdk.services.ec2.model.Instance;
import software.amazon.awssdk.services.ec2.model.InstanceState;
import software.amazon.awssdk.services.ec2.model.Monitoring;
import software.amazon.awssdk.services.ec2.model.Placement;
import software.amazon.awssdk.services.ec2.model.StateReason;
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
	public List<XformIAM>  getXformObject() throws Exception {
		IamClient iam = getCloudObject();
		List<XformIAM> iams=new ArrayList<>();
		List<User> listUsers = listAllUsers(iam);
		for (User user : listUsers) {
			Optional<String> path = user.getValueForField("Path", String.class);
			Optional<String> userName = user.getValueForField("UserName", String.class);
			Optional<String> UserId = user.getValueForField("UserId", String.class);
			Optional<String> arn = user.getValueForField("Arn", String.class);
			Optional<Instant> createDate = user.getValueForField("CreateDate", Instant.class);
			Optional<String> passwordLastUsed = user.getValueForField("passwordLastUsed", String.class);
			Optional<String> permissionsBoundary = user.getValueForField("PermissionsBoundary", String.class);
			Optional<List> tags = user.getValueForField("Tags", List.class);
			XformIAM xformIAM=new XformIAM();
			if (path.isPresent()) {
				xformIAM.setAccountNumber(getAwsAccountNumber());
			}
			if (userName.isPresent()) {
				xformIAM.setName(userName.get());
			}
			if (UserId.isPresent()) {
				xformIAM.setID(UserId.get());
			}
			if (arn.isPresent()) {
				xformIAM.setArn(arn.get());
			}
			if (createDate.isPresent()) {
				xformIAM.setCreateDate(createDate.get().toString());
			}
			if (passwordLastUsed.isPresent()) {
				xformIAM.setPasswordLastUsed(passwordLastUsed.get());
			}
			if (permissionsBoundary.isPresent()) {
//				xformIAM.setPermissionsBoundary(permissionsBoundary.get());
			}
			if (tags.isPresent()) {
				xformIAM.setTags(ProcessorUtils.getXformTagList(tags.get()));
			}
			iams.add(xformIAM);
		}
		return iams;
	}

	@Override
	protected <T> T getXformObjectById(String id) throws Exception {
		return null;
	}

	public List<User> listAllUsers(IamClient iam) {
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
		return response.users();
	}

}
