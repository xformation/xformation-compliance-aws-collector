package com.synectiks.aws.processor;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synectiks.aws.entities.ec2.XformEc2;
import com.synectiks.aws.main.XformAwsProcessor;

import software.amazon.awssdk.services.ec2.Ec2Client;
import software.amazon.awssdk.services.ec2.model.CapacityReservationSpecificationResponse;
import software.amazon.awssdk.services.ec2.model.CpuOptions;
import software.amazon.awssdk.services.ec2.model.DescribeInstancesRequest;
import software.amazon.awssdk.services.ec2.model.EnclaveOptions;
import software.amazon.awssdk.services.ec2.model.HibernationOptions;
import software.amazon.awssdk.services.ec2.model.IamInstanceProfile;
import software.amazon.awssdk.services.ec2.model.Instance;
import software.amazon.awssdk.services.ec2.model.InstanceMetadataOptionsResponse;
import software.amazon.awssdk.services.ec2.model.InstanceState;
import software.amazon.awssdk.services.ec2.model.Monitoring;
import software.amazon.awssdk.services.ec2.model.Placement;
import software.amazon.awssdk.services.ec2.model.Reservation;
import software.amazon.awssdk.services.ec2.model.StateReason;
import software.amazon.awssdk.services.ec2.model.Tag;
import software.amazon.awssdk.services.ec2.model.Vpc;

public class XformAutoScalingProcessor extends XformAwsProcessor {

	private static final Logger logger = LoggerFactory.getLogger(XformAutoScalingProcessor.class);

	public XformAutoScalingProcessor(String accessKey, String secretKey, String region) {
		super(accessKey, secretKey, region);
	}

	@Override
	public List<Instance> getCloudObject() throws Exception {
		Ec2Client ec2 = getEc2Client();
		List<Instance> instanceList = new ArrayList<>();
		try {
			DescribeInstancesRequest request = DescribeInstancesRequest.builder().build();
			List<Reservation> listReservations = describeAwsEc2Instance(request);
			for (Reservation reservation : listReservations) {
				for (Instance instance : reservation.instances()) {
					instanceList.add(instance);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in getCloudObject: ", e);
		} finally {
			closeEc2Client(ec2);
		}
		return Collections.unmodifiableList(instanceList);
	}

	public List<Reservation> describeAwsEc2Instance(final DescribeInstancesRequest describeInstancesRequest) {
		Ec2Client ec2 = getEc2Client();
		List<Reservation> reservationList = new ArrayList<>();
		try {
			ec2.describeInstances(describeInstancesRequest).reservations();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception in describeInstances: ", e);
		} finally {
			closeEc2Client(ec2);
		}
		return Collections.unmodifiableList(reservationList);
	}

	@Override
	public List<XformEc2> getXformObject() throws Exception {
		List<Instance> instanceList = getCloudObject();
		List<XformEc2> xformEc2List = new ArrayList<XformEc2>();
		for (Instance in : instanceList) {
			Optional<Integer> amiLaunchIndex = in.getValueForField("AmiLaunchIndex", Integer.class);
			Optional<String> imageId = in.getValueForField("ImageId", String.class);
			Optional<String> instanceId = in.getValueForField("InstanceId", String.class);
			Optional<String> instanceType = in.getValueForField("InstanceType", String.class);
			Optional<String> kernelId = in.getValueForField("KernelId", String.class);
			Optional<String> keyName = in.getValueForField("KeyName", String.class);
			Optional<Instant> launchTime = in.getValueForField("LaunchTime", Instant.class);
			Optional<Monitoring> monitoring = in.getValueForField("Monitoring", Monitoring.class);
			Optional<Placement> placement = in.getValueForField("Placement", Placement.class);
			Optional<String> platform = in.getValueForField("Platform", String.class);
			Optional<String> privateDnsName = in.getValueForField("PrivateDnsName", String.class);
			Optional<String> privateIpAddress = in.getValueForField("PrivateIpAddress", String.class);
			Optional<List> productCodes = in.getValueForField("ProductCodes", List.class);
			Optional<String> publicDnsName = in.getValueForField("PublicDnsName", String.class);
			Optional<String> publicIpAddress = in.getValueForField("PublicIpAddress", String.class);
			Optional<String> ramdiskId = in.getValueForField("RamdiskId", String.class);
			Optional<InstanceState> state = in.getValueForField("State", InstanceState.class);
			Optional<String> stateTransitionReason = in.getValueForField("StateTransitionReason", String.class);
			Optional<String> subnetId = in.getValueForField("SubnetId", String.class);
			Optional<String> vpcId = in.getValueForField("VpcId", String.class);
			Optional<String> architecture = in.getValueForField("Architecture", String.class);
			Optional<List> blockDeviceMappings = in.getValueForField("BlockDeviceMappings", List.class);
			Optional<String> clientToken = in.getValueForField("ClientToken", String.class);
			Optional<Boolean> ebsOptimized = in.getValueForField("EbsOptimized", Boolean.class);
			Optional<Boolean> enaSupport = in.getValueForField("EnaSupport", Boolean.class);
			Optional<String> hypervisor = in.getValueForField("Hypervisor", String.class);
			Optional<IamInstanceProfile> iamInstanceProfile = in.getValueForField("IamInstanceProfile",
					IamInstanceProfile.class);
			Optional<String> instanceLifecycle = in.getValueForField("InstanceLifecycle", String.class);
			Optional<List> elasticGpuAssociations = in.getValueForField("ElasticGpuAssociations", List.class);
			Optional<List> elasticInferenceAcceleratorAssociations = in
					.getValueForField("ElasticInferenceAcceleratorAssociations", List.class);
			Optional<List> networkInterfaces = in.getValueForField("NetworkInterfaces", List.class);
			Optional<String> outpostArn = in.getValueForField("OutpostArn", String.class);
			Optional<String> rootDeviceName = in.getValueForField("RootDeviceName", String.class);
			Optional<String> rootDeviceType = in.getValueForField("RootDeviceType", String.class);
			Optional<List> securityGroups = in.getValueForField("SecurityGroups", List.class);
			Optional<Boolean> sourceDestCheck = in.getValueForField("SourceDestCheck", Boolean.class);
			Optional<String> spotInstanceRequestId = in.getValueForField("SpotInstanceRequestId", String.class);
			Optional<String> sriovNetSupport = in.getValueForField("SriovNetSupport", String.class);
			Optional<StateReason> stateReason = in.getValueForField("StateReason", StateReason.class);
			Optional<List> tags = in.getValueForField("Tags", List.class);
			Optional<String> virtualizationType = in.getValueForField("VirtualizationType", String.class);
			Optional<CpuOptions> cpuOptions = in.getValueForField("CpuOptions", CpuOptions.class);
			Optional<String> capacityReservationId = in.getValueForField("CapacityReservationId", String.class);
			Optional<CapacityReservationSpecificationResponse> capacityReservationSpecification = in.getValueForField(
					"CapacityReservationSpecification", CapacityReservationSpecificationResponse.class);
			Optional<HibernationOptions> hibernationOptions = in.getValueForField("HibernationOptions",
					HibernationOptions.class);
			Optional<List> licenses = in.getValueForField("Licenses", List.class);
			Optional<InstanceMetadataOptionsResponse> metadataOptions = in.getValueForField("MetadataOptions",
					InstanceMetadataOptionsResponse.class);
			Optional<EnclaveOptions> enclaveOptions = in.getValueForField("EnclaveOptions", EnclaveOptions.class);
			Optional<String> bootMode = in.getValueForField("BootMode", String.class);

			XformEc2 obj = new XformEc2();
			if (amiLaunchIndex.isPresent()) {
				obj.setAmiLaunchIndex(amiLaunchIndex.get());
			}
			if (imageId.isPresent()) {
				obj.setImage(imageId.get());
			}
			if (instanceId.isPresent()) {
				obj.setID(instanceId.get());
			}
			if (instanceType.isPresent()) {
				obj.setInstanceType(instanceType.get());
			}
			if (kernelId.isPresent()) {
				obj.setKernelID(kernelId.get());
			}
			if (keyName.isPresent()) {
				obj.setKeyName(keyName.get());
			}
			if (launchTime.isPresent()) {
				obj.setLaunchTime(launchTime.get());
			}
			if (monitoring.isPresent()) {
				obj.setMonitoring(monitoring.get());
			}
			if (placement.isPresent()) {
				obj.setPlacement(placement.get());
			}
			if (platform.isPresent()) {
				obj.setPlatform(platform.get());
			}
			if (privateDnsName.isPresent()) {
				obj.setPrivateDNS(privateDnsName.get());
			}
			if (privateIpAddress.isPresent()) {
				obj.setPrivateIpAddress(privateIpAddress.get());
			}
			if (productCodes.isPresent()) {
				obj.setProductCodes(productCodes.get());
			}
			if (publicDnsName.isPresent()) {
				obj.setPublicDNS(publicDnsName.get());
			}
			if (publicIpAddress.isPresent()) {
				obj.setPublicIpAddress(publicIpAddress.get());
			}
			if (ramdiskId.isPresent()) {
				obj.setRamdiskId(ramdiskId.get());
			}
			if (state.isPresent()) {
				obj.setState(state.get());
			}
			if (stateTransitionReason.isPresent()) {
				obj.setStateTransitionReason(stateTransitionReason.get());
			}
			if (subnetId.isPresent()) {
				obj.setSubnetId(subnetId.get());
			}
			if (vpcId.isPresent()) {
				obj.setVpcId(vpcId.get());
				obj.setVpc(getEc2Vpc(vpcId.get()));
			}
			if (architecture.isPresent()) {
				obj.setArchitecture(architecture.get());
			}
			if (blockDeviceMappings.isPresent()) {
				obj.setBlockDeviceMappings(blockDeviceMappings.get());
			}
			if (clientToken.isPresent()) {
				obj.setClientToken(clientToken.get());
			}
			if (ebsOptimized.isPresent()) {
				obj.setEbsOptimized(ebsOptimized.get());
			}
			if (enaSupport.isPresent()) {
				obj.setEnaSupport(enaSupport.get());
			}
			if (hypervisor.isPresent()) {
				obj.setHypervisor(hypervisor.get());
			}
			if (iamInstanceProfile.isPresent()) {
				obj.setIamInstanceProfile(iamInstanceProfile.get());
			}
			if (instanceLifecycle.isPresent()) {
				obj.setInstanceLifecycle(instanceLifecycle.get());
			}
			if (elasticGpuAssociations.isPresent()) {
				obj.setElasticGpuAssociations(elasticGpuAssociations.get());
			}
			if (elasticInferenceAcceleratorAssociations.isPresent()) {
				obj.setElasticInferenceAcceleratorAssociations(elasticInferenceAcceleratorAssociations.get());
			}
			if (networkInterfaces.isPresent()) {
				obj.setNetworkInterfaces(networkInterfaces.get());
			}
			if (outpostArn.isPresent()) {
				obj.setOutpostArn(outpostArn.get());
			}
			if (rootDeviceName.isPresent()) {
				obj.setRootDeviceName(rootDeviceName.get());
			}
			if (rootDeviceType.isPresent()) {
				obj.setRootDeviceType(rootDeviceType.get());
			}
			if (securityGroups.isPresent()) {
				obj.setSecurityGroups(securityGroups.get());
			}
			if (sourceDestCheck.isPresent()) {
				obj.setSourceDestCheck(sourceDestCheck.get());
			}
			if (spotInstanceRequestId.isPresent()) {
				obj.setSpotInstanceRequestId(spotInstanceRequestId.get());
			}
			if (sriovNetSupport.isPresent()) {
				obj.setSriovNetSupport(sriovNetSupport.get());
			}
			if (stateReason.isPresent()) {
				obj.setStateReason(stateReason.get());
			}
			if (tags.isPresent()) {
				obj.setTags(getEc2TagList(tags.get()));
			}
			if (virtualizationType.isPresent()) {
				obj.setVirtualizationType(virtualizationType.get());
			}
			if (cpuOptions.isPresent()) {
				obj.setCpuOptions(cpuOptions.get());
			}
			if (capacityReservationId.isPresent()) {
				obj.setCapacityReservationId(capacityReservationId.get());
			}
			if (capacityReservationSpecification.isPresent()) {
				obj.setCapacityReservationSpecification(capacityReservationSpecification.get());
			}
			if (hibernationOptions.isPresent()) {
				obj.setHibernationOptions(hibernationOptions.get());
			}
			if (licenses.isPresent()) {
				obj.setLicenses(licenses.get());
			}
			if (metadataOptions.isPresent()) {
				obj.setMetadataOptions(metadataOptions.get());
			}
			if (enclaveOptions.isPresent()) {
				obj.setEnclaveOptions(enclaveOptions.get());
			}
			if (bootMode.isPresent()) {
				obj.setBootMode(bootMode.get());
			}
			obj.setAccountNumber(getAwsAccountNumber());
			obj.setRegion(getRegionAsText());
			obj.setID(in.instanceId());
			xformEc2List.add(obj);
		}
		return xformEc2List;
	}

	private com.synectiks.aws.entities.ec2.Vpc getEc2Vpc(String vpcId) {
		com.synectiks.aws.entities.ec2.Vpc ec2Vpc = null;
		try {
			XformVpcProcessor xformVpcProcessor = new XformVpcProcessor(getAccessKey(), getSecretKey(),
					getRegionAsText());
			List<Vpc> vpcList = xformVpcProcessor.getAwsVpcById(vpcId);
			if (vpcList.size() > 0) {
				Vpc vpc = vpcList.get(0);
				com.synectiks.aws.entities.vpc.Vpc xformVpc = xformVpcProcessor.getXformVpc(vpc);
				ec2Vpc = new com.synectiks.aws.entities.ec2.Vpc();
				BeanUtils.copyProperties(ec2Vpc, xformVpc);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.warn("Exception in getEc2Vpc: ", e);
		}

		return ec2Vpc;
	}

	private List<com.synectiks.aws.entities.ec2.Tag> getEc2TagList(List tags) throws IOException {
		List<com.synectiks.aws.entities.ec2.Tag> ec2Tags = new ArrayList<>();
		for (Object obj : tags) {
			Tag tag = (Tag) obj;
			com.synectiks.aws.entities.ec2.Tag customTag = new com.synectiks.aws.entities.ec2.Tag();
			customTag.setKey(tag.key().toString());
			customTag.setValue(tag.value());
			ec2Tags.add(customTag);
		}
		return ec2Tags;
	}

}
