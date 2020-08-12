package com.morsch.certification.interfaces.lambdas;

public class Animal {
	
	private boolean hop;
	
	private boolean swim;
	
	public Animal(boolean hops, boolean swims) {
		this.hop = hops;
		this.swim = swims;
	}
	
	public boolean canHop() {
		return this.hop;
	}
	
	public boolean canSwim() {
		return this.swim;
	}
	

}
