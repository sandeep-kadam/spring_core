package com.sk.beans;

public class First {

	
	private Second secondClassObj;
	
	/*public First(Second secondObj) {
		secondClassObj = secondObj;
	}*/
	
	public void setSecondObj(Second secondClassObj) {
		this.secondClassObj = secondClassObj;
	}
	
	
	public String display() {
		//return "You are inside first class";
		return secondClassObj.display();
	}
	
	//String test = secondClassObj.display();
	
	//System.out.println("test : "+test);
	
}
