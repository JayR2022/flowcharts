package com.jr.flowchart.scan;

import java.util.Scanner;

public class Scan {
	
	private static Scanner scanInput = new Scanner(System.in);
	
	public Scan() {
		// Default constructor
		
	}
	
	public static void closeScan() {
		scanInput.close();
	}
	
	public static int scanInt() {
		return scanInput.nextInt();
	}
	
	public static boolean scanBool() {
		return scanInput.nextBoolean();
	}
	


}
