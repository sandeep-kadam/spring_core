package com.sk.springcore_app12;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "today I'm HAPPY";
	}

}
