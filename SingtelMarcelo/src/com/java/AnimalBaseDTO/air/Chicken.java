package com.java.AnimalBaseDTO.air;

import com.java.AnimalBaseDTO.Bird;

public class Chicken extends Bird {
	
	public Chicken() {
		canFly = false;
	}
	
	@Override
	public void makeSounds() {
		System.out.println("Cluck, cluck");
	}
	
}
