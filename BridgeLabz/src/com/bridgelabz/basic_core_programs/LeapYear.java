package com.bridgelabz.basic_core_programs;

import com.bridgelabz.util.Util;

public class LeapYear {
	
	public void checkLeapYear(int year) {
		
		boolean flag = false;
		if(year % 4 == 0){
			flag = checkYear(year);
		}
		else {
			flag = true;
		}
		if(flag){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("not leap year");
		}
	}
	static boolean checkYear(int year){
		if(year % 100 == 0) {
			if(year % 400 == 0){
				return true;
			}
			else return false;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		LeapYear leapYear = new LeapYear();
		System.out.println("Enter year");
		Util util=new Util();
		leapYear.checkLeapYear(util.getInt());

	}

}
