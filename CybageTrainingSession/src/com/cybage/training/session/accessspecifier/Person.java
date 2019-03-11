package com.cybage.training.session.accessspecifier;

// This class contains example of constructor chaining, initializer blocks and their order.

public class Person {
	
	public String userName = "Praveen";
	
	{
		System.out.println("In first instance initializer block");
	}
	
	static {
		System.out.println("In static initializer block");
	}
	
	{
		System.out.println("In second instance initializer block");
	}
	
	public Person () {
		System.out.println("In base class constructor");
	}
	
	String name;

	/*Person() {
		System.out.println("Base class constructor");
	}*/

	/*Person(String name) {
		System.out.println("Base class Parameterized constructor");
	}*/
	
	public void changeName(String name) {
		userName = name;
	}
	
	public void print() { 
		System.out.println("In print method");
	}
}

class Student extends Person {
	Student() {
		System.out.println("Derived class constructor");
	}

	/*Student(String name) {
		System.out.println("Derived class Parameterized constructor");
	}*/

	public static void main(String args[]) {
		
		Student obj = new Student();
		obj.print();
		
		
		// Reference
		/*System.out.println(obj.userName);
		obj.changeName("Sitesh");
		
		Student obj2 = obj;
		System.out.println(obj2.userName);
		
		obj2.changeName("Chaitanya");
		System.out.println(obj.userName);*/
		
		//Student objParam = new Student("Vishal");
		
	}
}