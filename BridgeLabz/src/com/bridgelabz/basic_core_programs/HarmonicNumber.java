package com.bridgelabz.basic_core_programs;

import com.bridgelabz.util.Util;

public class HarmonicNumber {
	
	private  void checkHarmonic(int num2) {
		double harmonic=1.0;
		for(int i=2;i<=num2;i++){
			harmonic += (float)1 / i;
		}
		System.out.println(harmonic);
		
	}

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter number");
		int num = util.getInt();
		HarmonicNumber harmonicNumber = new HarmonicNumber();
		harmonicNumber.checkHarmonic(num);
		
	}
		

}


