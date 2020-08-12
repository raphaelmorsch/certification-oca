package com.morsch.java.data.types;

public class DoublesAndIntegers {
	
	int m = 10;
	
	public static void main(String[] args) {
		Integer i = 10;
		Double d = 10.0;
		int ii = 10;
		double dd = 10.0;
		
		System.out.println(m);
		
		System.out.println(i.equals(d)) ;
		System.out.println(ii == dd);
		System.out.println(ii == d);
		
		Double dSize = 0.0;
		System.out.println(dSize.BYTES);
		System.out.println(dSize.SIZE);
		
		int array[] = {1,2,3};
		//double dbls[] = array;
		
		int myInt;
		//double myDoub = myInt;
	}

}
