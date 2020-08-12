package com.morsch.certification.model.classes.inheritance;

public interface ISwimm {

	public default int getSpeed() {
		return 3;
	}
}
