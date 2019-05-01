package com.sk.springcore_app5;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;

/**
 * @author sandeep
 *
 */

@Component("myCoach")
@Scope("prototype")
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
	
	@PostConstruct
	public void myInitMethod() {
		System.out.println("My StartUp Initialization");
	}
	
	//add a destroy method
	
	
	//@PreDestroy never calls on prototype scope client code needs to do clean up activity
	@PreDestroy
	public void myDestroyMethod() {
		System.out.println("Resource Releasing Destroy method");
	}
	
}
