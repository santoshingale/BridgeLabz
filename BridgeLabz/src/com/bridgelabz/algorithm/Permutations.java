package com.bridgelabz.algorithm;

import java.util.ArrayList;

import com.bridgelabz.util.Util;



public class Permutations {
	static ArrayList<String> arrayList = new ArrayList<>();
	public static void main(String[] args) {
		System.out.println("Enter string");
		Util util = new Util();
		String string = util.getString();
		int l=string.length();
		arrayList = util.checkPermutations(string,0,l - 1);
		for(int i = 0; i < arrayList.size(); i++) {   
		    System.out.println(arrayList.get(i));
		}

	}

}
