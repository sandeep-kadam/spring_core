package com.sk.springcore_app12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.sk.springcore_app12")
public class ServiceConfig {

	//define bean for our HappyFortuneService
	
	/*@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}*/
	
	@Bean
	public FortuneService fortuneService() {
		System.out.println("inside fortuneService() method");
		return new FortuneServiceImpl();
	}
	
	//define bean for our SwimCoach and inject dependency
	@Bean 
	public Coach swimCoach() {
		System.out.println("inside swimCoach() method");
		return new SwimCoach(fortuneService());
	}
}
