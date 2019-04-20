package com.sk.springcore_app1;

public class MainApp {

	public static void main(String[] args) {
		
		//create object
		Coach coach = new TrackCoach();
		
		System.out.println("Today's Coach : "+coach.getDailyWorkout());

	}

}
