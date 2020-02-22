package com.sk.springcore_app;

public class BankApproval {

	
	private LoanApproveImpl loanApproveImpl;
	
	
	public void setLoanApproveImpl(LoanApproveImpl loanApproveImpl) {
		this.loanApproveImpl = loanApproveImpl;
	}
	
	
	public String getLoanApprovalStatus() {
		
		System.out.println("Loan Amt : "+loanApproveImpl.getLoanAmt());
		System.out.println("Loan Id : "+loanApproveImpl.getLoanId());
		System.out.println("");
		if(loanApproveImpl.getLoanType().equalsIgnoreCase("Bike"))
			return "Loan Approved Successfully";
		else
			return "Sorry! Loan Not Approved!!!!!!";
	}
}
