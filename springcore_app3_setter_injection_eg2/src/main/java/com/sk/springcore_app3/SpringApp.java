package com.sk.springcore_app3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.controller.Flipkart;

public class SpringApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome To Flipkart!" );
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Flipkart flipkartObj = context.getBean("flipkart" , Flipkart.class);
        
        System.out.println("Display Order Details :");
        System.out.println("Item Name :"+flipkartObj.getItemName());
        System.out.println("Item Price : "+flipkartObj.getItemPrice());
        System.out.println("Item Quantity :"+flipkartObj.getItemQuanity());
        System.out.println("Your item will be delivered by "+flipkartObj.getOrderDetails());
        
        
        //close context
        context.close();
        
        
        
    }
}
