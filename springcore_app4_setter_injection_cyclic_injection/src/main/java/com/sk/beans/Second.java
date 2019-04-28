package com.sk.beans;

public class Second {

	
	private First firstClassObj;
	
	public Second(First firstObj) {
		firstClassObj = firstObj;
	}
	
	public String display() {
		return "You are inside second class";
	}
}
