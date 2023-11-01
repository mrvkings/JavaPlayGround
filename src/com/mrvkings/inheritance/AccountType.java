package com.mrvkings.inheritance;

public class AccountType {
	
	String whichAcc;
	int totalAcc;
	
	public AccountType(String whichAcc, int totalAcc) {
		this.whichAcc=whichAcc;
		this.totalAcc=totalAcc;
	}
	public void displayAcc() {
		System.out.println( "Account Details: {which Account-"+this.whichAcc+", Total Accounts-"+totalAcc+"]");
	}

}
