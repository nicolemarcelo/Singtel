package com.java.AnimalBaseDTO.air;

import com.java.AnimalBaseDTO.Bird;

public class Parrot extends Bird {

	//Add more conditions for future enhancements
	public void makeSounds(String livingWith) {
		if(livingWith.equalsIgnoreCase("dogs")) {
			System.out.println("Woof, woof");
		} else if(livingWith.equalsIgnoreCase("cats")) {
			System.out.println("Meow");
		} else if(livingWith.equalsIgnoreCase("roosters")) {
			Rooster rooster = new Rooster();
			rooster.makeSounds();
		}
	}
	
}
