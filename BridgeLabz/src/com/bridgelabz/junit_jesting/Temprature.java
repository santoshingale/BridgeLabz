package com.bridgelabz.junit_jesting;

import java.util.Scanner;

import com.bridgelabz.util.Util;

public class Temprature {

	public static void main(String[] args) {
		try {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter temp in c or f");
			int temp = Util.temperaturConversion(scanner.nextInt(), scanner.next().charAt(0));
			System.out.println(temp);
		}
		catch(Exception e){
			System.out.println("enter in format '40 c' ");
		}
		

	}

}
