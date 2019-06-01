package com.sk.beans;

public class BikeApp {

	private String brand = "";
	private String engineCC = "";
	private String modelNo = "";
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	
	@Override
	public String toString() {
		return "First [brand=" + brand + ", engineCC=" + engineCC + ", modelNo=" + modelNo + "]";
	}
	
	
}
