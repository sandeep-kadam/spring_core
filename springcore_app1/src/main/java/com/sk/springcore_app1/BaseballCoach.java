package com.sk.springcore_app1;

/**
 * @author sandeep
 *
 */
public class BaseballCoach implements Coach
{
	
//	@Override is used to override methods defined in Interface and show's error at compilation until method is overridden
	@Override
	public String getDailyWorkout() {
		return "pratice 40 min for batting";
	}
}
