package com.sk.singleton;

public class TestSingleton {

	private static TestSingleton instance;
	
	private TestSingleton() {
		System.out.println("inside 0-param constructor");
	}
	
	public static TestSingleton getInstance() {
		if(instance == null) {
			instance = new TestSingleton();
		}
		
		return instance;
	}
}
