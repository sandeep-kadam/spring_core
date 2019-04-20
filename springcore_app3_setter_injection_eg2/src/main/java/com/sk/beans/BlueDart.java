package com.sk.beans;

public class BlueDart implements Courier {

	
	public BlueDart() {
		System.out.println("inside 0-param constructor BlueDart");
	}
	
	@Override
	public final String delivery(int orderId) {
		return "BlueDart delivery service with orderId:"+orderId;
	}

}
