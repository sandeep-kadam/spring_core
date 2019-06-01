package com.sk.controller;

import java.util.Random;

import com.sk.beans.Courier;

public class Flipkart {

	private Courier courierService;
	
	private String itemName = "";
	private String itemPrice = "";
	private String itemQuanity = "";
	private int orderId;
	
	public Flipkart() {
		System.out.println("inside flipkart 0-param constructor");
	}
	
	public void setCourierService(Courier courierService) {
		this.courierService = courierService;
	}
	
	/*public Flipkart(Courier courierService) {
		this.courierService = courierService;
	}*/
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public void setItemQuanity(String itemQuanity) {
		this.itemQuanity = itemQuanity;
	}
	
	public String getItemName() {
		return itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public String getItemQuanity() {
		return itemQuanity;
	}
	
	


	public String getOrderDetails() {
		
		orderId = (int) ((Math.random() * ((5 - 1) + 1)) + 1);
		
		return courierService.delivery(orderId);
	}


}
