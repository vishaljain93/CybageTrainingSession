package com.cybage.training.session.accessspecifier;

/**
 * @author Vishal Jain
 *
 */

public class Mathematics {
	
	public static int result;
	
	public static void main(String[] args) {
		
		// High Cohesion
		Connection conn = new Connection();
		Add add = new Add();

		result = add.add(10,  20);
		conn.getDBConnection(result);
	}

	// Low Cohesion
	/*public void doSomething() {}
	public void doAnything() {}*/
}

class Connection {
	public void getDBConnection(int result) {
		System.out.println("Result: " + result);
	}
}

class Add {
	public int add (int a, int b) {
		return a + b;
	}
}
