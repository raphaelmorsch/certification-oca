package com.morsch.certification.model.classes.inheritance;


public class WorkingWithInheritanceAndInterfaces {
	
	public static void main(String[] args) {
		In i = new In() {
		};
		i.print();
		In.method();
	}

}

interface In {
//	default boolean equals(Object o) {
//		return true;
//	}
	
	static void method() {
		System.out.print("Static");
	}
	
	default void print() {
		System.out.print("I");
	}
}



