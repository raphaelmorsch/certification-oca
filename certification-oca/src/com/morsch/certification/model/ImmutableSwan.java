package com.morsch.certification.model;

import java.util.ArrayList;
import java.util.List;

public class ImmutableSwan {

	private int numberEggs;

	private List<String> actionList;

	// this is an example of defensive copy...is useful when you immutable class has
	// mutable properties
	public List<String> getActionList() {
		return new ArrayList<String>(actionList);
	}

	public ImmutableSwan(int numberEggs) {
		if (numberEggs >= 0) {
			this.numberEggs = numberEggs;
		}
	}

	public ImmutableSwan(List<String> actionList) {

		this.actionList = new ArrayList<String>(actionList);

	}

	public int getNumberEggs() {
		return numberEggs;
	}

}
