package com.morsch.certification.arrays;

import java.util.Arrays;

public class CreatingAndUsingArrays {
	
	public static void main(String[] args) {
		
		
		double dbls[] = {1.0,2.1,3.5};
		dbls = new double[] {1.3,2.3,2.2};
		
		int xa[] = new int[3];
		Arrays.fill(xa, 1);
		System.out.println(xa[2]);
		
		String out = "";
		z:for (int i = 3; i < 8; i++) {
			if(i == 3)
				continue;
			if(i == 3)
				break z;
			out += i;
			
		}
		System.out.print(out+"aaa");
		
		
		Integer[] a1 = {2,-1,4,5,3};
		Integer[] a2 = {2,-1,4,5,3};
		int []a = {1,2,3,4,5,6};
		
		for(int i = 0, j = 0; i < a.length; j++) {
			i = a [j];
			System.out.println(i + " ");
		}
		
		for(int i : a) {
			
			System.out.println(i + " ");
		}

		System.out.println(a1 == a2);
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.deepEquals(a1, a2));
		
		int[] initializerIntArray = {1,2,3,4};
		
		for (int j : initializerIntArray) {
			if (j == 2) continue;
			for (int x = 0; x < 3; System.out.println(x)) {
				x++;
			}
		}
		System.out.println("!");
		
		int[][] initializerIntArrayWithProblems = new int[3][];
		initializerIntArrayWithProblems[0] = new int[3];
		
		int[] myIntArr = {2,-1,5,3,2};
		Arrays.sort(myIntArr);
		System.out.println(Arrays.binarySearch(myIntArr, -1));
		
		int array[][] = {{3,2,1},{5,4,2},{0,8,7}};
		
		outer:for(int x = 0, k = 0; x < 3; x++) {
			k = 0;
			inner:while(true) {
				System.out.print(array[x][k++]);
				if (k == 3) break inner;
			}
		}
		
		
		
		
	
		
		
		
		new CreatingAndUsingArrays().iterator(new int[] {10,12,13});
	}
	
	void iterator(int[] i) {
		for(int x = 0; x < i.length; System.out.println(i[x] + ""))x++;
	}
	
	void meth() throws Exception {
		System.out.println("Teste");
	}

}
