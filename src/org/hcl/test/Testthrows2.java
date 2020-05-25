package org.hcl.test;

public class Testthrows2 {

	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {
		Testthrows2 f1 = new Testthrows2();
		Testthrows2 f2 = new Testthrows2();
		f1 = null;
		f2 = null;
		System.gc();
	}
}
