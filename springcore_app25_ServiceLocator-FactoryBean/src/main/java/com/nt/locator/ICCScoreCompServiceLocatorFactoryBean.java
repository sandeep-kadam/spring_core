package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

public class ICCScoreCompServiceLocatorFactoryBean implements FactoryBean<ICCScoreComp> {
   private Map<String,ICCScoreComp> cache=new HashMap();
   private String jndiName;
	public void setJndiName(String jndiName) {
	this.jndiName = jndiName;
}

	@Override
	public ICCScoreComp getObject() throws Exception {
		ICCScoreComp comp=null;
		System.out.println("inside ICCScoreComp method");
		if(!cache.containsKey(jndiName)){
     	//Write Lookup Code here ..
		   comp=new ICCScoreCompImpl();
		   cache.put(jndiName, comp);
		}
		return cache.get(jndiName);
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("inside getObjectType");
		return ICCScoreComp.class;
	}
	
	@Override
	public boolean isSingleton() {
	  System.out.println("inside isSInglton");
		return true;
	}
	
	 

}
