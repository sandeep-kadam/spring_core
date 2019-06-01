package com.sk.springcore_app2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file or Creating Spring Container
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container created above
		
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println("#"+coach.getDailyFortune());
		System.out.println("#"+coach.getDailyWorkout());
		System.out.println("Team Name : "+coach.getTeam());
		System.out.println("Team Email : "+coach.getEmail());
		//close the context
		context.close();

	}

}
