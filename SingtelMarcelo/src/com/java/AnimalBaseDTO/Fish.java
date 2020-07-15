package com.java.AnimalBaseDTO;

public class Fish extends Animal {

	public String color;
	public String size;
	public String action;
	
	public Fish() {
		canSwim = true;
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
