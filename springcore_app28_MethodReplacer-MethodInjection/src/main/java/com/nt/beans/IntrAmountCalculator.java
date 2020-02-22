package com.nt.beans;

public  class IntrAmountCalculator {
	public float  calcSimpleIntrAmount(float pAmt,float time){
		System.out.println("IntrAmountCalculator::calcSimpleIntrAmount(-,-)");
        return (pAmt*2*time)/100.0f;
     }

	/**
	 * Note :: Method Replace not work on final,static method because these method can't be
	 * overridden in subclass.
	 */
	/*public final float  calcSimpleIntrAmount(float pAmt,float time){
		System.out.println("IntrAmountCalculator::calcSimpleIntrAmount(-,-)");
        return (pAmt*2*time)/100.0f;
    }*/
	
	/*public static float  calcSimpleIntrAmount(float pAmt,float time){
		System.out.println("IntrAmountCalculator::calcSimpleIntrAmount(-,-)");
        return (pAmt*2*time)/100.0f;
    }*/

	//public abstract  float  calcSimpleIntrAmount(float pAmt,float time);
}
