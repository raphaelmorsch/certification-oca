package com.morsch.certification.exam.questions;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class JavaSETest {
	
	public static void main(String...args) {
		
		System.out.println(LocalTime.now());
		Integer myInteger = Integer.valueOf("808.1");
		System.out.println(myInteger);
		
		
		int cardVal = 14;
		
		switch (cardVal) {
		case 4: case 5: case 6:
		case 7: case 8:
			System.out.println("Hit");
			break;
		case 9: case 10: case 11:
			System.out.println();
			break;
		case 15: case 16:
			System.out.println("Surrender");
			break;
		default:
			System.out.println("Stand");
		}
		
		List<String> items = new ArrayList<>();
		items.add("Pen");
		items.add("Pencil");
		items.add("Box");
		for (String i : items) {
			if (i.indexOf("P") == 0) {
				continue;
			} else {
				System.out.println(i + "");
			}
		}
		
		int x = 10;
		int y = 2;
		try {
			for (int z = 2; z >= 0; z--) {
				int ans = x / z;
				System.out.print(ans + " ");
			}
		} catch (ArithmeticException e1) {
			System.out.println("E1");
		} catch (Exception e1) {
			System.out.println("E2");
		}

		List<Integer> elements = new ArrayList<>();
		elements.add(10);
		int firstElement = elements.get(1);
		System.out.println(firstElement);
		
	}

}
