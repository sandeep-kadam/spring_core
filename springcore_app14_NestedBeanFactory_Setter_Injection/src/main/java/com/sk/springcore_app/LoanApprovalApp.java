package com.sk.springcore_app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class LoanApprovalApp {

	public static void main(String[] args) {

		/*BeanFactory parentBean = new XmlBeanFactory(new FileSystemResource("src/main/java/parentApplicationContext.xml"));
		BeanFactory childBean = new XmlBeanFactory(new FileSystemResource("src/main/java/childApplicationContext.xml"),parentBean);
		*/
		//ClassPathXmlApplicationContext parentBean = new ClassPathXmlApplicationContext("parentApplicationContext.xml");
		ClassPathXmlApplicationContext childBean = new ClassPathXmlApplicationContext(new String[] {"parentApplicationContext.xml","childApplicationContext.xml"});
		
		BankApproval bank = childBean.getBean("bank",BankApproval.class);
		
		System.out.println("Loan Status ::: " + bank.getLoanApprovalStatus());
		
		childBean.close();
		//parentBean.close();
	}
	
	/*
	 * OUTPUT explain:
	 * 
	 * you have to use two xml files one for child and one for parent 
	 * if you specified ref bean id and its defined in child conatiner finds that one.
	 * if not it will search bean id in parent xml.
	 * 
	 * 
	 */

}
