package com.mrvkings.entity;

public class Employee {
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", phNumber=" + phNumber + "]";
//	}
	int id;
	String name;
	long phNumber;
	
	public Employee() {
		
	}
	public Employee(int id, String name, long phNumber) {
		this.id=id;
		this.name=name;
		this.phNumber=phNumber;
		
	}
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	public Employee(int id) {
		this.id=id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPhNumber(Long phNumber) {
		this.phNumber=phNumber;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getPhNumber() {
		return phNumber;
	}
	@Override
	public String toString() {
		return "Employee [id="+id+", name="+name+", phNumber="+phNumber+"]";
	}

}
