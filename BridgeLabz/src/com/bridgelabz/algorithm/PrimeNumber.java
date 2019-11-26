package com.bridgelabz.algorithm;

import java.util.ArrayList;

import com.bridgelabz.util.Util;

public class PrimeNumber {
	
	
	private static void checkPalindrome(ArrayList<Integer> arrayList) {
		for(int i = 0; i < arrayList.size();i++){
			
			int value = arrayList.get(i);
			int reverse = reverseInt(value);
			if(value == reverse){
				System.out.println(value);
			}
		}
	}
	private static int reverseInt(int value) {
		int rev = 0;
		while(value > 0){
		rev = rev * 10 + value % 10;
		value /= 10;
			
		}
		return rev;
		
	}

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Lower bound");
		int lower = util.getInt();
		System.out.println("upper bound");
		int upper = util.getInt();
		ArrayList<Integer> arrayList = util.primeNumberInRange(lower, upper);
//		for(int i = 0 ; i < arrayList.size(); i++ ) {
//			System.out.println(arrayList.get(i));
//		}
		checkPalindrome(arrayList);
		

	}

	

}
