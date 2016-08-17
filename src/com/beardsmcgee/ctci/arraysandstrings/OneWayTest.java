package com.beardsmcgee.ctci.arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneWayTest {
	
	@Test
	public void assertTruePalePle() {
		assertTrue(OneWay.check("pale", "ple"));
	}

	@Test
	public void assertTruePalesPale() {
		assertTrue(OneWay.check("pales", "pale"));
	}
	
	@Test
	public void assertTruePaleBale() {
		assertTrue(OneWay.check("pale", "bale"));
	}
	
	@Test
	public void assertTrueAlePale() {
		assertTrue(OneWay.check("ale", "pale"));
	}
	
	@Test
	public void assertFalsePaleBake() {
		assertFalse(OneWay.check("pale", "bake"));
	}
}
