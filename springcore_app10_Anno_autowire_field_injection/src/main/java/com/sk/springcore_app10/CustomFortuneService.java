package com.sk.springcore_app10;

import org.springframework.stereotype.Component;

@Component
public class CustomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You are using CustomFortuneService";
	}

}
