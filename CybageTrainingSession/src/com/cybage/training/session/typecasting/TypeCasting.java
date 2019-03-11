package com.cybage.training.session.typecasting;

/**
 * @author Vishal Jain
 * Assigning a value of one type to a variable of another type is known as Type Casting.
 * We can convert one data types into another data type using casting when narrowing happens,
 * in case of widening no casting is required. 
 * In Java, type casting is classified into two types: a) Upcasting, b) Downcasting
 * Also known as: Widening/Automatic, Narrowing OR Implicit, Explicit.
 * 
 * Automatic Type casting take place when,
	a) the two types are compatible
	b) the target type is larger than the source type
	
	When you are assigning a larger type value to a variable of smaller type,
	then you need to perform explicit type casting.
 */

public class TypeCasting {

	public static void main(String[] args) {
		
		// Upcasting
		int i = 100;
	    long l = i;	//no explicit type casting required
	    float f = l;	//no explicit type casting required
	    System.out.println("Int value: " + i);
	    System.out.println("Long value: " + l);
	    System.out.println("Float value: " + f);
	    
	    // Downcasting
	    double d = 100.04;
	    long a = (long) d;  //explicit type casting required
	    int b = (int)a;	//explicit type casting require
	    System.out.println("Double value: " + d);
	    System.out.println("Long value: " + l);
	    System.out.println("Int value: " + b);
	    
	    // Implicit Type Conversion
	    byte x = 10;
	    byte y  = 20;
	    byte c;
	    c = (byte) (x + y);
	    
	    short s = 10;
	    short s1 = 20;
	    short s2 = (short) (s + s1);
	}
}