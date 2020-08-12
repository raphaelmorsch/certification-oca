package com.morsch.certification.operations.decision.constructs;

public class OperatorsPrecedence {
	
	static int g = 2;
	static int h;
	
	static {
		int g = 3;
		h = g;
	}
	
	public static void main(String[] args) {
		int x = 10, y = 12;
		System.out.println("Answer is" + x + y);
		
		if (g > 1) {
			g++;
			int g = 4;
		}
		System.out.println(g);
		
		System.out.println(g + h);
		
		final int g = 10;
		
		int[] a = {1,2,3};
		for (int j : a) {
			if(j == 2) continue;
			for (int d = 0; d < 3; System.out.print(d)) {
				d++;
			}
			
		}
		

		
		int m = 1;
		int n = 10;
		if((m*=3) == n) {
			System.out.println(n);
		} else {
			System.out.println(m);
		}
		
	}
	
	final int /** */ array[] = {1,2,3};
	

}
