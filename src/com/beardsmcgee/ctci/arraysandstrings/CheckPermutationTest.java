package com.beardsmcgee.ctci.arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPermutationTest {

	@Test
	public void shouldBeTrueRedDer() {
		assertTrue(CheckPermutation.check("red", "der"));
	}
	
	@Test
	public void shouldBeFalseDifferentSizeStrings(){
		assertFalse(CheckPermutation.check("red", "blue"));
	}
	
	@Test
	public void shouldBeTrueNonAlphaChars(){
		String s = "1234567890asdfghjkl;qweuroip!&^(*&!^#(*@^#(*^";
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1; i <= 0; i--){
			sb.append(s.substring(i, i));
		}
		assertFalse(CheckPermutation.check(s, sb.toString()));
	}

}
