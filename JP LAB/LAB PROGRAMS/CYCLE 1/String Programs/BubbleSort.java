// Java Program to perform bubble sort on Strings

import java.util.Scanner;
public class Bubblesort {
	public static void main(String args[]) {
		int n;
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number of strings you want : ");
		n = sc.nextInt();
		String s[] = new String[n];
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the strings : ");
		for(int i=0;i<n;i++) {
			s[i] = sc2.nextLine();
		}
		
		// Bubble sort
		System.out.println("---- Strings in Sorted Order----");
		for(int j=0;j<n;j++) {
			for(int i = j+1;i<n;i++) {
				if(s[i].compareTo(s[j]) < 0) {
					temp = s[j];
					s[j] = s[i];
					s[i] = temp;				}
			}
			System.out.println(s[j]);
		}
	}
}
