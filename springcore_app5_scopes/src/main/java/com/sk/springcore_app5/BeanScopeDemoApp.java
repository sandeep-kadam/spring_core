package com.sk.springcore_app5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp 
{
    public static void main( String[] args )
    {
    	
    	//load spring config file
    	
    	ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
    	
    	
    	
    	//retrieve beans from spring container
    	
    	Coach coachObj1 = beanFactory.getBean("myCoach" , Coach.class);
    	Coach coachObj2 = beanFactory.getBean("myCoach" , Coach.class);
    	
    	boolean result = coachObj1 == coachObj2;
    	
    	System.out.println("Memory Address of coachObj1 : " + coachObj1);
    	System.out.println("Memory Address of coachObj2 : " + coachObj2);
    	
    	System.out.println("Result : "+result);
    	
    	/*System.out.println(coach.getDailyFortune());
    	System.out.println(coach.getDailyWorkout());*/
    	
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
