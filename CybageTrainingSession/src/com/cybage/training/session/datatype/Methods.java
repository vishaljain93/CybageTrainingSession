package com.cybage.training.session.datatype;

/**
 * @author Vishal Jain
 * In the Java programming language, a method signature is the method name and the number,
 * 	type and order of its parameters.
 * 	Return types and thrown exceptions are not considered to be a part of the method signature.
 *
 */

public class Methods {
	
	public static int a;
	
	public static void main(String[] args) {
		System.out.println("A: " + a);
		
		String[] str = {"Ashu","Nikhil","Kedar","Prashant"};

		Methods method = new Methods();
		System.out.println("A: " + a);
		method.add(10, 20);
		method.add(10, 20.2f);
		method.add(10.1, 20.1);
		method.add(10, 20.1);
		// method.add(10.1, 20.1f);
		// method.add(10.1f, 20.1);
		// method.add(10.1f, 20.1f);
		//8436
		
		method.changeValue(str);
		System.out.println("Updated Value: " + str[0]);
	}

	private void add(int a, int b) {
		System.out.println("In int,int A: " + a + " B: " + b);
	}

	private void add(int a, float b) {
		System.out.println("In int,float A: " + a + " B: " + b);
	}
	
	private void add(double a, double b) {
		System.out.println("In double,double A: " + a + " B: " + b);
	}
	
	private void add(int a, double b) {
		System.out.println("In int,double A: " + a + " B: " + b);
	}
	
	private void changeValue(String[] str) {
		System.out.println(str[0]);
		str[0] = "Rambabu";
		//a = 20;
		//System.out.println(a);
	}
}