package hello;

import java.lang.Math;
import java.util.Scanner;

public class hello {
	static int pv;
	static double fv;
	static final double interest = 0.05;
	static int interval;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Please enter your PV:");
		pv = sc.nextInt();
		System.out.print("Please enter you interval:");
		interval = sc.nextInt();
		
		fv = pv * Math.pow((1+interest), interval);
		System.out.println("My pv is " + pv + " and after " + interval + " year it would be " +fv);
		
		sc.close();
	}
}
