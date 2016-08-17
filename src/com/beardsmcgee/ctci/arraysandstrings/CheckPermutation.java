package com.beardsmcgee.ctci.arraysandstrings;


import java.util.HashMap;

/*
 * Check Permutation: Given two strings, write a method to 
 * decide if one is a permutation of the other.
 * Easy solution, using Java data structures and functions. 
 */

public class CheckPermutation {
	public static final boolean check(String a, String b){
		// if strings are not the same length, can't be permutations
		if(a.length() != b.length()){
			return false;
		}
		a = a.toLowerCase();
		b = b.toLowerCase();
		// if both strings are the same, return true
		if(a.equals(b)){
			return true;
		}
		/*
		 * Two hash maps, one for each string.
		 * Key is character and value is count of those characters.
		 * Iterate through both strings and put contents in to map.
		 * Finally compare equality between both maps.  If maps equal, then
		 * strings are permutations.
		 */
			
		HashMap<String, Integer> mapA = getMap(a);
		HashMap<String, Integer> mapB = getMap(b);
		if(mapA.equals(mapB)){
			return true;
		} else {
			return false;
		}
	}
		private static HashMap<String, Integer> getMap(String string){
			HashMap<String, Integer> rMap = new HashMap<>();
			for(int i = 0; i < string.length(); i++){
				String s = string.substring(i, i);
				if(!rMap.containsKey(s)){
					rMap.put(s, 0);
				} else {
					int count = rMap.get(s);
					rMap.put(s, ++count);
				}
			}
			return rMap;
		}
}
