package com.sk.springcore_app2;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class InterestRateReplacer implements MethodReplacer {

	private float rate;
	
	
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public InterestRateReplacer() {
		System.out.println("inside 0-param constructor of InterestRateReplacer");
	}
	
	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable {

		System.out.println("Inside reimplement");
		System.out.println("Bean Class : "+bean.getClass());
		System.out.println("Method Name : "+method.getName());
		System.out.println("Method Arguments : "+Arrays.toString(args));
		System.out.println("Rate : "+rate);
		
		if("calulateRateOfInterest".equals(method.getName())) {
		
			float pamt = (float) args[0];
			float time = (float) args[1];
			
			return pamt*time*rate/100.0f;
		}else {
			return 0.0f;
		}
		
		
	}
	
	
	
	
}
