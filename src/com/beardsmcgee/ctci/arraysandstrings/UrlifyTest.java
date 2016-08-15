package com.beardsmcgee.ctci.arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class UrlifyTest {

	@Test
	public void shouldAssertTrue() {
		
		assertTrue(Urlify.url("Mr John Smith ").equals("Mr%20John%20Smith"));
	}

}
