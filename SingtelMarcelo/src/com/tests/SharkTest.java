package com.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.AnimalBaseDTO.sea.Shark;

class SharkTest {

	@Test
	void testSharkColor() {
		Shark shark = new Shark();
		assertEquals("Grey", shark.color);
	}
	
	@Test
	void testInheritedVariableSwim() {
		Shark shark = new Shark();
		assertEquals(true, shark.canSwim);
	}
	
	@Test
	void testInheritedVariableWalk() {
		Shark shark = new Shark();
		assertEquals(false, shark.canWalk);
	}

}
