package com.bridgelabz.junit_jesting;

import com.bridgelabz.util.Util;

public class DecimalToBinary {

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter Decimal number");
		int num = util.getInt();
		int[] array=Util.decimalToBinary(num);
		for(int i:array)
		{
			System.out.print(i +" ");
		}
		

	}

}
