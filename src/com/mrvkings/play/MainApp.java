package com.mrvkings.play;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp extends SwitchMethod implements DoWhileLoop{
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(1);
		double[] myDouble;
		myDouble=new double[2];
		myDouble[0]=5;
		myDouble[1]=6;
		
		System.out.println(Arrays.toString(myDouble));
		int i=0;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		MainApp ie=new MainApp();
		MainApp ie1=new MainApp();
//		ie.score=85;
//		ie1.score=82;
//		ie.scoreBoard();
//		ie1.scoreBoard();
		
		//----------switch statements-----------------
		
		MainApp.whichMonth();
		
		
		//--------------Do while loop-----------------
		MainApp.printDoWhileLoop();
		
	}
	public static void printDoWhileLoop() {
		System.out.print("Enter Do while loop number: ");
		int i=sc.nextInt();
		
		do {
			
			System.out.println("do: "+i);
			++i;
		}while(i<10);
		
	}

}
