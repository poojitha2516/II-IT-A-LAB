// Java Program to Multiply two Numbers

import java.util.Scanner;
public class Product {
	public static void main(String args[]) {
		int a,b,product;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		product = a * b;
		System.out.println("The Product of "+a+"and"+b+"is : "+product);
		
	}
}
