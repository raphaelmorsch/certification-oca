package com.morsch.certification.exam.questions;

class A {
	A method() {
		return new A();
	}
}

class B {
	B method() {
		return new B();
	}
}

class Animal {
	void eat() {
		System.out.println("Animal eat");
	}
	
	Object supply() {
		return null;
	}
}

class Bird extends Animal {
	void eat() {
		System.out.println("Bird eat");
	}
	
	void print() {
		super.eat();
	}
	
	public Object supply() throws RuntimeException {
		return null;
	}
}

public class WorkingWithInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.print();

	}

}
