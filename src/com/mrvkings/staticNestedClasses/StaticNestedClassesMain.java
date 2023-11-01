package com.mrvkings.staticNestedClasses;

public class StaticNestedClassesMain {
	
	public static void main(String[] args) {
		StaticNestedClasses snc=new StaticNestedClasses();
		snc.printInt(4);
		
		StaticNestedClasses.NestedClass sncn=new StaticNestedClasses.NestedClass();
		sncn.printMethod();
		
	}

}
