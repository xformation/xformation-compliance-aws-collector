package com.synectiks.aws.entities.common;

import java.util.ArrayList;
import java.util.List;

import software.amazon.awssdk.services.ec2.model.Tag;

public class ProcessorUtils {
	public static List<com.synectiks.aws.entities.common.Tag> getXformTagList(List tags) {
		List<com.synectiks.aws.entities.common.Tag> listTag = new ArrayList<>();
		for (Object obj : tags) {
			Tag tag = (Tag) obj;
			com.synectiks.aws.entities.common.Tag xformTag = new com.synectiks.aws.entities.common.Tag();
			xformTag.setKey(tag.key());
			xformTag.setValue(tag.value());
			listTag.add(xformTag);
		}
		return listTag;
	}
}
