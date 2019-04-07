package com.sk.springcore_app1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file or Creating Spring Container
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container created above
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println("#"+coach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
