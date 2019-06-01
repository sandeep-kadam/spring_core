package com.sk.springcore_app;

public class LoanApproveImpl {

	private String loanId = "";
	private String loanType = "";
	private String loanAmt = "";
	
	
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	
	public void setLoanAmt(String loanAmt) {
		this.loanAmt = loanAmt;
	}

	public String getLoanId() {
		return loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public String getLoanAmt() {
		return loanAmt;
	}

	@Override
	public String toString() {
		return "LoanApproveImpl [loanId=" + loanId + ", loanType=" + loanType + ", loanAmt=" + loanAmt + "]";
	}
	
	
	

}
