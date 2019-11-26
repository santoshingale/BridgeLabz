package com.bridgelabz.logical_programs;

import java.util.Arrays;

import com.bridgelabz.util.Util;

public class TicTacToe {
	static String b[];
	static String turn;
	
	private static void emptyBoard() {
		for(int i=0;i<9;i++) {
			b[i]=String.valueOf(i + 1);
		}
		
	}
	private static void printBoard() {
		System.out.println(b[0]+"  "+b[1]+"  "+b[2]);
		System.out.println(b[3]+"  "+b[4]+"  "+b[5]);
		System.out.println(b[6]+"  "+b[7]+"  "+b[8]);
		
	}
	private static String checkWinner() {
		// TODO Auto-generated method stub
		String line = null;
		for(int i=1;i<=8;i++){
			switch(i){
				case 1:
					line = b[0] + b[1] + b[2];
					break;
				case 2:
					line = b[3] + b[4] + b[5];
					break;
				case 3:
					line = b[6] + b[7] + b[8];
					break;
				case 4:
					line = b[0] + b[3] + b[6];
					break;
				case 5:
					line = b[1] + b[4] + b[7];
					break;
				case 6:
					line = b[2] + b[5] + b[8];
					break;
				case 7:
					line = b[0] + b[4] + b[8];
					break;
				case 8:
					line= b[2] + b[4] + b[6];
					break;

			}
			if(line.equals("xxx")){
				return "x";
			}
			else if(line.equals("ooo")){
				return "O";
			}
			
		}
		for(int i=1;i<=9;i++){
			if(Arrays.asList(b).contains(String.valueOf(i))){
				break;
			}
			if(i == 9){
				return "draw";
			}
		}
		System.out.println(turn+"'s turn");
		return null;
	}
	

	public static void main(String[] args) {
		String winner = null;
		turn = "x";
		b = new String[9];
		emptyBoard();
		printBoard();
		System.out.println(turn+"'s turn");
		Util util = new Util();
		while(winner == null){
			int num = 10;
			try{
				num = util.getInt();
				if(num < 0 && num > 9){
					System.out.println("invalid number pls try again");
					printBoard();
					continue;
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			if(b[num - 1].equals(String.valueOf(num))){
				b[num - 1] = turn;
				if(turn.equals("x")){
					turn = "o";
				}
				else{
					turn = "x";
				}
				winner = checkWinner();
				printBoard();
				
			}
			else {
				System.out.println("slot is already taken pls enter another one");
				printBoard();
				continue;
			}
			
		}
		if(winner.equals("draw")){
			System.out.println("match is draw");
		}
		else {
			System.out.println("winner is "+ winner);
		}
	}


	

}
