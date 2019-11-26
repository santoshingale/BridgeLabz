package com.bridgelabz.functional_programs;

import com.bridgelabz.util.Util;

public class Triplets {
	static int [] array;
	
	public void findTriplets(){
		for(int i=0;i<array.length-2;i++) {
			loopOne(i);
			
		}
		
	}
	public static void loopOne(int i){
		for(int j =i+1;j<array.length-1;j++){
			loopSecond(i,j);
		}
	}
	
	public static void loopSecond(int i,int j){
		for(int k =j+1;j<array.length-2;j++){
			compare(i,j,k);
		}
	}
	public static void compare(int i,int j,int k){
		if(array[i] + array[j] + array[k] == 0){
			System.out.print(array[i]); 
            System.out.print(" "); 
            System.out.print(array[j]); 
            System.out.print(" "); 
            System.out.print(array[k]); 
            System.out.print("\n"); 
		}
	}
	
	
	public static void main(String[] args){
		Util util = new Util(); 
		System.out.println("Enter length of array element");
		int num = util.getInt();
		while(num < 3){
			System.out.println("Enter length of array element again");
			num = util.getInt();
		}
		array = util.getArray(num);
		Triplets triplets = new Triplets();
		triplets.findTriplets();
	}

}
