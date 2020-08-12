package com.morsch.certification.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HandlingExceptions {
	
	
	public static void main(String[] args) {
		int x = 5, y = 10;
		
		//int[] myIntArr = new int[-3];//java.lang.NegativeArraySizeException example
		
		try {
			y /= x;
		} catch (Exception e) {
			System.out.println("Error");
		} finally {
			System.out.println("finally");
		} 
	}
	
	public static IOException method() {
		
		return new IOException();
		/* unreachable code example
		try {
			return new IOException();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}*/
		
	}

}
