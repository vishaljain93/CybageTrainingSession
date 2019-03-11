package com.cybage.training.session.accessspecifier;

public class Coupling {

	// High Coupling
	public String name;
	
	// Low Coupling
	//private String name;

	public String getName() {

		// Checking a valid access to name
		if (name != null)
			return name;
		else
			return "Not Initiaized";
	}

	public void setName(String s) {

		// Checking a valid setting to name
		if (s == null) {
			System.out.println("You can't initialize name to a null");
		}
	}

}

class B {
	public static void main(String[] args) {
		Coupling ob = new Coupling();

		// High Coupling
		ob.name = null;
		System.out.println("Name is " + ob.name);

		// Low Coupling
		//ob.setName(null);
		//System.out.println("Name is " + ob.getName());
	}
}
