// Java Program to calculate power of a number

import java.util.Scanner;
public class Power {
	public static void main(String args[]) {
		int a,b,result=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		a = sc.nextInt();
		System.out.print("How many times u want to multiply : ");
		b = sc.nextInt();
		for(int i=1;i<=b;i++) {
			result *= a;
		}
		System.out.println(a+" to the power of "+b+" is : "+result);
		
	}
}
