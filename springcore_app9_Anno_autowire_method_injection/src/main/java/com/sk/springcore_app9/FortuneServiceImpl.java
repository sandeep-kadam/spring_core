package com.sk.springcore_app9;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "your are cool!!!";
	}

}
