package com.sk.springcore_app11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigApp 
{
    public static void main( String[] args )
    {
    	
    	//load spring config file
    	
    	AnnotationConfigApplicationContext beanFactory = new AnnotationConfigApplicationContext(ServiceConfig.class);
    	
    	//retrieve beans from spring container
    	
    	Coach coach = beanFactory.getBean("baseballCoach" , Coach.class);
    	System.out.println(coach.getDailyWork());
    	System.out.println(coach.getDailyFortune());
    	
    	//close the context
    	beanFactory.close();
    	
    }
}
