package com.morsch.certification.date.time;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Year;

public class WorkingWithLocalDatesAndTimes {
	
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now(Clock.systemDefaultZone());
		d1 = d1.plusDays(78);
		
		StringBuilder sb = new StringBuilder("Whizlabs");
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());

		Year y = Year.of(2014);
		LocalDate ldd = y.atMonthDay(MonthDay.of(4, 31));

		
		char[] myChar = new char[4];
		new StringBuilder("Whizlabs").getChars(1, 5, myChar, 1);
		
		
		//LocalTime lt = LocalDate.of(2020,3,4).atTime(12,11);
		
		
	}
	
	

}
