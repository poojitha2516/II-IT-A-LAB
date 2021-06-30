// Java Program to Check Even or Odd Number

import java.util.Scanner;
public class Evenodd {
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num+" is a Even Number");
		}
		else {
			System.out.println(num+" is a Odd Number");
		}
	}
}
