package com.sk.springcore_app12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.sk.springcore_app12")
//reading properties file through java config
@PropertySource("classpath:sports.properties")
public class ServiceConfig {

	//define bean for our HappyFortuneService
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	//define bean for our SwimCoach and inject dependency
	@Bean 
	public Coach swimCoach() {
		return new SwimCoach(happyFortuneService());
	}
}
