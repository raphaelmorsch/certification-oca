package com.morsch.certification.arrays;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class KnowingTheArraysHelperClass {
	
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.of(2016, 02, 23);
		Period p = Period.ofMonths(13);
		System.out.println(p.normalized());
		
	}

}
