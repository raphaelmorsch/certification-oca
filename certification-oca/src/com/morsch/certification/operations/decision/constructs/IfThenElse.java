package com.morsch.certification.operations.decision.constructs;

public class IfThenElse {
	
	public static void main(String[] args) {
		int marks = 60;
		
		if(marks >= 40) System.out.println("C");
		else if (marks >= 60) System.out.println("B");
		else if (marks >= 75) System.out.println("A");
		else System.out.println("D");
		
		
	}

}
