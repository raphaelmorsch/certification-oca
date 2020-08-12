package com.morsch.certification.model.classes.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingWithExceptions {
	
	class SuperExceptionClass {
		
		void throwsException() throws IOException {
			System.out.println("throws Excpetion");
		}
	}
	
	class SubExceptionClass extends SuperExceptionClass {
		
		@Override
		void throwsException() throws IllegalArgumentException{
			System.out.println("throws nothing");
		}
		
		public void main(String[] args) {
			SuperExceptionClass spex = new SubExceptionClass();
			spex.throwsException();
			SubExceptionClass sbex = new SubExceptionClass();
			sbex.throwsException();
		}
		
	}
	


}
