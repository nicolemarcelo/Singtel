package com.java.DTO;

public class Duck extends Bird {

	public Duck() {
		canSwim = true;
	}
	
	@Override
	public void makeSounds() {
		System.out.println("Quack, quack");
	}
}
