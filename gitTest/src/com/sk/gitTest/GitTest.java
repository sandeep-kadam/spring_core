package com.sk.gitTest;

import com.sk.singleton.TestSingleton;

public class GitTest {

	public static void main(String[] args) {
		
		TestSingleton t1=null,t2=null;
		
		t1 = TestSingleton.getInstance();
		t2 = TestSingleton.getInstance();
		
		System.out.println(t1.hashCode()+ " "+t2.hashCode());
		System.out.println(t1.hashCode()==t2.hashCode()?"same obj":"different obj");
		
	}

}

