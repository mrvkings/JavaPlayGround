package com.mrvkings.inheritance;

public class InheritanceMain extends AccountType{
	
	String name;
	
	public InheritanceMain(String whichAcc,int totalAcc,String name) {
		super(whichAcc,totalAcc);
		this.name=name;
	}
	@Override
	public void displayAcc() {
		
		System.out.println( "Account Details: {Account Name:"+this.name+", Account-"+this.whichAcc+", Total Accounts-"+totalAcc+"]");
	}
	public static void main(String[] args) {
		InheritanceMain im=new InheritanceMain("savings",3,"venky");
		
		im.displayAcc();
		
	}

}
