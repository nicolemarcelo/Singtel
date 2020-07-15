package com.java.AnimalBaseDTO.sea;

import com.java.AnimalBaseDTO.Animal;
import com.java.AnimalBaseDTO.Swimmers;

public class Dolphin extends Animal implements Swimmers {

	@Override
	public void swim() {
		System.out.println("I am a dolphin and I also swim!");
	}

}
