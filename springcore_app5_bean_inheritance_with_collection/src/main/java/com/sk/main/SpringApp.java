package com.sk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.beans.BikeApp;

public class SpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BikeApp bikeObj = beanFactory.getBean("bike",BikeApp.class);
		
		System.out.println("Message : " + bikeObj.toString());

		beanFactory.close();
	}

}
