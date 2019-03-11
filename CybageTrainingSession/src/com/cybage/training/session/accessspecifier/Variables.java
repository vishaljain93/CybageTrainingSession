package com.cybage.training.session.accessspecifier;

public class Variables {

	public static void main(String[] args) {
		boolean bool = true;
		int a;
		
		if (bool) {
			a = 10;
		}
		//System.out.println("A: " + a);
		
		
		Integer x = 100;
		Integer y = 100;
		if (x == y) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}