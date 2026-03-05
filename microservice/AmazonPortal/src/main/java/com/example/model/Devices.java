package com.example.model;

import java.util.List;

public class Devices {
	String brandName;
	List<Device> devices;
	public Devices(String brandName, List<Device> devices) {
		super();
		this.brandName = brandName;
		this.devices = devices;
	}
	public Devices() {
		super();
	}
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<Device> getDevices() {
		return devices;
	}
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	@Override
	public String toString() {
		return "Devices [brandName=" + brandName + ", devices=" + devices + "]";
	}
	
	

}
