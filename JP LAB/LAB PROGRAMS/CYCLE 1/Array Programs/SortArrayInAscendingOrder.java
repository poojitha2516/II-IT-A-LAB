// Java Program to sort an array in ascending order

import java.util.Scanner;
public class Ascendingorder {
	public static void main(String args[]) {
		int n,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Numbers you want : ");
		n = sc.nextInt();
		int num[] = new int[n];
		
		System.out.println("Enter the numbers : ");
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(num[i] > num[j]) {
					temp  = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order : ");
		for(int i=0;i<n;i++) {
			System.out.print(num[i] + " ");
    	}
    	
	}
}
