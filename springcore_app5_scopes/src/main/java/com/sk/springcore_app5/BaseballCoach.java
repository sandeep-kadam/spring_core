package com.sk.springcore_app5;

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
	
	
	public String getDailyWorkout() {
		return "pratice 40 min for batting";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add an init method
	
	public void myInitMethod() {
		System.out.println("My StartUp Initialization");
	}
	
	//add a destroy method
	
	public void myDestroyMethod() {
		System.out.println("Resource Releasing Destroy method");
	}
	
}
