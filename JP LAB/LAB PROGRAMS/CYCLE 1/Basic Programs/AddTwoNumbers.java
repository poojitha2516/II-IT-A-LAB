// Java Program to Add two Numbers

import java.util.Scanner;
public class Add {
	public static void main(String args[]) {
		int a,b,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a + b;
		System.out.println("The sum of "+a+" and " +b+ "is : " +sum);
		
	}
}
