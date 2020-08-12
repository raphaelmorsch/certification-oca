package com.morsch.certification.model.classes.inheritance;

public class InterfaceWithStaticMethods {
	public static void main(String[] args) {
		Move.print();
		System.out.println(Move.s);
	}
}

interface Move {
	
	String s = "4";
	
	public static void main(String[] args) {
		System.out.println("Ei");
	}
	
	public static void print() {};
}
