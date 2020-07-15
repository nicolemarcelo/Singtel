package com.java.AnimalBaseDTO;

public class Bird extends Animal {
	
	public Bird() {
		canWalk = true;
		canFly = true;
		canSing = true;
	}
	
	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("I am singing");
	}
	
}
