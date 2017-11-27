package com.as.samples.vo;

public class PersonalInfo 
{
	private String firstname;
	private String lastname;
	private String middlename;
	
	public PersonalInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonalInfo(String firstname, String lastname, String middlename) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
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
	
}
