package com.morsch.certification.exam.questions;

class SuperClass {
	public SuperClass(int x) {
		System.out.println("Super");
	}
}

public class SubClass extends SuperClass{

	public SubClass() {
		super(10);
		System.out.println("Sub 2");
	}
}
