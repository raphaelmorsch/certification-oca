package com.morsch.certification.methods.encapsulation;

import java.util.Arrays;
import static java.lang.Math.pow;

public class PassingVariablesAsParameters {
	
	public static void main(String[] args) throws Exception{
		int x = 1;
		int y = new PassingVariablesAsParameters().change(x);
		System.out.println(x+y);
		
		long size = 0xB;
		System.out.println(size);
		
		StringBuilder sb = new StringBuilder();
		sb.append('c');
		
		int a[] = {3,6,1,4,0};
		int b[][] = {{1,2,4},{2,2,1},{0,43,2}};
		
		Arrays.sort(a,0,4);
		for (int is : a) {
			System.out.println(is);
		}
		
		System.out.println(a[3]==b[0][2]);
		System.out.println(a[2]==b[2][1]);
		
		int[] iterator = new int[] {10,12,13};
		for(int xi = 0; xi<iterator.length;System.out.println(iterator[xi]))xi++;

		int c[] = {1,2,3};
		errorD();
		
		pow(10d, 5d);
		

	
	}
	
	int change(int x) {
		x = 2;
		return x;
	}
	
	static void errorD() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			throw e;
		} finally {
			System.out.println("Finally Completed");
		}
		
	}
	

}
