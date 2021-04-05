package com.ibm.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMaths {
	//hello maths
	private static Maths m;
	
	@BeforeAll
	public static void setup() {
		m=new Maths();
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, m.add(5, 5));
	}
	
	@Test
	public void testSubs() {
		assertEquals(8, m.subs(10, 2));
	}
	
	@Test
	public void testDiv() {
		assertThrows(ArithmeticException.class, ()->m.div(2, 0));
	}
	
	@Test
	public void testSquare() {
		assertEquals(25, m.square(5));
	}
	
	
}
