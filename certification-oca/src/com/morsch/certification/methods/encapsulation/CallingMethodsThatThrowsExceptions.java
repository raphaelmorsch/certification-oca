package com.morsch.certification.methods.encapsulation;

public class CallingMethodsThatThrowsExceptions {
	
	public static void main(String[] args) {
		new CallingMethodsThatThrowsExceptions().meth();
	}
	
	public void meth() throws Exception {
		for (int x = 0; x > 5; x++) {
			System.out.println(x);
		}
	}

}
