package com.bridgelabz.functional_programs;

import java.io.PrintWriter;

import com.bridgelabz.util.Util;

public class Array {
	
	private int[][] setIntArray(int n,int m) {
		System.out.println("Enter int array data");
		int intArray[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			getRowInt(i,m,intArray);
		}
		return intArray;
	}
	private double[][] setDoubleArray(int n,int m) {
		double doubleArray[][]=new double[n][m];
		System.out.println("Enter Double array data");
		for(int i=0;i<n;i++) {
			for(int j = 0;j< m;j++) {
				Util util = new Util();
				System.out.println("Enter locations a["+i+"]["+j+"]");
				doubleArray[i][j] = util.getDouble();
			}
		}
		return doubleArray;
	}
	public void display(int[][]a,double[][]b,boolean[][]c,int m,int n){
		PrintWriter pw=new PrintWriter(System.out,true);
		System.out.println();
		pw.println("2D ARRAY INTEGER");
		for(int i = 0; i<m; i++){
			for (int j = 0; j<n; j++){
				pw.print("\t" + a[i][j] + " ");
			} 
			pw.println("\t");
		}
	 
	 
	
		System.out.println();
		pw.println("2D ARRAY DOUBLE");
		
		for(int i = 0; i<m; i++){
			for (int j = 0; j<n; j++){
				pw.print("\t"+b[i][j]+" ");
			} 
			pw.println("\t");
		}
		 
		System.out.println();
		pw.println("2D ARRAY BOOLEAN");
				
		for(int i = 0; i<m; i++){
			for (int j = 0; j<n; j++){
				pw.print("\t"+c[i][j]+" ");
			} 
		pw.println("\t");
		}
	}
	
	private boolean[][] setBooleanArray(int n,int m) {
		boolean booleanArray[][] = new boolean[n][m];
		System.out.println("Enter Boolean array data");
		for(int i=0;i<n;i++) {
			for(int j = 0;j< m;j++) {
				Util util=new Util();
				System.out.println("Enter locations a["+i+"]["+j+"]");
				booleanArray[i][j] = util.getBoolean();
			}
		}
		return booleanArray;
		
	}
	
	private static void getRowInt(int i,int m,int intArray[][]){
		for(int j=0;j<m;j++){
			System.out.println("Enter locations a["+i+"]["+j+"]");
			intArray[i][j] = new Util().getInt();
		}

		
		
	}

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter N");
		int n = util.getInt();
		System.out.println("Enter M");
		int m = util.getInt();
		Array array = new Array();
		int [][] intArray = array.setIntArray(n,m);
		double[][] doubleArray = array.setDoubleArray(n,m);
		boolean [][]booleanArray = array.setBooleanArray(n,m);
		array.display(intArray, doubleArray, booleanArray, m, n);
		
	}

	

}
