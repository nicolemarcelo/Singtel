package com.java.AnimalBaseDTO;


public class Fish extends Animal implements Swimmers {

	public String color;
	public String size;
	public String action;
	
	public Fish() {
		canSwim = true;
	}
	
	@Override
	public void swim() {
		System.out.println("I am a fish and I swim!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
}
