
package com.morsch.certification.exam.questions;

import java.lang.Math.*;
import static java.lang.Math.*;
import java.lang.*;

public class ThrowingException1 {
	
	public static void main(String[] args) {
		
		System.out.println(PI);
		
		try {
			int x = Integer.parseInt("one");
		} catch (IllegalArgumentException cce) {
			System.out.println("Hey!!");
		}
		
		try {
			print();
		} catch (Exception e) {
			
		}
	}
	
	static void print() {
		try {
			throw new NullPointerException();
		} catch (ClassCastException cce) {
			System.out.print("Class cast");
		} finally {
			System.out.print("Final");
		}
		System.out.print("OCAJP");
	}

}
