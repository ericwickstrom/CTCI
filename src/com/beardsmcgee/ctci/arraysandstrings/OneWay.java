package com.beardsmcgee.ctci.arraysandstrings;

/*
 *  There are three types of edits that can be performed on strings: insert a character,
 *  remove a character, or replace a character. Given two strings, write a function to check if they are
 *  one edit (or zero edits) away. 
 */

public class OneWay {
	public static final boolean check(String a, String b){
		//each string should be same case
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		//Difference in string length can at most be one, or return false.
		if(Math.abs(a.length() - b.length()) > 1){
			return false;
		}
		//Iterate through smaller string
		if(a.length() > b.length()){
			return isOneEdit(b, a);
		}
		// either lengths are the same or a is smaller than b
		return isOneEdit(a, b);
	}
	
	private static final boolean isOneEdit(String a, String b){
		boolean edit = false;
		int x = 0; // counter for a
		int y = 0; // counter for b
		do {
			if(a.charAt(x) != b.charAt(y) && edit){
				return false;
			} else if(a.charAt(x) != b.charAt(y)){
				edit = true;
				if(a.charAt(x+1) != b.charAt(y+1)){
					y++;
				}
			}
			x++;
			y++;
		} while(x < a.length());
		return true;
	}
}
