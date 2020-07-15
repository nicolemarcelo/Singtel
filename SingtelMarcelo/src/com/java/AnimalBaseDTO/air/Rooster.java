package com.java.AnimalBaseDTO.air;

import com.java.AnimalBaseDTO.Bird;

public class Rooster extends Bird {
	
	Chicken rooster;
	public Rooster() {
		rooster = new Chicken();
	}
	
	@Override
	public void makeSounds() {
		System.out.println("Cock-a-doodle-doo");
	}
}
