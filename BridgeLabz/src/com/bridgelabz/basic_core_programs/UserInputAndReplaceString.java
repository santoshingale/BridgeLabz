package com.bridgelabz.basic_core_programs;

import com.bridgelabz.util.Util;

public class UserInputAndReplaceString {
	public static void main(String[] args) {
		
		Util util=new Util();
		System.out.println("Enter UserName");
		String userName=util.getString();
		while(userName.length() < 3){
			System.out.println("Enter UserName");
			userName=util.getString();
		}
		String template = "Hello <<UserName>>, How are you?";
		template = template.replace("<<UserName>>", userName);
		System.out.println(template);

	}

}
