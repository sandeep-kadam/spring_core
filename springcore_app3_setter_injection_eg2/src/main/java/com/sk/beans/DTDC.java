package com.sk.beans;

public class DTDC implements Courier {

	public DTDC() {
		System.out.println("inside 0-param constructor DTDC");
	}
	
	@Override
	public final String delivery(int orderId) {
		return "DTDC delivery service with orderId:"+orderId;
	}

}
