package com.morsch.certification.model.classes.inheritance;

public class Shark extends Fish{

	private final int numberOfFins = 8;
	
	public Shark(int age) {
		super(age);
	}
	
	public void displaySharkDetails() {
		System.out.print("Shark with age " + this.getAge());
		System.out.print(" and " + size + " meters long");
		System.out.print(" with " + numberOfFins + " fins");
	}
}
