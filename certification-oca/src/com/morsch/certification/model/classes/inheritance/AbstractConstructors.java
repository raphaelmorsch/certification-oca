package com.morsch.certification.model.classes.inheritance;

public class AbstractConstructors {

}

abstract class Person {
	protected String name;
	
	Person(String s) {
		name = s;
	}
	
	public abstract String getName();
}

class Student extends Person {

	Student(String s) {
		
		super("a");
	}
	
	public String getName() {
		double d = 1.9;
		int r = (int) d;
		return name;
		
	}
	
}
