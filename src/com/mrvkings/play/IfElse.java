package com.mrvkings.play;

import java.util.Scanner;

public class IfElse {
//	int score;
	Scanner sc=new Scanner(System.in);
	
	
	public IfElse() {
		
	
	}
	
	public void scoreBoard() {
		System.out.print("Enter your score: ");
		int score=sc.nextInt();
		
	
	if(score>90) {
		System.out.println("90%");
	}
	else if(score<80) {
		System.out.println("80%");
	}
	else {
		System.out.println("Better luck next time");
	}
	}
}
