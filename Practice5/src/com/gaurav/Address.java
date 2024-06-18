package com.gaurav;

public class Address {

	private String state;
	private int pincode;
	private String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String state, int pincode, String country) {
		super();
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", pincode=" + pincode + ", country=" + country + "]";
	}
	
	
}
