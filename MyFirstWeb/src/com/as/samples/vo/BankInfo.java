package com.as.samples.vo;

public class BankInfo 
{
	String bankName;
	String accNo;
	String ssn;
	public BankInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankInfo(String bankName, String accNo, String ssn) {
		super();
		this.bankName = bankName;
		this.accNo = accNo;
		this.ssn = ssn;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
