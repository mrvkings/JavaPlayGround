package com.mrvkings.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		
		map.put(0, "abc");
		map.put(4, "mno");
		map.put(1, "def");
		map.put(3, "jkl");
		map.put(2, "ghi");
		
		System.out.println(map);
		
		System.out.println(map);
		System.out.println(map.containsKey(5));
		
		for (Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}

}
