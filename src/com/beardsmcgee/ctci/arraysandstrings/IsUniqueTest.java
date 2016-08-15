package com.beardsmcgee.ctci.arraysandstrings;

import static org.junit.Assert.*;


import org.junit.Test;

public class IsUniqueTest {

	@Test(expected = IllegalArgumentException.class)
	public void shouldFireExceptionForNull() {
		IsUnique.checkUnique("");
	}
	
	@Test
	public void firstShouldAssertTrue(){
		assertTrue(IsUnique.checkUnique("first"));
	}
	
	@Test
	public void aabcdefghShouldAssertFalse(){
		assertFalse(IsUnique.checkUnique("aabcdefghijklmnop"));
	}
	
}
