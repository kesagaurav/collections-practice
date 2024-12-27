package com.gaurav;

public class Company {

	private int cid;
	private String name;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", name=" + name + "]";
	}
	
	
}
