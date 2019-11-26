package com.bridgelabz.logical_programs;

import com.bridgelabz.util.Util;

public class Gambler {
	
	void gamblerLogic(int cash,int goal,int trials) {
		int bets = 0;
		while ((cash > 0) && (cash < goal && trials > bets)) {
            bets++;
            if (Math.random() < 0.5) {
                cash += 5; 
            }
            else {    
                cash -= 5; 
            }
            if(cash >= goal){
            	System.out.println("you achive goal" + cash);
            	break;
            } 
            else if(bets == trials) {
            	System.out.println("You lost");
            }
        }
		
	}
	

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("enter cash");
        int cash = util.getInt(); 
        System.out.println("enter goal");
        int goal = util.getInt(); 
        System.out.println("trails");
        int trials = util.getInt(); 
        Gambler gambler = new Gambler();
        gambler.gamblerLogic(cash, goal, trials);

	}

}
