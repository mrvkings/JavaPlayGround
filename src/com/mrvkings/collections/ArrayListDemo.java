package com.mrvkings.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	List<Integer> arrayList=new ArrayList<>();
	
	public void  addArrayList() {
		
		for(int i=0;i<10;i++) {
			arrayList.add(i);
		}
		System.out.println("ArrayList is: " + arrayList);
		
	}
	public void removeArrayList() {
		
//		for (int i=0; i<=arrayList.size();i++) {
//			arrayList.remove(i);
//			System.out.println(arrayList);
//		}
		for (int i=arrayList.size(); i>0;i--) {
			arrayList.remove(i-1);
			
			
		}
		System.out.println(arrayList);
	}

	

}
