package com.morsch.certification.exam.questions;


public class PlayingWithIfStatement {


	public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println("AnimalInt ->" + Animal2.animalInt);
		
		//The dog behaves like a dog, but only knows the methods that dog inherits from Animal...
		//dog.sound();
		
		// the a object will behave like a BClass...but only knows the methods that BClass inherits from AClass
		AClass a = new BClass();
		a.method();
		
		String out = "o";
		
		System.out.println("" + 1 + 2);
		System.out.println("" + (1 + 2));
		
		int i = -1, j = -5;
		
		if (i < 5)
			if(j > 0)
				if (i > j)
					out += "1";
				else 
					out += "2";
			else out += "3";
		else out += "4";
		System.out.println(out);
		
		int _6 = 6;
		
		if(_6 > 6) // valid name of variable
			System.out.println(">6");
		
		int iCharAt = new String("A").charAt(0);
		System.out.println(iCharAt);
		
		String b = "A";
		String c = "A";
		System.out.println("Hashcode b = " + b.hashCode());
		System.out.println("Hashcode c = " + c.hashCode());
		System.out.println("Hashcode a = " + a.hashCode());
		System.out.println(b.equals(c));
		System.out.println(c.equals(a));
	}
}

class AClass {
	 void method() {
		 System.out.println("A B");
	}
}

class BClass extends AClass {
	protected void method() {
		System.out.println("C D");
	}
}

class Animal2 {
	
	static int animalInt;
	
	void run() {
		System.out.println("Animal runs");
	}
	
	static {
		
		animalInt = 10;
		System.out.println("Animal2 animalInt = " + animalInt);
	}
	
	{
		System.out.println("Animal2 builded");
	}
	
	Animal2() {
		System.out.println("Animal constructor");
	}
}


class Dog extends Animal2 {
	
	void sound() {
		System.out.println("Bark");
	}
	
	public void run() {
		System.out.println("Dog runs");
	}
	
	public Dog() {
		
		System.out.println("Dog builded");
	}
	
	
}

