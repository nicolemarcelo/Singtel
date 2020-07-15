package com.java.AnimalBaseDTO.insect;

import com.java.AnimalBaseDTO.Animal;

public class Caterpillar extends Animal {

	public Caterpillar() {
		canWalk = true;
	}
	
	Butterfly butterfly;
	
	public void metamorphosis() {
		butterfly = new Butterfly();
	}
	
	
}
