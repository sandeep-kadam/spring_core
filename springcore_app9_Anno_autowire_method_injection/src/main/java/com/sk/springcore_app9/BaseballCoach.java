package com.sk.springcore_app9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("baseballCoach")
public class BaseballCoach implements Coach
{
	
	
	private FortuneService fortuneService;
	
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
	
	@Autowired
	public void myMethod(FortuneService fortuneService) {
		System.out.println("inside myMethod() !!!");
		this.fortuneService = fortuneService;
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
