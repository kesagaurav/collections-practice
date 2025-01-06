package com.gaurav;

public class Account {

	public String accNo;
	public String balance;
	public Account(String accNo, String balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		System.out.println("parametres of account class is called");

	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("acc class is called");
	}
	
	public void displayDetails() {
		System.out.println("detials are");
		System.out.println("accNo is " + accNo);
	}
}

class LoanAmount extends Account{
	public String accNo1;
	public LoanAmount(String accNo1) {
		super("","");//internally invoke parent class consytructor
		// TODO Auto-generated constructor stub
		System.out.println("i am in loan amount class");
	}
	public LoanAmount(String accNo, String balance,String accNo1) {
		super(accNo, balance);
		this.accNo=accNo1;
		System.out.println("i am in loan mount super class");
	}
	
	
	
}


