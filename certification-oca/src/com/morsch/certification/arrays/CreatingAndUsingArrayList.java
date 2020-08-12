package com.morsch.certification.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingAndUsingArrayList {
	
	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList<>(list2);
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();
		
		list1.add("hawk");
		list1.add(Boolean.FALSE);
		list1.remove(1);
		
		List<String> birds = new ArrayList<String>();
		birds.add("hawk");
		//birds.add(2,"robin");//IndexOutOfBounds exception
		birds.add(0,"blue jay");
		System.out.println(birds);
		
		//converting ArrayList to arrays and vice-versa (interesting topics)
		List<String> list = new ArrayList<String>();
		list.add("hawk");
		list.add("blue jay");
		//String[] objArr = list.toArray(); that wouldn't be possible because toArray() converts into an array of Object
		String[] strArr = list.toArray(new String[0]); // so you specify a new array for the type you want...
		//the 0 lets java determines the size of the array
		
		//..vice versa
		String[] strArrNew = {"hawk", "blue jay"};
		List<String> listNew = Arrays.asList(strArrNew);
		listNew.set(1, "test");
		strArrNew[0] = "new";
		for (String string : strArrNew) {
			System.out.println(string);
		}
		listNew.remove(1);//Here we will have an exception, because the list and the array are 
		//linked and you cannot change the size of the list anymore
		
		List<String> coolListWithVarArgs = Arrays.asList("one","two", "three");
		
		
	}

}
