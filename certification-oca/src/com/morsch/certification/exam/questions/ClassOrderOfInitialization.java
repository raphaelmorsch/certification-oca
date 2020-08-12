package com.morsch.certification.exam.questions;

public class ClassOrderOfInitialization {
	
	static int y = 10;
	
	public static void main(String[] args) {
		System.out.println(" Main ");
		
//		int x = 2;
//		for (int x = 0; x < 3; x++) {
//			System.out.println(x);
//		}
		
		for (y = 1; y < 3; y++) {
			System.out.println(y);
		}
		
		System.out.println(y);
	}
	
	{
		System.out.println(" Whiz ");
	}
	
	static {
		System.out.println(" Static ");
	}

}
