package com.morsch.certification.model;

public class LambdaAnimal {

	private String species;
	
	private boolean canHop;
	
	private boolean canSwim;
	
	public LambdaAnimal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public String getSpecies() {
		return species;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}
	
	@Override
	public String toString() {
		return species;
	}
}
