package com.sk.springcore_app12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigApp 
{
    public static void main( String[] args )
    {
    	
    	//load spring config file
    	//--------------------------------------------------------------------------Reading Java Config class file---
    	AnnotationConfigApplicationContext beanFactory = new AnnotationConfigApplicationContext(ServiceConfig.class);
    	
    	//retrieve beans from spring container
    	
    	SwimCoach coach = beanFactory.getBean("swimCoach" , SwimCoach.class);
    	
    	System.out.println(coach.getDailyWork());
    	System.out.println(coach.getDailyFortune());
    	System.out.println("Email :: "+coach.getEmail());
    	System.out.println("Team :: "+coach.getTeam());
    	
    	//close the context
    	beanFactory.close();
    	
    }
}
