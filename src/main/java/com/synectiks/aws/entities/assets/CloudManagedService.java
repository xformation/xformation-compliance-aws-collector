package com.synectiks.aws.entities.assets;

import java.io.Serializable;
import java.util.List;

import com.synectiks.aws.entities.CloudAsset;

public class CloudManagedService<T> extends CloudAsset implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<AppService> appServices;
	private List<DataService> dataServices;
	
	public List<AppService> getAppServices() {
		return appServices;
	}
	public void setAppServices(List<AppService> appServices) {
		this.appServices = appServices;
	}
	public List<DataService> getDataServices() {
		return dataServices;
	}
	public void setDataServices(List<DataService> dataServices) {
		this.dataServices = dataServices;
	}
	
}
