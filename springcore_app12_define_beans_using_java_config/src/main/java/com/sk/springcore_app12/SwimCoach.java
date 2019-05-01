package com.sk.springcore_app12;

public class SwimCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWork() {
		return "Swimming for 100m daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
