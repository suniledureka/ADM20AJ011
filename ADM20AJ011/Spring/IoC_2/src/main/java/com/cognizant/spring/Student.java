package com.cognizant.spring;

public class Student {
	private String name;

	public Student() {
		System.out.println("Inside default constructor");
	}

	public Student(String name) {
		this.name = name;
		System.out.println("Inside one argument constructor");
	}

	public String getName() {
		System.out.println("Inside getName() method");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Inside setName() method");		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
