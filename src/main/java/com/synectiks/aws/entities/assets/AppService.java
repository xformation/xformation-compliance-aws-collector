package com.synectiks.aws.entities.assets;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.aws.entities.CloudAsset;

public class AppService<T> extends CloudAsset implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<CommonService<T>> commonServices;
	private List<BusinessService<T>> businessServices;
	
	@JsonProperty("commonServices")
	public List<CommonService<T>> getCommonServices() {
		return commonServices;
	}

	@JsonProperty("commonServices")
	public void setCommonServices(List<CommonService<T>> commonServices) {
		this.commonServices = commonServices;
	}

	@JsonProperty("businessServices")
	public List<BusinessService<T>> getBusinessServices() {
		return businessServices;
	}

	@JsonProperty("businessServices")
	public void setBusinessServices(List<BusinessService<T>> businessServices) {
		this.businessServices = businessServices;
	}
	
	
	
	
}
