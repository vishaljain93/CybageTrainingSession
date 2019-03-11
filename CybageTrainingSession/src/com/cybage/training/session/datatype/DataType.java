package com.cybage.training.session.datatype;

import com.cybage.training.session.accessspecifier.AccessSpecifier;

/**
 * @author Vishal Jain
 * Data types specify the different sizes and values that can be stored in the variable.
  	There are two types of data types in Java:
	1) Primitive: The primitive data types are boolean, char, byte, short, int, long, float and double(Institute of Electrical and Electronics Engineers (IEEE)).
	2) Non-primitive: The non-primitive data types include Classes, Interfaces, and Arrays.
 */

public class DataType extends AccessSpecifier {

	public static void main(String[] args) {
		
		// Primitive
		boolean bool = false; // necessary to assign value, Value: true or false
		
		if (bool) {
			System.out.println("I am representing a boolean data type: " + bool);
		}
		
		char ch = 'A'; // Value: ‘\u0000’ (or 0) to ‘\uffff’ 65535
		System.out.println("I am representing a char data type: " + ch);
		
		byte b = 20; // Value: -128 to 127
		// byte b1 = 129;
		System.out.println("I am representing a byte data type: " + b);
		
		short s = 20; // Value: -32,768 to 32,767
		System.out.println("I am representing a short type: " + s);
		
		int i = 20; // Value: -2,147,483,648 to 2,147,483,647
		System.out.println("I am representing a int type: " + i);
		
		long l = 20; // Value: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		System.out.println("I am representing a long type: " + l);
		
		float f = (float) 20.3;
		System.out.println("I am representing a float type: " + f);
		
		double d = 20.4;
		System.out.println("I am representing a double type: " + d);
		
		
		// Access Specifier
		/*System.out.println(getPriv());
		System.out.println(prot);
		System.out.println(getDefa());
		System.out.println(publ);*/
	}

}
