package com.sk.springcore_app7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * What is @Component("") annotation?
 * 
 * Spring Component annotation is used to denote a class as Component. 
 * It means that Spring framework will autodetect these classes for dependency injection 
 * when annotation-based configuration and classpath scanning is used.
 */

//Here using default Bean ID 
// Spring Takes MyClassName  as class name and myClassName as its default bean id.

@Component
public class BaseballCoach implements Coach
{
	
	
	private FortuneService fortuneService;
	
	//this constructor-dependency automatically fulfilled by spring container i.e. by using @Autowired
	@Autowired
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	
	@Override
	public String getDailyWork() {
		return "pratice timing for bowling";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
