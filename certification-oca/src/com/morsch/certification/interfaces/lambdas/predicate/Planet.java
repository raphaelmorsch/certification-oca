package com.morsch.certification.interfaces.lambdas.predicate;

import java.awt.Color;

public class Planet {
	
	private String name = "Unknown";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getPrimaryColor() {
		return primaryColor;
	}

	public void setPrimaryColor(Color primaryColor) {
		this.primaryColor = primaryColor;
	}

	public Integer getNumberOfMoons() {
		return numberOfMoons;
	}

	public void setNumberOfMoons(Integer numberOfMoons) {
		this.numberOfMoons = numberOfMoons;
	}

	public Boolean getRinged() {
		return ringed;
	}

	public void setRinged(Boolean ringed) {
		this.ringed = ringed;
	}

	private Color primaryColor = Color.WHITE;
	
	private Integer numberOfMoons = 0;
	
	private Boolean ringed = false;
	
	public Planet(String name, Color primaryColor, Integer numberOfMoons, Boolean ringed) {
		this.name = name;
		this.primaryColor = primaryColor;
		this.numberOfMoons = numberOfMoons;
		this.ringed = ringed;
	}
	
	

}
