package com.java.AnimalBaseDTO;

public class Animal {
	
	public boolean canFly = false;
	public boolean canWalk = false;
	public boolean canSing = false;
	public boolean canSwim = false;
	
	public void walk(){
		System.out.println("I am walking"); 
	}
	
	public void makeSounds() {
		System.out.println("I am making sounds");
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean isCanWalk() {
		return canWalk;
	}

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public boolean isCanSing() {
		return canSing;
	}

	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
	
	
}
