package com.jr.flowcharts.utility;
import com.jr.flowchart.service.Service;
import com.jr.flowchart.scan.Scan;

public class Utility {
	
	public void run() {
		Service serv = new Service();
		System.out.println("Result: "+actions(serv));
		
		
		
	}
	
	public int actions(Service serv) {
		System.out.println("Enter 3 values: Number1 , Number2, (true or false)");
		return serv.logicMethod(Scan.scanInt(),Scan.scanInt(),Scan.scanBool());
	}
	

}
