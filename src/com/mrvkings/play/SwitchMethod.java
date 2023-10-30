package com.mrvkings.play;

import java.util.Scanner;

public class SwitchMethod {
	
	static Scanner sc=new Scanner(System.in);
	static int month=0;
	
	static void whichMonth() {
		System.out.print("Enter month number: ");
		month=sc.nextInt();
		switch(month){
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Feb");
				break;
			case 3:
				System.out.println("Mar");
				break;
			default:
				System.out.println("default");
				break;



				
		}
		
	}

}
