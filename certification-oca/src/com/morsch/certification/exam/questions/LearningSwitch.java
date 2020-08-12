package com.morsch.certification.exam.questions;

public class LearningSwitch {
	
	
	public final void methid() {
		
	}
	
	public static void main(String[] args) {
		
		int aInt = 2;
		int aAnother = 3;
		final int xx = 9;
		

		
		
		//since this switch don't put a break on it, all case statements are executed
		switch (aInt) {
		case 0:
			System.out.println("value 0");
		case 1:
			System.out.println("Value 1");
			System.out.println("Second statement");
			int aInt1 = 9;
			break;
		case 2:
			System.out.println("Value 2");
			aInt1 = 0;//if statements for case 1 were under brackets, this variable would not be accessible here
			System.out.println(aInt1);//If we remove the initialization for aInt1 at the previous line, also there is a compiler error
		default:
			System.out.println("default");
			break;
		}
		
		switch (xx) {

		default:
			System.out.println("Default");
			break;
		case 1:
			System.out.println("Other Switch Value 1");
			
		case 2:
			System.out.println("Other Switch Value 2");

		case 3:
			System.out.println("Other Switch Value 3");
			break;

		case 4:
			System.out.println("Other Switch Value 4");
			break;
		}
		
	}

}
