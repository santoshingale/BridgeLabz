package com.bridgelabz.junit_jesting;

import com.bridgelabz.util.Util;

public class MonthlyPayments {

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter principle");
		double principle = util.getDouble();
		System.out.println("Enter Year");
		double year = util.getDouble();
		System.out.println("Enter rate");
		double rate = util.getDouble();
		System.out.println(Util.monthlyPayment(principle, year, rate));
		

	}

}
