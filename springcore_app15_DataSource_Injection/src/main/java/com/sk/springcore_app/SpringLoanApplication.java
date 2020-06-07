package com.sk.springcore_app;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.service.LoanService;

@PropertySource("classpath:DBDetails.properties")
public class SpringLoanApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		LoanService service = beanFactory.getBean("service",LoanService.class);
		
		float interestAmt = service.calculateInterestAmt(20, "john", 6070, 30, 4);
		
		System.out.println("Interest Amount :: " + interestAmt);
		
		beanFactory.close();
		
	}

}
