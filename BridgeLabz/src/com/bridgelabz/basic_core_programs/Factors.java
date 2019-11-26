package com.bridgelabz.basic_core_programs;

import com.bridgelabz.util.Util;

public class Factors {
	
	private void findFactors(int num) {
		while(num % 2 == 0){
			System.out.print("2 ");
			num /= 2;
		}
		for(int i=3;i<=Math.sqrt(num);i+=2){
			checkNumDivisible(i, num);
		}
		if(num > 0){
			System.out.print(num + " ");
		}
	}
	
	private static void checkNumDivisible(int i,int num) {
		while(num%i==0){
			System.out.print(i+" ");
			num /= i;
		}
	}

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter number");
		int num = util.getInt();
		Factors factors = new Factors();
		factors.findFactors(num);

	}

}
