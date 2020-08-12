package com.morsch.certification.exam.questions;

public class UsingOperatorsAndDecisionConstructs {

	static String out = "";
	
	public static void main(String[] args) {
		
		int x = 5, y = 8;
		
		if( x++ == 5) out  += "1";
		
		if (x != 6) {
			
		} else if (x > 9) {
			out += "2";
		} else if (y < 9) {
			out += "3";
		} else if (x == 6) {
			out += "4";
		} else {
			out += "5";
		}
		
		System.out.println(out);
		
		int a = 20;
		int b = 13;
		System.out.print("" + a + b + " ");
		System.out.print(a + b + " ");
		System.out.print(a + " " + b);
		
		int eqA = 1;
		int eqB = 1;
		System.out.println(eqA==eqB);
		
		float eqF = 1.0877099949f;
		double eqD = 1.0877099949d;
		
		System.out.println(eqF==eqD);
		
		

	}

}
