package com.sk.springcore_app5;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	
	public String getFortune() {
		return "Today you will learn something special";
	}

}
