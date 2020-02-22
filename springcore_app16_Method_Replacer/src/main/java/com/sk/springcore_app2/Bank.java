package com.sk.springcore_app2;

public class Bank {
	
	public Bank() {
		System.out.println("inisde Bank 0-param constructor");
	}
	
	public float calulateRateOfInterest(float pamt,float time) {
		System.out.println("inside calulateRateOfInterest() ");
		return pamt*time*0.2f/100;
	}
	

}
