package com.abc;

public class Person {

	int id;
	String name;
	double salary;

	public Person() {
		super();

	}

	public void Person(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// hidden no-args constructor --> to intialize the objects
	
	// hidden occurs when we do not add constructor any constructor manually

	// constructor is use to intialize the objects
	
	// constructor do not have any return type {not even void}
	
	// if provided it becomes a method

	public static void main(String[] args) {

		// constructor is use to intialize the objects

		Person p = new Person();

		System.out.println(p.id);

	}
}
