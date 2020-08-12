package com.morsch.handling.exceptions;

import java.io.IOException;

class Catching2OrMoreExceptions {
	
	static Integer intsd;
	
	public static final int MAX_VALUE = 180;
	
	public static void main(String[] args) {
		System.out.println(args[0]);
		
		short[] s = new short[3];
		int[] inn = {22,2,2};
		
		

		if(true);
		
		int h = 0;
		while ((h = 0) <= 0) {
			System.out.println(h);
			h++;
		}
		
		int myIntArr[] = new int[3];
		myIntArr = new int[2];
		
		StringBuilder sb = new StringBuilder("Whiz");
		sb = sb.append("lab");
		sb.append("s");
		sb.setLength(7);
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("Java");
		sb1.insert(0, "The latest").append("version is").append(" 1.7").delete(27, 28).append("8").substring(4);
		System.out.println(sb1);
		
		
		
		try {
			test();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public static void test() throws IOException {
		System.out.println("Test");
	}

}
