package com.morsch.certification.exam.questions;

public class UsingLoopConstructs {

	void UsingLoopConstructs( ) {
		new UsingLoopConstructs();
	}
	
	public static void main(String[] args) {
		
		int x = 0;
		
		String[] animal = new String[3];
		
		do {animal[x] = "Cat"; x++;} while (false);
		do {
			animal[x] = "Dog";
			} 
		while (
				x > animal[x++].length()
				);
		do {
			animal[x] = "Rat";
		} while (x > 3);
		
		for (String s : animal) {
			System.out.println(s + "");
		}
		
		for(int j = 0, k = 5; j < k; k--);
		for(int j = 0;j++<3;);
		for(int i = 0;i <5;i++, System.out.println(i + "Hi"));
		
		L1: for(int i =5, j = 0; i > 0; i--) {
			L2: for(; j <5; j++) {
				System.out.print(i + "" + j +" ");
				if (j == 0) continue L1;
			}
		}
		
		int arr[][] = {{1,3,5},{7,8}};
		out:for (int[] a : arr) {
			for (int i : a) {
				if (i == 7) continue;
				System.out.print(i + " ");
				if (i == 3) break;
			}
		}
		
		
	}
	
	void call() {
		UsingLoopConstructs();
	}
}
