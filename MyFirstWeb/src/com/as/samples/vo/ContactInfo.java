package com.as.samples.vo;

public class ContactInfo 
{
	String addr;
	String city;
	String state;
	public ContactInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactInfo(String addr, String city, String state) {
		super();
		this.addr = addr;
		this.city = city;
		this.state = state;
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
	
}
