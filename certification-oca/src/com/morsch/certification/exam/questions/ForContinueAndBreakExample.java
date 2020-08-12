package com.morsch.certification.exam.questions;

public class ForContinueAndBreakExample {

	static String o = "";
	static int x = 1;
	
	public static void main(String[] args) {
		
		z: for (int x = 3; x < 8; x++) {
			if (x == 4) 
				continue;
			if (x == 4) 
				break z;
			o += x;
			
		}
		System.out.println(o);
		
		if (x < 10);
		System.out.println(x);
		if (x > 8)
			System.out.println(x);;;;;
			
		if(false);
		else
			System.out.println("valid block");
			
		
		int[] nums = {0,1,2,3,4};
		for (int x : nums) {
			System.out.print(x);
			continue;
			System.out.print(x + ForContinueAndBreakExample.x);
		}
		
		do {
			int u = 1;
			new String("a");
			System.out.println(u++ + "");
		} while (u <= 5);
	}
}
