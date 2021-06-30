// Java Program to read number from Standard Input

import java.util.Scanner;
public class Read {
	public static void main(String args[]) {
		int num1;
		float num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Integer : ");
		num1 = sc.nextInt();
		System.out.print("Enter any Decimal number : ");
		num2 = sc.nextFloat();
		System.out.print("The numbers are : "+num1+","+num2);
		
	}
}
