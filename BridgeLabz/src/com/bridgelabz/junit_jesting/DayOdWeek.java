package com.bridgelabz.junit_jesting;

import com.bridgelabz.util.Util;

public class DayOdWeek {
	static String[] days = {"Sunday","Monday","tuesday","Thursday","Friday","Saturday"};
	
	

	public static void main(String[] args) {
		
		Util util = new Util();
		System.out.println("Enter date:");
		int date = util.getInt();
		System.out.println("Enter monrh:");
		int month = util.getInt();
		System.out.println("Enter year:");
		int year = util.getInt();
		int dayValue = util.dayOfWeek(date, month, year);
		System.out.println(days[dayValue]);

	}

}
