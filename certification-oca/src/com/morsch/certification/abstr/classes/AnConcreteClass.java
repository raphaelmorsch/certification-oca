package com.morsch.certification.abstr.classes;

public class AnConcreteClass extends AnAbstractClass{
	
	static char[] chars = {'a','@'};
	static int[] a = {1,053};
	static int ints[][] = new int[3][];
	static int[] ints2 = new int[0b101];

	@Override
	void duplicateANumber(int numberToDoubleFor) {
		// TODO Auto-generated method stub
		setAnotherNumber(numberToDoubleFor);
		System.out.println(getAnotherNumber());
		ints[1] = new int[] {1,2,3};
		ints[2] = new int[] {4,5};
		System.out.println(ints[1][1]);
		
		for (int i : ints2) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		new AnConcreteClass().duplicateANumber(19);
		System.out.println(chars[chars.length-1]);
		System.out.println(a[1]);
	}

	@Override
	void increaseANumber(int quantityToIncrease) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
}
