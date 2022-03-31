package com.jr.flowcharts.app;
import com.jr.flowcharts.utility.Utility;
import com.jr.flowchart.scan.Scan;
public class Application {
	
	public static void main(String[] Args) {
		System.out.println("Flowcharts application");
		Utility newUtil = new Utility();
		newUtil.run();
		Scan.closeScan();
		
	}

}
