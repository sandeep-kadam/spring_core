package com.sk.springcore_app6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationApp 
{
    public static void main( String[] args )
    {
    	
    	//load spring config file
    	
    	ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
    	
    	//retrieve beans from spring container
    	Coach coach = beanFactory.getBean("coachBeanId" , Coach.class);
    	System.out.println(coach.getDailyWork());
    	
    	beanFactory.close();
    	
    	
    	/* OUTPUT WHEN SCOPE DEFINED AS SINGLETON(default scope)
    	 * 
    	 * Memory Address of coachObj1 : com.sk.springcore_app5.BaseballCoach@52a86356
    	 * Memory Address of coachObj2 : com.sk.springcore_app5.BaseballCoach@52a86356
    	 * Result : true
    	 * 
    	 * */
    
    
    	/* OUTPUT WHEN SCOPE DEFINED AS PROTOTYPE
    	 * 
    	 * Memory Address of coachObj1 : com.sk.springcore_app5.BaseballCoach@78c03f1f
    	 * Memory Address of coachObj2 : com.sk.springcore_app5.BaseballCoach@5ec0a365
    	 * Result : false
    	 * 
    	 * */
    
    
    }
}
