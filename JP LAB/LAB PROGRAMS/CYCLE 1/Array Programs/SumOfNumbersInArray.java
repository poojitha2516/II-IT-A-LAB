// Java Program to Add the elements of an Array

import java.util.Scanner;
public class Sumofnumbersinarray {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you want : ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		int sum = 0;
		
		System.out.println("Enter the Numbers : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of Numbers in the Array : "+sum);
		
	}
}
