package com.morsch.certification.exam.questions;

import java.io.IOException;
import java.util.Arrays;

public class PlayingWithArrays {
	
	static String[][] strings = {{"A","b"},{"C","d"},{"D","e"}};
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Arrays.sort(strings);
		for (String[] string : strings) {
			for (String s : string) {
				System.out.print(s);
			}
		}
		doit();
		didit();
	}
	
	static void doit() throws ClassNotFoundException {
		throw new SecurityException();
	}
	
	static void didit() throws IOException {
		
	}

}
