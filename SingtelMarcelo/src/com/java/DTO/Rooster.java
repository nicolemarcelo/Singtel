package com.java.DTO;


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
