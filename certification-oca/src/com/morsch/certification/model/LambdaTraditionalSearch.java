package com.morsch.certification.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTraditionalSearch {

	public static void main(String[] args) {
		List<LambdaAnimal> animals = new ArrayList<LambdaAnimal>();
		animals.add(new LambdaAnimal("fish", false, true));
		animals.add(new LambdaAnimal("kangaroo", true, false));
		animals.add(new LambdaAnimal("rabbit", true, false));
		animals.add(new LambdaAnimal("turtle", false, true));

		print(animals, a -> a.canHop());
		boolean[] twoBoolean = {false, true};
		System.out.println(returnLength(true, twoBoolean));
	}

	private static void print(List<LambdaAnimal> animals, Predicate<LambdaAnimal> checker) {

		for (LambdaAnimal animal : animals) {
			if (checker.test(animal)) {
				System.out.print(animal + "");
			}
			System.out.println();
		}
	}
	
	final void methodA() {
		
	}
	
	public static int returnLength(boolean arg0, boolean... bs ) {
		return bs.length;
	}
}
