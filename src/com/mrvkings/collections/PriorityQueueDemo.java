package com.mrvkings.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<>();
		
		queue.add("abc");
		queue.add("def");
		queue.add("ghi");
		queue.add("apple");
		
		System.out.println(queue);
		String head=queue.peek();
		System.out.print(head);
		
		
		
	}

}
