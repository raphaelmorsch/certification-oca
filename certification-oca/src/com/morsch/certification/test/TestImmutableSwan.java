package com.morsch.certification.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.morsch.certification.model.ImmutableSwan;

public class TestImmutableSwan {

	public static void main(String[] args) {
		
		String asd = null;
		System.out.println(asd);
		String[][] strings = {{"a","L","M","s"},{"d","E","F"}};
//		Arrays.sort(strings);
//		for (String[] string : strings) {
//			for (String str : string) {
//				System.out.print(str);
//			}
//			System.out.print(string);
//		}
	
		
		List<String> testActionList = new ArrayList<String>();
		testActionList.add("swim");
		testActionList.add("fly");
		
		ImmutableSwan testImmutableSwan = new ImmutableSwan(testActionList);
		
		testActionList.add("walk");
		testImmutableSwan.getActionList().add("walk");
		
		System.out.println(testActionList.toString());
		System.out.println(testImmutableSwan.getActionList().toString());
		System.out.println(testActionList == testImmutableSwan.getActionList());
		
		try {
			method();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Exception");
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}
	
	public static void method() throws IOException {
		throw new FileNotFoundException();
		
	}
}
