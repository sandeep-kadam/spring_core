package com.sk.springcore_app2;

/**
 * @author sandeep
 *
 */
public class BaseballCoach implements Coach
{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor dependency
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
//	@Override is used to override methods defined in Interface and show's error at compilation until method is overridden
	@Override
	public String getDailyWorkout() {
		return "pratice 40 min for batting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
