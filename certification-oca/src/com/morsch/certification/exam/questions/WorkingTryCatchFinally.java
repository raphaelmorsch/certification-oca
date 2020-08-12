package com.morsch.certification.exam.questions;

public class WorkingTryCatchFinally {
	
	static Integer I;
	
	public static void main(String[] args) {
		
		String s;
		
		Object o = new Double(3);
		Number n = (Number) o;
		System.out.println(n);
		
		try {
			s = I.toString();
		} finally {
			try {
				int i = I.parseInt(args[0]);
			} catch (NumberFormatException E) {
				System.out.println("Number Format");
			} finally {
				System.out.println("Fin 2");
			}
			System.out.println("Fin 1");
		}
	}

}
