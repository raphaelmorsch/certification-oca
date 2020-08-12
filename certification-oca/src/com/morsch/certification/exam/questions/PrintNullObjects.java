package com.morsch.certification.exam.questions;

public class PrintNullObjects {

	static int x = 50;
	
	public static void main(String[] args) {
		
		Integer[] a = new Integer[2];
		a[1] = 10;
		
		for (Integer I : a) {
			System.out.print(I);
		}

		int[] b = {0,1,2,3};
		int y = b.length;
		int x = y - 1;
		
		while(y >= 0) {
			System.out.println(b[--y]);
		}
		
	}

}
