package com.morsch.certification.operations.decision.constructs;

public class LearningSwitch {
	
	
	public static void main(String[] args) {
		String s = "A";
		String c1 = "B";
		String c2 = "C";
		String c3 = "D";

		switch(s) {
		case "B" : {System.out.println("ok");} //case must be constants or final
		}
		
		System.out.println(3);
		
		int x = 20;
		int y = 13;
		
		System.out.println("" + x + y + "");
		System.out.println(x + y + "");
		System.out.println(x + "" + y);
		
		for(int i = 0; i < 5; i++, System.out.print(i + ".Hi "));
		
		L1: for(int i = 5, j = 0; i > 0; i--)
			L2: for(;j<5;j++) {
				System.out.print(i + "" + j + " ");
				if(j == 0) continue L1;
			}
		
		int arr[][] = {{1,3,5},{7,8}};
		out: for (int[] a : arr) {
			for (int i : a) {
				if(i == 7) continue; System.out.print(i + " ");if(i == 3)break;
			}
		}
		
		final int arr2[] = {1,2,3};
		
		final int i = 0;
		final int j ;
		
		int xRandom = (int)(Math.random()*3);
		switch (xRandom) {
		case i:System.out.println("A");
		case 1: System.out.println("B");break;
		case j: System.out.println("C");
		
		}
		
		
//		switch (2) {
//		case arr2[0]: compiler error (is a variable=)
//			
//			break;
//
//		default:
//			break; 
//		}
				
		
		

	}
	

}
