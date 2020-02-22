package com.sk.springcore_app6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/*
 * What is @Component("") annotation?
 * 
 * Spring Component annotation is used to denote a class as Component. 
 * It means that Spring framework will autodetect these classes for dependency injection 
 * when annotation-based configuration and classpath scanning is used.
 */

@Component("coachBeanId")
public class BaseballCoach implements Coach
{
	
	@Override
	public String getDailyWork() {
		return "pratice 40 min for batting";
	}

	//add an init method
	@PostConstruct
	public void myInitMethod() {
		System.out.println("My StartUp Initialization");
	}
	
	//add a destroy method
	
	@PreDestroy
	public void myDestroyMethod() {
		System.out.println("Resource Releasing Destroy method");
	}
	
}
