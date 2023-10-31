package com.mrvkings.entity;

public class StringEntityDemo {
	String name;
	String place;
	
	public void setName(String name) {
		this.name=name;
		
	}
	public void setPlace(String place) {
		this.place=place;
	}
	
	@Override
	public String toString() {
		return name+place;
	}

}
