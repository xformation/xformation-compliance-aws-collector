package com.synectiks.aws.entities;

import java.io.Serializable;

public class CloudService<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private T appServices;
	private T dataServices;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getAppServices() {
		return appServices;
	}
	public void setAppServices(T appServices) {
		this.appServices = appServices;
	}
	public T getDataServices() {
		return dataServices;
	}
	public void setDataServices(T dataServices) {
		this.dataServices = dataServices;
	}
	
	
}
