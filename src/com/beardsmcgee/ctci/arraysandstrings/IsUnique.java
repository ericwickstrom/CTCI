package com.beardsmcgee.ctci.arraysandstrings;

/*
 * CTCI, arrays & strings
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

public class IsUnique {

	public static final boolean checkUnique(String s){
		if(s.equals("") || s.equals(null)){
			throw new IllegalArgumentException();
		}
		char[] letters = s.toLowerCase().toCharArray();
		int size = letters.length;
		int current = 0;
		
		/*
		 * Unique is set to true by default.
		 * Loops check each subsequent character against
		 * the "current" index.  If a match is found, unique
		 * is set to false and i is set to size in order to stop
		 * the loop.
		 */
		boolean unique = true;
		while(current < size){
			for(int i = current + 1; i < size; i++){
					if(letters[current] == letters[i]){
						unique = false;
						i = size;
				}
			}
			current++;
		}
		
		return unique;
	}
}
