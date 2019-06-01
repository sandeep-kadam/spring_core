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

	
	/*Output for Constructor Injection :
		
		Cannot resolve reference to bean 'fobj' while setting constructor argument; 
		nested exception is org.springframework.beans.factory.BeanCurrentlyInCreationException: 
		Error creating bean with name 'fobj': Requested bean is currently in creation: Is there an unresolvable circular reference?
		
		Solution:
		1.use one setter and one constructor injection and call setter injection method in clientApp.
		2.use two setter injection instead of constructor
	*/
}
