package com.beardsmcgee.ctci.arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromePermutationTest {

	@Test
	public void shouldBeTrue() {
		assertTrue(PalindromePermutation.check("Tact Coa"));
	}
	
	@Test
	public void shouldBeFalse() {
		assertFalse(PalindromePermutation.check("abceddfcbga"));
	}

}
