// Java Program to Calculate Area and Circumference of Circle

import java.util.Scanner;
public class Areacircum {
	public static void main(String args[]) {
		double radius,area,circum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		radius = sc.nextDouble();
		area = Math.PI * radius * radius; // 3.14 * radius * radius
		circum = Math.PI * 2 * radius;  // 2 * 3.14 * radius
		System.out.println("Area of Circle : "+area);
		System.out.print("Circumference of Circle : "+circum);
	}
}
