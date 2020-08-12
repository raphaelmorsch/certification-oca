package com.morsch.certification.model.classes.inheritance;

interface I {
	void meth();
}

class A implements I {
	
	void A(String s) {
		
	}
	
	@Override
	public void meth() {
		System.out.println("A");
		
	}
	
}

class C extends A implements I {
	@Override
	public void meth() {
		System.out.println("C");
	}
}

public class ParentAndChildImplementingSameInterfaceExample {

	public static void main(String[] args) {
		A a  = new A();
		C c1 = (C)a;
		c1.meth();
	}
	
}
