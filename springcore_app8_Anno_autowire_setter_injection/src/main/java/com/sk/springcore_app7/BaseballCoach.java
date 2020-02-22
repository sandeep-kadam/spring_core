package com.sk.springcore_app7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("baseballCoach")
public class BaseballCoach implements Coach
{
	
	
	private FortuneService fortuneService;
	
	/*@Autowired
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}*/
	
	//setter-dependency fulfilled by spring container
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
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
