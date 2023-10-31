package com.mrvkings.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	LinkedList<String> ll=new LinkedList<>();
	
	public void addToLinkedList() {
		for (int i=0;i<10;i++) {
			ll.add("A");
		}
		ll.addFirst("01");
		ll.addLast("zz");
		ll.add(3,"33333");
		ll.clear();
		System.out.println(ll);
	}

}
