package com.cybage.training.session.accessspecifier;

public class BoxingUnboxing {
	
	public static void main(String[] args) {
		
		int a = 10;
		Integer a2 = a; // Boxing
		Integer a3 = new Integer(a); // Boxing
		System.out.println(a + " " + a2 + " " + a3);
		
		Integer integer = new Integer(20);
		int i = integer; // Unboxing
		
		System.out.println(integer + " " + i);
	}

}
