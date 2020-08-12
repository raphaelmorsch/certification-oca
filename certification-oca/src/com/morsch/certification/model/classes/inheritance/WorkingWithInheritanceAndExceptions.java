package com.morsch.certification.model.classes.inheritance;

import java.io.FileNotFoundException;
import java.time.Period;
import java.util.Arrays;

interface Movable {
	static int speed = 12;
	String s = "speed";
}

class Animal2 {
	public void eat() throws IndexOutOfBoundsException {
		System.out.print("Animal eats");
	}
	
	protected void go() throws FileNotFoundException {
		System.out.println("Parent");
	}
}

abstract class OtherAnimal extends Animal2 {
	
}

class Dog extends Animal2 {
	void eat(String s) throws IndexOutOfBoundsException {
		System.out.print("Dog eats " + s);
	}
	
	double divide(int i, int j) {
		return i/j;
	}
	
	@Override
	protected void go() throws RuntimeException {
		// TODO Auto-generated method stub
		System.out.println("Child");
		int s = 2;
		double aa = s;
		long aas = s;
	}
}

public class WorkingWithInheritanceAndExceptions {
	
	final int jjj;
	int ggg;
	int $_;
	public void method() {
		
		int i = 0;
		short s = (short)i;
	}
	
	private int method(String s) {
		return 0;
	}
	
	public static void main(String[] args) {
		
		int[] intArr = new int[4];
		intArr[3] = intArr[0] + intArr[2] / intArr[1];
		System.out.println(Arrays.toString(intArr));
		
		
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("Runtime");
		} catch (Exception ex) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Terminated");
		
		
		Period p1 = Period.ofYears(1);
		Period p2 = Period.of(0, 1, 0);
		Period p3 = p1.plus(p2);
		System.out.println(p3.getMonths());
		
		
		Integer iSS = 1033200;
		System.out.println(iSS.SIZE);
		System.out.println(iSS.BYTES);
		
		boolean b = Boolean.getBoolean("FALSE");
		System.out.println(b);
		
		Animal2 a = new Dog();
		Dog bb = (Dog) new Animal2();
		Dog d = (Dog) a;
		a.eat();
		d.eat("Meat");
		
		Double dd = 8.08;
		System.out.println(dd instanceof Object);
		
		int i = 30, j = 3;
		int yyy;
		System.out.println(new WorkingWithInheritanceAndExceptions().ggg);
		double ddf = d.divide(i, j);
		System.out.println(ddf);
		
		String str = "1Z0-808";
		str = str.replace("80", "81");
		str = str.substring(str.indexOf("80"), str.lastIndexOf("80"));
		System.out.println(str.length());
		
		
		
	}
	
	{
		jjj = 0;
	}

}


