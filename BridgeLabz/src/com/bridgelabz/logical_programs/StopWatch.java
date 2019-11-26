package com.bridgelabz.logical_programs;

import com.bridgelabz.util.Util;
public class StopWatch {
	
	public static long stop() {
		long stopTime = System.currentTimeMillis();
		return stopTime;
	}
	private static long start() {
		long startTime = System.currentTimeMillis();
		return startTime;
	}
	private static long getTimeTaken(long startTime,long stopTime) {
		long timeTaken = stopTime - startTime;
		return timeTaken;
	}

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Press ENTER to start");
		String start = util.getString();
		long startTime = start();
		System.out.println("Press ENTER to stop");
		String stop = util.getString();
		long stopTime = stop();
		long timeTaken = getTimeTaken( startTime,stopTime);
		System.out.println(timeTaken / 1000 + "'s");

	}

}
