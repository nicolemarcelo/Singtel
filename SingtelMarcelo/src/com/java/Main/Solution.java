package com.java.Main;

import com.java.AnimalBaseDTO.Bird;
import com.java.AnimalBaseDTO.Animal;
import com.java.AnimalBaseDTO.insect.Butterfly;
import com.java.AnimalBaseDTO.land.Cat;
import com.java.AnimalBaseDTO.land.Dog;
import com.java.AnimalBaseDTO.land.Frog;
import com.java.AnimalBaseDTO.air.Chicken;
import com.java.AnimalBaseDTO.sea.Clownfish;
import com.java.AnimalBaseDTO.sea.Dolphin;
import com.java.AnimalBaseDTO.air.Duck;
import com.java.AnimalBaseDTO.Fish;
import com.java.AnimalBaseDTO.air.Parrot;
import com.java.AnimalBaseDTO.air.Rooster;
import com.java.AnimalBaseDTO.sea.Shark;

public class Solution {

	public static void main(String[] args) {
		Animal[] animals = new Animal[]{ new Bird(),
		        new Duck(),
		        new Chicken(),
		        new Rooster(),
		        new Parrot(),
		        new Fish(),
		        new Shark(),
		        new Clownfish(),
		        new Dolphin(),
		        new Frog(),
		        new Dog(),
		        new Butterfly(),
		        new Cat()
		};
		
		int animalsThatCanFly = 0;
		int animalsThatCanWalk = 0;
		int animalsThatCanSing = 0;
		int animalsThatCanSwim = 0;
		
		for(int i=0; i<animals.length; i++) {
			if(animals[i].canFly) {
				System.out.println(animals[i].getClass().getName() + " can fly");
				animalsThatCanFly++;
			}
			if(animals[i].canWalk) {
				System.out.println(animals[i].getClass().getName() + " can walk");
				animalsThatCanWalk++;
			}
			if(animals[i].canSing) {
				System.out.println(animals[i].getClass().getName() + " can sing");
				animalsThatCanSing++;
			}
			if(animals[i].canSwim) {
				System.out.println(animals[i].getClass().getName() + " can swim");
				animalsThatCanSwim++;
			}
		}
		
		System.out.println("Animals that can fly: " + animalsThatCanFly);
		System.out.println("Animals that can walk: " + animalsThatCanWalk);
		System.out.println("Animals that can sing: " + animalsThatCanSing);
		System.out.println("Animals that can swim: " + animalsThatCanSwim);
	}

}
