// Java Program to Calculate average of numbers using Array

import java.util.Scanner;
public class Averageofnumbers {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you want : ");
		n = sc.nextInt();
		
		double[] arr = new double[n];
		double total = 0;
		
		System.out.print("Enter the numbers : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextDouble();
		}
		
		for(int i=0;i<arr.length;i++) {
			total = total + arr[i];
		}
		
		double avg = total / arr.length;
		System.out.println("The Average of Numbers is : "+avg);
	}
}
