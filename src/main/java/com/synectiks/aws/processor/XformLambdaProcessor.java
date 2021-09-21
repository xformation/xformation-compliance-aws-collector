package com.synectiks.aws.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.synectiks.aws.entities.lambda.DeadLetterConfig;
import com.synectiks.aws.entities.lambda.XformLambda;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.ec2.model.IamInstanceProfile;
import software.amazon.awssdk.services.ec2.model.InstanceState;
import software.amazon.awssdk.services.lambda.LambdaClient;
import software.amazon.awssdk.services.lambda.model.EnvironmentResponse;
import software.amazon.awssdk.services.lambda.model.FunctionConfiguration;
import software.amazon.awssdk.services.lambda.model.GetAccountSettingsResponse;
import software.amazon.awssdk.services.lambda.model.LambdaException;
import software.amazon.awssdk.services.lambda.model.ListFunctionsResponse;
import software.amazon.awssdk.services.lambda.model.TracingConfigResponse;
import software.amazon.awssdk.services.lambda.model.VpcConfigResponse;

public class XformLambdaProcessor extends XformAwsProcessor {

	public XformLambdaProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected LambdaClient getCloudObject() throws Exception {
		// TODO Auto-generated method stub
		LambdaClient awsLambdaClient = LambdaClient.builder().credentialsProvider(awsCredentialsProvider)
				.region(getRegion()).build();
		return awsLambdaClient;
	}

	@Override
	public List<XformLambda> getXformObject() throws Exception {
		// TODO Auto-generated method stub
		LambdaClient awsLambda = getCloudObject();
		List<XformLambda> lambdas = new ArrayList<>();
		try {
			ListFunctionsResponse functionResult = awsLambda.listFunctions();
			List<FunctionConfiguration> list = functionResult.functions();

			for (FunctionConfiguration functionConfiguration : list) {
				Optional<String> functionName = functionConfiguration.getValueForField("FunctionName", String.class);
				Optional<String> functionArn = functionConfiguration.getValueForField("FunctionArn", String.class);
				Optional<String> role = functionConfiguration.getValueForField("Role", String.class);
				Optional<String> handler = functionConfiguration.getValueForField("Handler", String.class);
				Optional<Long> codeSize = functionConfiguration.getValueForField("CodeSize", Long.class);
				Optional<String> description = functionConfiguration.getValueForField("Description", String.class);
				Optional<Integer> timeout = functionConfiguration.getValueForField("Timeout", Integer.class);
				Optional<Integer> memorySize = functionConfiguration.getValueForField("MemorySize", Integer.class);
				Optional<String> lastModified = functionConfiguration.getValueForField("LastModified", String.class);
				Optional<String> codeSha256 = functionConfiguration.getValueForField("CodeSha256", String.class);
				Optional<String> version = functionConfiguration.getValueForField("Version", String.class);
				Optional<VpcConfigResponse> vpcConfig = functionConfiguration.getValueForField("VpcConfig",
						VpcConfigResponse.class);
				Optional<DeadLetterConfig> deadLetterConfig = functionConfiguration.getValueForField("DeadLetterConfig",
						DeadLetterConfig.class);
				Optional<EnvironmentResponse> environment = functionConfiguration.getValueForField("Environment",
						EnvironmentResponse.class);
				Optional<String> kMSKeyArn = functionConfiguration.getValueForField("KMSKeyArn", String.class);
				Optional<TracingConfigResponse> tracingConfig = functionConfiguration.getValueForField("TracingConfig",
						TracingConfigResponse.class);
				Optional<InstanceState> masterArn = functionConfiguration.getValueForField("MasterArn",
						InstanceState.class);
				Optional<String> revisionId = functionConfiguration.getValueForField("RevisionId", String.class);
				Optional<List> layers = functionConfiguration.getValueForField("Layers", List.class);
				Optional<String> state = functionConfiguration.getValueForField("State", String.class);
				Optional<String> stateReason = functionConfiguration.getValueForField("StateReason", String.class);
				Optional<List> stateReasonCode = functionConfiguration.getValueForField("StateReasonCode", List.class);
				Optional<String> lastUpdateStatus = functionConfiguration.getValueForField("lastUpdateStatus",
						String.class);
				Optional<Boolean> lastUpdateStatusReasonCode = functionConfiguration
						.getValueForField("LastUpdateStatusReasonCode", Boolean.class);
				Optional<List> fileSystemConfigs = functionConfiguration.getValueForField("FileSystemConfigs",
						List.class);
				Optional<String> packageType = functionConfiguration.getValueForField("PackageType", String.class);
				Optional<IamInstanceProfile> imageConfigResponse = functionConfiguration
						.getValueForField("ImageConfigResponse", IamInstanceProfile.class);
				Optional<String> signingProfileVersionArn = functionConfiguration
						.getValueForField("SigningProfileVersionArn", String.class);
				Optional<List> signingJobArn = functionConfiguration.getValueForField("signingJobArn", List.class);
				XformLambda lambda = new XformLambda();
				lambda.setAccessAnalyzerFindingCount(null);
				lambda.setAccountNumber(getAwsAccountNumber());
				if (functionArn.isPresent()) {
					lambda.setArn(functionArn.get());
				}
				if (codeSha256.isPresent()) {
					lambda.setCodeSha256(null);
				}
				if (codeSize.isPresent()) {
					lambda.setCodeSize(codeSize.get().toString());
				}
				if (deadLetterConfig.isPresent()) {
					lambda.setDeadLetterConfig(deadLetterConfig.get());
				}
				if (description.isPresent()) {
					lambda.setDescription(description.get());
				}
				if (environment.isPresent()) {
					lambda.setEnvironment(environment.get().toString());
				}
//				lambda.setEnvironmentVariables(null);
				if (role.isPresent()) {
//					lambda.setExecutionRole(role.get());

				}
				if (functionArn.isPresent()) {
					lambda.setExecutionRoleArn(functionArn.get());
				}
//				lambda.setExternalFindings(null);
				if (handler.isPresent()) {
					lambda.setHandler(handler.get());
				}
//				lambda.setId(null);
//				lambda.setID(null);
//				lambda.setInboundRules(null);
				if (kMSKeyArn.isPresent()) {
					lambda.setKmsKeyArn(kMSKeyArn.get());
				}
				if (lastModified.isPresent()) {
					lambda.setLastModified(lastModified.get());
				}
				if (memorySize.isPresent()) {
					lambda.setMemory(memorySize.get().toString());
				}
				if (functionName.isPresent()) {
					lambda.setName(functionName.get());
				}
				lambda.setNics(null);
				lambda.setOutboundRules(null);
				lambda.setRegion(getRegionAsText());
				lambda.setResourcePolicy(null);
				lambda.setSecurityGroups(null);
				lambda.setTags(null);
				if (tracingConfig.isPresent()) {
					// convert Original tracking config to local tracking config
//					lambda.setTracingConfig(tracingConfig.get());
				}
				if (packageType.isPresent()) {
					lambda.setType(packageType.get());
				}
				lambda.setVendor(null);
				if (version.isPresent()) {
					lambda.setVersion(version.get());
				}
				if (vpcConfig.isPresent()) {
					VpcConfigResponse config = vpcConfig.get();
//					lambda.setVpc(null);
				}
				lambdas.add(lambda);
			}

		} catch (LambdaException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
		return lambdas;
	}

	public static void listFunctions(LambdaClient awsLambda) {

		try {
			ListFunctionsResponse functionResult = awsLambda.listFunctions();
			List<FunctionConfiguration> list = functionResult.functions();

			for (FunctionConfiguration config : list) {
				System.out.println("The function name is " + config.functionName());

			}

		} catch (LambdaException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
		// snippet-end:[lambda.java2.list.main]
	}

	public static void getSettings(LambdaClient awsLambda) {

		try {
			GetAccountSettingsResponse response = awsLambda.getAccountSettings();
			System.out.println(
					"Total code size for your account is " + response.accountLimit().totalCodeSize() + " bytes");

		} catch (LambdaException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}

}
