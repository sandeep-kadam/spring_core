package com.sk.springcore_app;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.service.LoanService;

@PropertySource("classpath:DBDetails.properties")
public class SpringLoanApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		LoanService service = beanFactory.getBean("service",LoanService.class);
		
		float interestAmt = service.calculateInterestAmt(1000, "Sandeep", 9000, 10, 2);
		
		System.out.println("Interest Amount :: " + interestAmt);
		
		beanFactory.close();
		
	}

}
