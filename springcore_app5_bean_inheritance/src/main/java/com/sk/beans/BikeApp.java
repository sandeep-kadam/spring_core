package com.sk.beans;

public class BikeApp {

	private String brand = "";
	private String engineCC = "";
	private String modelNo = "";
	
	public void setBrand(String brand) {
		System.out.println("inside set brand");
		this.brand = brand;
	}
	public void setEngineCC(String engineCC) {
		System.out.println("inside set engine");
		this.engineCC = engineCC;
	}
	public void setModelNo(String modelNo) {
		System.out.println("inside set model");
		this.modelNo = modelNo;
	}
	
	@Override
	public String toString() {
		return "First [brand=" + brand + ", engineCC=" + engineCC + ", modelNo=" + modelNo + "]";
	}
	
	
}
