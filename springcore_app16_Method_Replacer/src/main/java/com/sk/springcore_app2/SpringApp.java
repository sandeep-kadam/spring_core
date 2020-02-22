package com.sk.springcore_app2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Bank bankContainer = context.getBean("bank",Bank.class);
		
		System.out.println(bankContainer.calulateRateOfInterest(10, 12));
		
		context.close();
	}

}
