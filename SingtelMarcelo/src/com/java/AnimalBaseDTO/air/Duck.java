package com.java.AnimalBaseDTO.air;

import com.java.AnimalBaseDTO.Bird;

public class Duck extends Bird {

	public Duck() {
		canSwim = true;
	}
	
	@Override
	public void makeSounds() {
		System.out.println("Quack, quack");
	}
}
