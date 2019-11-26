package com.bridgelabz.basic_core_programs;

import java.util.Random;
import com.bridgelabz.util.Util;

public class FlipCoin {
	
public void getResult(int num){
		float sum = 0;
		Random random=new Random();
		
		for(int i=1;i<=num;i++){
		sum=(float) (sum + random.nextFloat());	
		}
		sum=sum / num;
		float tails = sum * 100;
		if(sum < 50){
			System.out.println("tails chances:  "+tails);
			System.out.println("Head chances :  "+(100 - tails));
		}
		else {
		System.out.println("tails chances:  "+ tails);
		System.out.println("Head chances :  "+ (100 - tails));
		}
			
	}

	public static void main(String[] args) {
		System.out.println("Enter the num");
		Util util = new Util();
		int num = util.getInt();
		FlipCoin flipCoin = new FlipCoin();
		flipCoin.getResult(num);
	
		}
}
