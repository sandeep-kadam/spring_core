package com.sk.springcore_app1;

public class VolleyBallCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public VolleyBallCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice blocking of smash in volleyball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
