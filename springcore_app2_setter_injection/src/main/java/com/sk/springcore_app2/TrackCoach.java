package com.sk.springcore_app1;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "run 2km for running practice";
	}

	@Override
	public String getDailyFortune() {
		return "";
	}

}
