package com.java.DTO;

public class Chicken extends Bird {
	
	public Chicken() {
		canFly = false;
	}
	
	@Override
	public void makeSounds() {
		System.out.println("Cluck, cluck");
	}
	
}
