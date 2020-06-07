package com.sk.springcore_app10;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FortuneServiceImpl implements FortuneService {
	
	// @primary uses to select single implementation class from multiple implementation classes for same interface.
	// @primary given more priority over other implementation classes
	
	@Override
	public String getFortune() {
		return "your are cool!!!";
	}

}
