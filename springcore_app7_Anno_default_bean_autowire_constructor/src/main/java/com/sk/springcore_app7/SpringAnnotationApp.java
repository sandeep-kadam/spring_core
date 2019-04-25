package com.sk.springcore_app7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationApp 
{
    public static void main( String[] args )
    {
    	
    	//load spring config file
    	
    	ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
    	
    	//retrieve beans from spring container
    	
    	//********************************this is default bean id**********
    	Coach coach = beanFactory.getBean("baseballCoach" , Coach.class);
    	System.out.println(coach.getDailyWork());
    	System.out.println(coach.getDailyFortune());
    	
    	beanFactory.close();
    	
    }
}
