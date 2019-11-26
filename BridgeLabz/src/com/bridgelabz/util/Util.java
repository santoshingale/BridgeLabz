package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Scanner;



public class Util {
	static ArrayList<String> arrayList = new ArrayList<>();
	/****************** UserNameReplacer Program *************************/
	/**
	* @param  santoshingale
	* @return checking Length of UserName       
	*/
	
	
	/******************    Return String          *************************/
	static Scanner scanner;
	public String getString(){
		String string;
		scanner = new Scanner(System.in);
		{
			string = scanner.nextLine();
		}
		return string;
	}
	/******************    Return Integer          *************************/
	public int getInt()
	{
		int number;
		scanner = new Scanner(System.in);
		{
			number = scanner.nextInt();
		}
		return number;
		
	}
	
	/******************    Return Double          *************************/
	public double getDouble()
	{
		double number;
		scanner = new Scanner(System.in);
		{
			number = scanner.nextDouble();
		}
		return number;
		
	}
	
	/******************    Return Boolean          *************************/

	public boolean getBoolean() {
		boolean value;
		scanner=new Scanner(System.in);
		{
			value = scanner.nextBoolean();
		}
		return value;
	}
	/******************    Return Integer Array          *************************/
	public int[] getArray(int num)
	{
		int []array = new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter value of :"+ i +"th Element");
			array[i] = getInt();
		}
		return array;
	}
	
	/******************    Return day of the date           *************************/
	public int dayOfWeek(int date,int month, int year) {	
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (date + x + (31 * m0) / 12) % 7;
		return d0;
	}
	
	/******************    Return array of binary data           *************************/
	
	public static int[] decimalToBinary(int num) {
		int i = 0;
		int []array = new int[20];
		while(num > 0){
			array[i] = num % 2;
			num /= 2;
			i++;
		}
		int []newArray = new int[i];
		int k = 0;
		for(int j=i-1;j>=0;j--){
			newArray[k++] = array[j];
			
		}
		return newArray;
		
	}
	
	/******************    Swap string           *************************/
	public static String swap(String string, int l, int r) {
		char[] c = string.toCharArray();
		char temp = c[l];
		c[l] = c[r];
		c[r] = temp;
		return String.valueOf(c);
	}
	/******************    convert temperature           *************************/
	public static int temperaturConversion(int temperatur,char t)
	{
		int convert;
		if(t == 'C' || t == 'c'){
			convert = (temperatur * 9 / 5) + 32;
		}
		else if(t == 'f' || t =='F'){
			convert = (temperatur - 32) * 5 / 9;
		}
		else {
			System.out.println("wrong input");
			return 0;
		}
		return convert;
	}
	/******************    Swap string           *************************/
	public static double monthlyPayment(double p, double y, double r) {
		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
	}
	/******************    InsertionSort          *************************/
	public int[] insertionSort(int[] array) {
		for(int i=1;i<array.length;i++){
			int key=array[i];
			int j = i - 1;
			while(j >= 0 && key < array[j]){
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
		return array;
		
	}
	
	/******************    BubbleSort          *************************/
	public int[] bubbleSort(int[] array) {
		for(int i = 0;i < array.length;i++)
		{
			for(int j = 0;j < array.length - i - 1;j++)
			{
				if(array[j] > array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	
	public int[] mergeSort(int[] array, int l, int r) {
		if(l<r){
		int m=( l + r ) / 2;
		mergeSort(array, l, m);
		mergeSort(array, m + 1, r);
		merge(array,l,m,r);
		}
		return array;
	}

	private void merge(int[] arr, int l, int m, int r) {
		int leftsize = m - l + 1;
		int rightsize = r - m;
		int left[] = new int[leftsize];
		int right[] = new int[rightsize];
		for(int i = 0;i < leftsize;i++){
			left[i] = arr[l + i];
		}
		for(int i = 0;i < rightsize;i++){
			right[i] = arr[ m + 1 + i];
		}
		int i = 0,j = 0,k = l;
		while(i < leftsize && j < rightsize) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			}
			else {
				arr[k] = right[j];
				j++;
				k++;	
			}
		}
		while(i < leftsize){
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < rightsize){
			arr[k] = right[j];
			j++;
			k++;
		}
		
	}
	
	public ArrayList<String> checkPermutations(String string,int l,int r) {
		if(l == r){
			if(!arrayList.contains(string)){
				arrayList.add(string);
			}
		}
		else {
			for(int i=l;i<=r;i++) {
				string = Util.swap(string,l,i);
				arrayList = checkPermutations(string,l+1,r);
				string = Util.swap(string,l,i);
			}
		}
		return arrayList;
	}
	public ArrayList<Integer> primeNumberInRange(int low,int high)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
		int flag = 1;
		for (int i = low; i <= high; i++) { 
            if (i == 1 || i == 0) {
                continue; 
                }
	        flag = 1; 
	        for (int j = 2; j <= i / 2; j++) { 
	            if (i % j == 0) { 
	                flag = 0; 
	                break; 
	            } 
	        } 
	        if (flag == 1) { 
	           arrayList.add(i); 
	        } 
		}
		return arrayList;
	}
}
