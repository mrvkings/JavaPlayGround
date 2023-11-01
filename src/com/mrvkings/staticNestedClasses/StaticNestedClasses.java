package com.mrvkings.staticNestedClasses;

public class StaticNestedClasses {
	
	public static int i;
	
	String name;
	
	static void printInt(int i) {
		
		System.out.println(i);
	}
	
	static class NestedClass{
		
		void printMethod() {
			System.out.println(i);
		}
		void printNonStatic() {
			System.out.println();
		}
	}
	

}
