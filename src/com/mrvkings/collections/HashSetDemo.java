package com.mrvkings.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	static Set<String> hashSet=new HashSet<>();
	public static void main(String[] args) {
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("C");
		
		boolean b1=hashSet.add("D");
		
		System.out.println(b1);
		System.out.println(hashSet.contains("A"));
		
		boolean b2=hashSet.add("D");
		System.out.println(b2);
				
		
		System.out.println(hashSet);
		
	}

}
