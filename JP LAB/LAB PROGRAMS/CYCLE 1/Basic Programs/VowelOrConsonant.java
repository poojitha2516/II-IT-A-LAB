// Java Program to check whether input character is vowel or consonant

import java.util.Scanner;
public class Vowelconsonant {
	public static void main(String args[]) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		ch = sc.next().charAt(0);
		if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
			System.out.println(ch+" is a Vowel");
		}
		else {
			System.out.println(ch+" is a Consonant");
		}
	}
}
