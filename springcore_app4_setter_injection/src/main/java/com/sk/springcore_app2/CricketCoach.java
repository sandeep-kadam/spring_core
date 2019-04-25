package com.sk.springcore_app2;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String email = "";
	private String team = "";
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}

	
	
	public CricketCoach() {
		System.out.println("no-arg constructore inside CricketCoach ##");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter of CricketCoach");
		this.fortuneService= fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "practice death over hitting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
