package com.bridgelabz.algorithm;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.util.Util;



public class RegexFunction {
	
	static String convertString(UserData user,String msg) {
		String nameRegex = "<<name>>";
		String phoneRegex = "xxxxxxxxxx";
		String dateRegex = "01/01/2016";
		String fullNameRegex = "<<full name>>";
		
		Pattern pattern = Pattern.compile(nameRegex);
		Matcher matcher = pattern.matcher(msg); 
		msg = matcher.replaceAll(user.getName());
		
		pattern = Pattern.compile(phoneRegex);
		matcher = pattern.matcher(msg);
		msg = matcher.replaceAll(user.getPhoneno());

		pattern = Pattern.compile(fullNameRegex);
		matcher = pattern.matcher(msg); 
		msg = matcher.replaceAll(user.getFullName());
		
		pattern = Pattern.compile(dateRegex);
		matcher = pattern.matcher(msg);
		msg = matcher.replaceAll(user.getDate());
		return msg;

	}

	public static void main(String[] args) {
		UserData user = new UserData();
		Util util = new Util();
		System.out.println("Enter name");
		String name = util.getString();
		user.setName(name);
		System.out.println("Enter full name");
		String fullName = util.getString();
		user.setFullName(fullName);
		
		System.out.println("Enter Number");
		String num = util.getString();
		user.setPhoneno(num);
		
		System.out.println("Enter Date");
		String date = util.getString();
		user.setDate(date);

		String msg = "Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		msg=convertString(user, msg);
		System.out.println(msg);

	}

}
