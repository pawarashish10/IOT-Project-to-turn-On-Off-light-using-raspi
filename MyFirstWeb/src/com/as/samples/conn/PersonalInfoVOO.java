package com.as.samples.conn;

public class PersonalInfoVOO {

	private String firstname;
	private String lastname;
	private String middlename;
	private String addr;
	private String city;
	private String state;
	private String bankName;
	private String accNo;
	private String ssn;
	public PersonalInfoVOO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonalInfoVOO(String firstname, String lastname, String middlename, String addr, String city, String state,
			String bankName, String accNo, String ssn) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
		this.addr = addr;
		this.city = city;
		this.state = state;
		this.bankName = bankName;
		this.accNo = accNo;
		this.ssn = ssn;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
