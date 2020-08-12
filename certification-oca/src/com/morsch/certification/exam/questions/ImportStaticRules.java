package com.morsch.certification.exam.questions;

import static java.lang.System.*;

public class ImportStaticRules {
	
	static int x = 10;
	
	public static void main(String[] args) {
		out.println(x);
		
		for (int i = 9; i > 0; i--) {
			for (int j = 8; i > j; j++) {
				System.out.println(i + j);
			}
		}
	}

}
