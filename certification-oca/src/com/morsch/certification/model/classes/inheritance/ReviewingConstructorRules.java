package com.morsch.certification.model.classes.inheritance;

/*
 * 1 - The 1st statement of the constructor is a call to a super() constructor in the Parent Class or a call to a call to 
 * another constructor within the class with the this() statement
 * 2 - The super() constructor and the this() constructor might only be called as the 1st argument of the constructor
 * 3 - If no super() call is declared on constructor, the compiler will add one no-argument constructor
 * 4 - If the parent doesn't define a no-argument constructor and the child class doesn't define any constructors, the compiler
 * will throw an error an try to insert an default no-argument in the child class, but in the parent it does not exists.
 * 5 - If the parent class doesn't define a no-argument class, either, the child class must provide a call to the specific parent
 * constructor, or the no-argument constructor must be added on the parent class * */

class Animal {
	void eat() {
		System.out.println("Animal eats");
	}
	
	Object supply() {
		return null;
	}
}

class Bird extends Animal2 {
	void eat() {
		System.out.println("Bird eats");
	}
	
	void print() {
		super.eat();
	}
	
	@Override //if the method throws a child exception of the parent method, it will be correctly overridden.
	public Object supply() throws RuntimeException{
		return null;
	};
}


public class ReviewingConstructorRules {
	
	static int x = 10;
	
	public final static void main(String[] args) {
		Bird ab = new Bird();
		ab.print();
		ReviewingConstructorRules rcr = new ReviewingConstructorRules();
		rcr.x = 5;
		int y = x / rcr.x;
		int x = 9;
		Double d = 10;
		System.out.println("y = " + y);
	}

	class Mamal {
		public Mamal(int age) {
			
		}
	}
	
	class Elephant extends Mamal {
		public Elephant() {
			super(8);
		}
	}
	
	class ForestElephant extends Elephant {
		
	}
	
	
	/*
	 * But in this case below, both are not constructors, but methods that calls the default constructors
	 * */
	class A {
		A method() {
			return new A();
		}
	}
	
	class B extends A{
		
		B() {
			super();
			this.method();
		}
		
		B method() {
			return new B();
		}
		
		void B() {
			System.out.println("A");
		}
	}
	

}
