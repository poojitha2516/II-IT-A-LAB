// Java Program to calculate simple interest

import java.util.Scanner;
public class Simpleinterest {
	public static void main(String[] args) {
		int p; // principal amount
		int t; // time 
		float r; // rate per annum
		double si; // simple interest
		Scanner sc = new Scanner(System.in);
		System.out.println("----Enter the values---");
		System.out.print("Enter the principal amount p: ");
		p = sc.nextInt();
		System.out.print("Enter the time t: ");
		t = sc.nextInt();
		System.out.print("Enter the rate per annum r: ");
		r = sc.nextFloat();
		si = (p * t * r) / 100;
		System.out.println("-----------------------------");
		System.out.println("The Simple Interest is : "+si);
		System.out.println("-----------------------------");
		 
	}
}
