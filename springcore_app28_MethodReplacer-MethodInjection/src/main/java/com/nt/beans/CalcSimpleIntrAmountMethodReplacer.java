package com.nt.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalcSimpleIntrAmountMethodReplacer implements MethodReplacer {
	private  float rate;
	
	public CalcSimpleIntrAmountMethodReplacer() {
		System.out.println("inside CalcSimpleIntrAmountMethodReplacer 0-param cons");
	}
	 public CalcSimpleIntrAmountMethodReplacer(float rate) {
		this.rate = rate;
	}
	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable {
		System.out.println("MethodReplacer::: reimplement(-,-,-)");
		System.out.println("bean class : "+bean.getClass());
		System.out.println("method name : "+method.getName());
		System.out.println("Methods args : "+Arrays.toString(args));
		
		if(method.getName().equals("calcSimpleIntrAmount")) {
			System.out.println("rate : "+rate);
			float pAmt=0.0f , time=0.0f;
			pAmt=(float)args[0];
			time=(float)args[1];
			return (pAmt*rate*time)/100.0f;
		} else {
			return 0.0f;
		}
	}
}
