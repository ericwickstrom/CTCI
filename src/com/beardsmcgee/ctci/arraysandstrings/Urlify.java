package com.beardsmcgee.ctci.arraysandstrings;

public class Urlify {
	public static String url(String s){
		s = s.trim();
		StringBuilder sb = new StringBuilder();
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++){
			if(String.valueOf(c[i]).equals(" ")){
				sb.append("%20");
			} else {
				sb.append(c[i]);
			}
		}
		return sb.toString();
	}
}
