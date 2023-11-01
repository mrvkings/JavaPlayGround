package com.mrvkings.collections.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	
	public static void main(String[] args) {
		List<Integer> ar=new ArrayList<>();
		ar.add(022);
		ar.add(722);
		ar.add(922);
		ar.add(1);
		ar.add(222);
		ar.add(225);
		ar.add(282);
		ar.add(32);
		
		System.out.println(ar);
		
		List<Integer> ar1=ar.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(ar1);
		
//		List<Integer> ar2=ar.stream().map(x->x*x).forEach(y->System.out.println(y));
	}

}
