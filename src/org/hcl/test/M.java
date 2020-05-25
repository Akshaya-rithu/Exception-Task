package org.hcl.test;

import java.io.IOException;

public class M {
	void method() throws IOException {
		throw new IOException("device error");
	}
	public static void main(String[] args) {
		System.out.println("Add my exception code");
	}
	public void branch() {
		System.out.println("akali");
	}

}
