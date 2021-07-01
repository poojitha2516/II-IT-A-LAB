//  Java Program to Calculate grades of Student

import java.util.Scanner;
public class Studentgrades {
	public static void main(String args[]) {
		int n;
		String name;
		int rollnum;
		int marks;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("How many Students : ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("------------------------------");
			System.out.println("Enter Student "+i+" Details");
			System.out.println("------------------------------");
			System.out.print("Name : ");
			name = sc2.nextLine();
			System.out.print("Roll Number: ");
			rollnum = sc.nextInt();
			System.out.print("Marks: ");
			marks = sc.nextInt();
			if(marks>100) {
				System.out.println("Enter Correct Marks !!");
			}
			else if(marks == 100) {
				System.out.println("Grade : O (PASS)");
			}
			else if (marks>=95 && marks < 100) {
				System.out.println("Grade : A+ (PASS)");
			}
		    else if (marks>=90 && marks < 95) {
				System.out.println("Grade : A (PASS)");
			}
			else if (marks>=80 && marks < 90) {
				System.out.println("Grade : B+ (PASS)");
			}
			else if (marks>=70 && marks < 80) {
				System.out.println("Grade : B (PASS)");
			}
			else if (marks>=60 && marks < 70) {
				System.out.println("Grade : C (PASS)");
			}
			else if (marks>=50 && marks < 60) {
				System.out.println("Grade : D (PASS)");
			}
			else {
				System.out.println("Grade : E (FAIL)");
			}
			
		}
		
	}
}
