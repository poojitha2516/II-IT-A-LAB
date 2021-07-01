// Java Program to sort strings in alphabetical order

import java.util.Scanner;
public class Stringssort {
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
		
		// Sorting the strings
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(s[i].compareTo(s[j])>0) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		
		System.out.println("---- Strings in Alphabetical Order----");
		for(int i=0;i<=n-1;i++) {
			System.out.println(s[i]);
		}
		
	}
}
