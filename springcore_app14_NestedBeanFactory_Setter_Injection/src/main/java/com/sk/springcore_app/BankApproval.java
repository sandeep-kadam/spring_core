package com.sk.springcore_app;

public class BankApproval {

	
	private LoanApproveImpl loanApproveImpl;
	
	
	public void setLoanApproveImpl(LoanApproveImpl loanApproveImpl) {
		this.loanApproveImpl = loanApproveImpl;
	}
	
	
	public String getLoanApprovalStatus() {
		
		if(loanApproveImpl.getLoanType().equalsIgnoreCase("Bike"))
			return "Loan Approved Successfully";
		else
			return "Sorry! Loan Not Approved!!!!!!";
	}
}
