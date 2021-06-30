// Java Program to calculate compound interest

import java.util.Scanner;
public class Compoundinterest {
	public static void main(String args[]) {
		int p; //principal amount
		double r; // annual interest rate
		int t; //time 
		int n; //number of times
		double ci; // compound interest
		Scanner sc = new Scanner(System.in);
		System.out.println("---Enter the values----");
		System.out.print("Enter principal amount p : ");
		p = sc.nextInt();
		System.out.print("Enter annual interest rate r : ");
		r = sc.nextDouble();
		System.out.print("Enter the time t : ");
		t = sc.nextInt();
		System.out.print("Enter n : ");
		n = sc.nextInt();
		ci = p * (Math.pow((1+(r/n)),(n*t))) - p;
		System.out.println("-------------------------------");
		System.out.println("The compound interest is : "+ci);
		System.out.println("--------------------------------");
	}
}
