package com.bridgelabz.algorithm;

import java.util.Arrays;

import com.bridgelabz.util.Util;

public class MergeSort {

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter array length");
		int length = util.getInt();
		int []array = util.getArray(length);
		array = util.mergeSort(array,0,length-1);
		System.out.println(Arrays.toString(array));

	}

}
