package com.morsch.handling.exceptions;

import java.io.IOException;
import java.lang.Math.*;
import static java.lang.Math.*;
import java.lang.*;

import static com.morsch.handling.exceptions.Catching2OrMoreExceptions.*;

interface Eletronic{
	
}

abstract class Animal {
	
	public Animal(String s) {
		super();
		int i = 0;
		double d = 0;
		long l = 12;
		System.out.println(d==l);
	}
	
	public void eat() throws Exception {
		System.out.println("Animal eats");
		for(;;);
	}
	
	abstract Number number();
}

class Dog extends Animal implements Eletronic{
	
	
	
	public Dog(String s) {
		super(null);
		System.out.println(s);
	}
	
	Dog() {
		this("Dog");
	}
	
	@Override
	public void eat()  {
		System.out.println("Dog eats");
	}

	@Override
	public Integer number() throws NumberFormatException {
 
		return null;
	}
}

public class HandlingExceptions {

	static Integer i;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		System.out.println(PI);
		
		Integer one = new Integer(127);
		Integer two = new Integer(127);
		System.out.println(one == two);
		
		int y = 10;
		try {
			int x = 0;
			int z = y/0;
		} catch (ArithmeticException e) {
			System.out.println("AAA");
		} catch (NumberFormatException nfe) {
			System.out.println("BBB");
		}
		
		
		//doIt();
		//didIt();
		
		Animal a = new Dog();
		Dog d = new Dog();
		if (d instanceof Eletronic) {
			String str = "";
			int intt = (int) str;
		}
		d.eat();
		print();
		try {
			a.eat();
		} catch (Exception e) {
			System.out.println("Hey!");
		}
		
	}
	
	static void print() {
		try {

			i++;	
		} catch (Exception e) {
			System.out.println("sdad");
		}
	}
	
	static void doIt() throws IOException {
		throw new IOException();
	}
	
	static void didIt() throws ClassNotFoundException {
		throw new SecurityException();
	}

}
