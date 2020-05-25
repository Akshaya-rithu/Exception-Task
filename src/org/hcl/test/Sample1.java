package org.hcl.test;

public class Sample1 {

	public static void main(String[] args) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}

}
