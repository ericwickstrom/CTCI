package com.beardsmcgee.ctci.arraysandstrings;

import java.util.HashMap;
import java.util.Set;

/*
 * Easy solution, using Java libraries.
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words. 
 */
public class PalindromePermutation {
	public static boolean check(String s){
		//Strip white spaces, convert alpha characters to lowercase
		//for comparing.
		s = s.replaceAll("\\s", "").toLowerCase();
		// whether it is true that string length is even
		boolean allEven = (s.length() % 2 == 0);
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				int count = map.get(c);
				map.put(c, ++count);
			} else {
				map.put(c, 1);
			}
		}
		//if string length is even, total count of any character must be
		//divisible by 2
		Set<Character> keys = map.keySet();
		if(allEven){
			for(Character key : keys){
				if(map.get(key) % 2 != 0){
					return false;
				}
			}
		} else {
			// if string length is odd, only one character can
			// have an odd number of itself in the string
			int count = 0;
			for(Character key : keys){
				if(map.get(key) % 2 != 0){
					count++;
				}
				if(count > 1){
					return false;
				}
			}
		}
		return true;
	}
}
