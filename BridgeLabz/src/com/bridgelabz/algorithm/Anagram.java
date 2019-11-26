package com.bridgelabz.algorithm;

import java.util.ArrayList;

import com.bridgelabz.util.Util;

public class Anagram {
	
	private boolean checkAnagram(String first, String second) {
		if(first.length() != second.length()) {
			return false;
		}
		else {
			int length = first.length();
			ArrayList <String> arrayList = new ArrayList<String>();
			arrayList = new Util().checkPermutations(first, 0, length - 1);
			if(arrayList.contains(second)){
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("first string");
		String first = util.getString();
		System.out.println("second string");
		String second = util.getString();
		Anagram anagram = new Anagram();
		boolean test = anagram.checkAnagram(first,second);
		if(test){
			System.out.println("string is anagram");
		}
		else System.out.println("string is not anagram");
		
		

	}

	

}
