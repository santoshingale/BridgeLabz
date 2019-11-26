package com.bridgelabz.basic_core_programs;

import com.bridgelabz.util.Util;

public class PowerOfTwo {
	public int getPower(int num) {
		int result = 1;
		while(num != 1){
			result = result * 2;
			num--;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Util util = new Util();
		int num = util.getInt();
		PowerOfTwo obj = new PowerOfTwo();
		System.out.println(obj.getPower(num));
		
	}

}
