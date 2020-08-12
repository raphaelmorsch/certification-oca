package com.morsch.certification.exam.questions;

import java.util.function.BiFunction;

public enum LearningFunctionalAPI implements BiFunction<String, Integer, String>{
	
	
	ENUM_EXAMPLE_ONE,
	
	ENUM_FUNCTION_EXAMPLE((a, b) -> {
		return a + "-" + b;
	});
	
	private final BiFunction<String, Integer, String> myBiFunction;

	LearningFunctionalAPI(BiFunction<String, Integer, String> biFunction) {
		
		this.myBiFunction = biFunction;
	}
	
	private LearningFunctionalAPI() {
		
		this((myStr, myInt) -> {
			throw new IllegalArgumentException("Hey, what the hell?!?!?!");
		});
	}

	@Override
	public String apply(String t, Integer u) {
		
		return myBiFunction.apply(t, u);
	}

		
	

}
