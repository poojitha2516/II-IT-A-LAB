// Java Program to Convert char to String and String to Char
// Char to string :

import java.util.Scanner;
public class Chartostring {
	public static void main(String args[]) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		ch = sc.next().charAt(0);
		String s = String.valueOf(ch);
		System.out.print("Character to String : " +s);
	}
}
