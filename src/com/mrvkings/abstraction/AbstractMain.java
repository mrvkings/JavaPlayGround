package com.mrvkings.abstraction;

public class AbstractMain extends AbstractDemo {
	
	public static void main(String[] args) {
		
//		AbstractDemo ad=new AbstractMain();
		AbstractMain ad=new AbstractMain();
		
		
		
//		ad.sayHello("hello");
		ad.concretMethod("venky");
		ad.i=4;
	}
//	public void sayHello(String msg) {
//		System.out.println("sayHello method");
//	}

}
