package com.sk.springcore_app10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("baseballCoach")
public class BaseballCoach implements Coach
{
	
	//field Injection
	// use @Qualifier(beanid) to solve multiple implementation classes for same interface
	@Autowired
	@Qualifier("customFortuneService")
	private FortuneService fortuneService;
	
	
	public BaseballCoach() {
		System.out.println("this is BaseballCoach ---> default constructor");
	}
	/* Constructor Injection
	 * @Autowired
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}*/
	
	/* Setter Injection
	 * @Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public void myMethod(FortuneService fortuneService) {
		System.out.println("inside myMethod() !!!");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWork() {
		return "pratice timing for bowling";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
