package com.sk.service;

import com.sk.bo.CustomerBO;
import com.sk.dao.LoanDAO;

public class LoanService {

	private LoanDAO loanDAO;
	
	public void setLoanDAO(LoanDAO loanDAO) {
		this.loanDAO = loanDAO;
	}
	
	public float calculateInterestAmt(int cno,String cname,float principleAmt,float rate,float time) {
		
		//write business logic
		float interestAmt = principleAmt*rate*time/100.0f;
		
		CustomerBO customerBO = new CustomerBO();
		customerBO.setPamt(principleAmt);
		customerBO.setCno(cno);
		customerBO.setCname(cname);
		customerBO.setIntramt(interestAmt);
		
		int result= loanDAO.insert(customerBO);
		System.out.println("result inside calIntAmt :: "+result);
		return interestAmt;
		
	}
}
