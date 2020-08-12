package com.morsch.certification.exam.questions;

public class ConstructorInheritanceAndInitializationOrder {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		Manager p1 = (Person) m1;
	}
}

class Person {
	Person() {
		System.out.print("CP");
	}
	
	static {
		System.out.print("SP");
	}
}

class Manager extends Person {
	Manager() {
		System.out.print("CT");
	}
	
	{
		System.out.print("IT");
	}
}
