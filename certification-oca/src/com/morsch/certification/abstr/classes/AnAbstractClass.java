package com.morsch.certification.abstr.classes;

public abstract class AnAbstractClass {
	
	private static int aNumber;
	
	private int anotherNumber;
	
	private static void setANumber(int aNumber) {
		AnAbstractClass.aNumber = aNumber;
	}
	
	abstract void duplicateANumber(int numberToDoubleFor);
	
	abstract void increaseANumber(int quantityToIncrease);
	
	public static void main(String[] args) {
		System.out.println();
	}

	public int getAnotherNumber() {
		return anotherNumber;
	}

	public void setAnotherNumber(int anotherNumber) {
		this.anotherNumber = anotherNumber;
	}
	
	

}
