package com.cybage.training.session.accessspecifier;

public class AccessSpecifier {
	
	private static int priv = 10;
	protected static int prot = 20;
	static int defa = 30;
	public static int publ = 40;
	
	public static int getPriv() {
		return priv;
	}
	public static void setPriv(int priv) {
		AccessSpecifier.priv = priv;
	}
	public static int getDefa() {
		return defa;
	}
	public static void setDefa(int defa) {
		AccessSpecifier.defa = defa;
	}
}

class Derived extends AccessSpecifier {
	
	public static void main(String[] args) {
		//System.out.println(getPriv());
		//System.out.println(priv);
		System.out.println(prot);
		System.out.println(defa);
		System.out.println(publ);
	}
}
