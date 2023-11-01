package com.mrvkings.interfaces;

public class ServiceLayerMain implements ServiceLayer {
	
	int i=0;
	int j=0;
	
	public static void main(String[] args) {
		
		ServiceLayer serviceLayer=new ServiceLayerMain();
		ServiceLayerMain serviceLayerMain =new ServiceLayerMain();
		
		serviceLayer.interfaceMethod();
		serviceLayerMain.interfaceMethod1("hello");
//		serviceLayer.i=0;
		serviceLayerMain.i=0;
		serviceLayerMain.j=2;
		
	
		
	}
	public void interfaceMethod() {
		System.out.println("interfaceMethod");
	}
	public void interfaceMethod1(String string) {
		System.out.println("interfaceMethod1");
	}

}
