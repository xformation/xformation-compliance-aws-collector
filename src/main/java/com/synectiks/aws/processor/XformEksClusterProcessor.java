package com.synectiks.aws.processor;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synectiks.aws.entities.common.Tag;
import com.synectiks.aws.entities.ekscluster.ClusterLogging;
import com.synectiks.aws.entities.ekscluster.Oidc;
import com.synectiks.aws.entities.ekscluster.ResourcesVpcConfig;
import com.synectiks.aws.entities.ekscluster.XformEksCluster;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.eks.EksClient;
import software.amazon.awssdk.services.eks.model.Certificate;
import software.amazon.awssdk.services.eks.model.Cluster;
import software.amazon.awssdk.services.eks.model.DescribeClusterRequest;
import software.amazon.awssdk.services.eks.model.DescribeClusterResponse;
import software.amazon.awssdk.services.eks.model.Identity;
import software.amazon.awssdk.services.eks.model.KubernetesNetworkConfigResponse;
import software.amazon.awssdk.services.eks.model.ListClustersResponse;
import software.amazon.awssdk.services.eks.model.LogSetup;
import software.amazon.awssdk.services.eks.model.Logging;
import software.amazon.awssdk.services.eks.model.VpcConfigResponse;

public class XformEksClusterProcessor extends XformAwsProcessor {

	private static final Logger logger = LoggerFactory.getLogger(XformEksClusterProcessor.class);

	public XformEksClusterProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
	}

	@Override
	public List<Cluster> getCloudObject() {
		logger.info("Start getClusters");
		EksClient client = EksClient.builder().credentialsProvider(getAwsCredentialsProvider()).region(getRegion())
				.build();

		ListClustersResponse resp = client.listClusters();
		List<Cluster> list = new ArrayList<>();
		for (String clusterName : resp.clusters()) {
			logger.debug("Cluster name : " + clusterName);
			DescribeClusterRequest dcReq = DescribeClusterRequest.builder().name(clusterName).build();
			DescribeClusterResponse dcResp = client.describeCluster(dcReq);
			list.add(dcResp.cluster());
		}
		logger.info("End getClusters");
		return list;
	}

	@Override
	public List<XformEksCluster> getXformObject() throws IOException {
		List<Cluster> clusterList = getCloudObject();
		List<XformEksCluster> xformClusterList = new ArrayList<>();
		for (Cluster cluster : clusterList) {
			Optional<String> name = cluster.getValueForField("name", String.class);
			Optional<String> arn = cluster.getValueForField("arn", String.class);
			Optional<Instant> createdAt = cluster.getValueForField("createdAt", Instant.class);
			Optional<String> version = cluster.getValueForField("version", String.class);
			Optional<String> endpoint = cluster.getValueForField("endpoint", String.class);
			Optional<String> roleArn = cluster.getValueForField("roleArn", String.class);
			Optional<VpcConfigResponse> resourcesVpcConfig = cluster.getValueForField("resourcesVpcConfig",
					VpcConfigResponse.class);
			Optional<KubernetesNetworkConfigResponse> kubernetesNetworkConfig = cluster
					.getValueForField("kubernetesNetworkConfig", KubernetesNetworkConfigResponse.class);
			Optional<Logging> logging = cluster.getValueForField("logging", Logging.class);
			Optional<Identity> identity = cluster.getValueForField("identity", Identity.class);
			Optional<String> status = cluster.getValueForField("status", String.class);
			Optional<Certificate> certificateAuthority = cluster.getValueForField("certificateAuthority",
					Certificate.class);
			Optional<String> clientRequestToken = cluster.getValueForField("clientRequestToken", String.class);
			Optional<String> platformVersion = cluster.getValueForField("platformVersion", String.class);
			Optional<Map> tags = cluster.getValueForField("tags", Map.class);
			Optional<List> encryptionConfig = cluster.getValueForField("encryptionConfig", List.class);

			XformEksCluster cl = new XformEksCluster();
			if (name.isPresent()) {
				cl.setClusterName(name.get());
				cl.setName(name.get());
			}
			if (arn.isPresent()) {
				cl.setArn(arn.get());
			}
			if (createdAt.isPresent()) {
				cl.setCreatedAt(createdAt.get().toString());
			}
			if (version.isPresent()) {
				cl.setVersion(version.get());
			}
			if (endpoint.isPresent()) {
				cl.setEndpoint(endpoint.get());
			}
			if (roleArn.isPresent()) {
				cl.setRoleArn(roleArn.get());
			}
			if (resourcesVpcConfig.isPresent()) {
				cl.setResourcesVpcConfig(setVpcConfig(resourcesVpcConfig.get()));
			}
			if (kubernetesNetworkConfig.isPresent()) {
				cl.setKubernetesNetworkConfig(kubernetesNetworkConfig.get());
			}
			if (logging.isPresent()) {
				cl.setLogging(setLogging(logging.get()));
			}
			if (identity.isPresent()) {
				com.synectiks.aws.entities.ekscluster.Identity eksIdentity = new com.synectiks.aws.entities.ekscluster.Identity();
				Oidc eksOidc = new Oidc();
				eksOidc.setIssuer(identity.get().oidc().issuer());
				eksIdentity.setOidc(eksOidc);
				cl.setIdentity(eksIdentity);
			}
			if (status.isPresent()) {
				cl.setStatus(status.get());
			}
			if (certificateAuthority.isPresent()) {
				cl.setCertificateAuthority(certificateAuthority.get());
			}
			if (clientRequestToken.isPresent()) {
				cl.setClientRequestToken(clientRequestToken.get());
			}
			if (platformVersion.isPresent()) {
				cl.setPlatformVersion(platformVersion.get());
			}
			if (tags.isPresent()) {
				Map<String, String> tagMap = tags.get();
				List<Tag> tagList = new ArrayList<>();
				for (Map.Entry<String, String> entry : tagMap.entrySet()) {
					Tag tag = new Tag();
					tag.setKey(entry.getKey());
					tag.setValue(entry.getValue());
					tagList.add(tag);
				}
				cl.setTags(tagList);
			}
			if (encryptionConfig.isPresent()) {
				cl.setEncryptionConfig(encryptionConfig.get());
			}
			cl.setRegion(getRegionAsText());
			cl.setAccountNumber(getAwsAccountNumber());
			xformClusterList.add(cl);
		}
		return xformClusterList;
	}

	private com.synectiks.aws.entities.ekscluster.Logging setLogging(Logging logging) {
		com.synectiks.aws.entities.ekscluster.Logging eksLogging = new com.synectiks.aws.entities.ekscluster.Logging();
		List<ClusterLogging> clusterLoggingList = new ArrayList<>();
		if (logging.hasClusterLogging()) {
			for (LogSetup logSetup : logging.clusterLogging()) {
				ClusterLogging cl = new ClusterLogging();
				cl.setEnabled(logSetup.enabled());
				cl.setTypes(logSetup.types());
				clusterLoggingList.add(cl);
			}
		}

		eksLogging.setClusterLogging(clusterLoggingList);
		return eksLogging;
	}

	private ResourcesVpcConfig setVpcConfig(VpcConfigResponse vpcConfigResponse) {
		ResourcesVpcConfig vpcConfig = new ResourcesVpcConfig();
		if (vpcConfigResponse == null) {
			return null;
		}
		vpcConfig.setVpcID(vpcConfigResponse.vpcId());
		vpcConfig.setEndpointPrivateAccess(vpcConfigResponse.endpointPrivateAccess());
		vpcConfig.setEndpointPublicAccess(vpcConfigResponse.endpointPublicAccess());

//	    vpcConfig.setPublicAccessCidrs(vpcConfigResponse.publicAccessCidrs());
//	    private PublicAccessCIDR[] publicAccessCidrs;
//	    
//	    vpcConfig.setAdditionalSecurityGroups(vpcConfigResponse.securityGroupIds());
//	    private SecurityGroup[] additionalSecurityGroups;
//	    
//	    vpcConfig.setClusterSecurityGroup(vpcConfigResponse.clusterSecurityGroupId());
//	    private SecurityGroup clusterSecurityGroup;
//	    
//	    vpcConfig.setSubnetIDS(vpcConfigResponse.subnetIds());
//	    private PublicAccessCIDR[] subnetIDS;

		return vpcConfig;
	}

	@Override
	protected <T> T getXformObjectById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
