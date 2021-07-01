// Java Program to reverse an array

import java.util.Scanner;
public class Reversearray {
	public static void main(String args[]) {
		int i=0,j=0,temp,n;
		int num[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you want : ");
		n = sc.nextInt();
		
		System.out.println("Enter the numbers : ");
		for(i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		
		j = i-1;
		i = 0;
		while(i<j) {
			temp = num[i];
			num[i] = num[j];
			num[j] = temp;
			i++;
			j--;
		}
		System.out.print("Reversed Array : ");
		for(i=0;i<n;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
