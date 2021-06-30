//Java Program to check Leap Year

import java.util.Scanner;
public class Leapyear {
	public static void main(String args[]) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year : ");
		year = sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year+" is a Leap year");
		}
		else {
			System.out.println(year+" is not a Leap year");
		}
	}
}
