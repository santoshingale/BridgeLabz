package com.bridgelabz.junit_jesting;

import com.bridgelabz.util.Util;

public class VendingMachine {
	static final int note[]= {2000,1000,500,200,100,50,20,10,5,2,1};
	static int count;

	private static int count(int amount) {
		int noteCount[] = new int[note.length];
		for(int i=0;i<note.length;i++){
			if(amount >= note[i]){
				noteCount[i] = amount / note[i];
				amount = amount % note[i];
			}
		}
			
		
		for(int i=0;i<note.length;i++) {
			System.out.println(note[i] + "  " +noteCount[i]);
		}
		return count;
	}
	
	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter number");
		int amount = util.getInt();
		count(amount);

	}

}
