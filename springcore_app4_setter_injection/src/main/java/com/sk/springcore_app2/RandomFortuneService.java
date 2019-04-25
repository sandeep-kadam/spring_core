package com.sk.springcore_app2;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	
	private String[] fortuneArray = {"today is ur lucky day",
							"something good will happen with you",
							"u r unlucky today" };
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {

		String todaysFortune = "";
		int index = random.nextInt(fortuneArray.length);
		System.out.println("index : "+index);
		
		todaysFortune = fortuneArray[index];
		
		return todaysFortune;
	}

}
