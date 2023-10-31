package com.mrvkings.play;

import java.util.Arrays;
import java.util.Scanner;

import com.mrvkings.entity.Employee;
import com.mrvkings.entity.StringEntity;
import com.mrvkings.entity.StringEntityDemo;

public class MainApp extends SwitchMethod implements DoWhileLoop{
	static Scanner sc =new Scanner(System.in);
	static String[] str= {"abc","def","ghi","jkl","mno","pqr","stu"};
	
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
		printDoWhileLoop();
		
		//--------------For loop----------------------
		
		forLoopFunction();
		
		//--------------For each loop-----------------
		
		forEachLoop();
		
	}
	public static void printDoWhileLoop() {
		System.out.print("Enter Do while loop number: ");
		int i=sc.nextInt();
		
		do {
			
			System.out.println("do: "+i);
			i++;
			//System.out.println(i);
		}while(i<10);
		
	}
	public static void forLoopFunction( ) {
		for (int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	public static void forEachLoop() {
		for(String s:str) {
			System.out.println(s);
		}
//		-------------------Entity class---------------
		
		Employee e=new Employee(1,"venky",123456789);
		Employee e1=new Employee();
		Employee e2=new Employee(2);
		
		System.out.println(e.getPhNumber());
		System.out.println(e.toString());
		
//		-----------------------String entity---------------
		StringEntityDemo se=new StringEntityDemo();
		System.out.println(se.toString());
	}



}
