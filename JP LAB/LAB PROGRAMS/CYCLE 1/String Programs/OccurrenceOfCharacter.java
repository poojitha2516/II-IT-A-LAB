// Java program to find occurrence of a character in a String

import java.util.Scanner;
public class Occurrenceofcharactersinstring {
	static void countchar(String s) {
		int count[] = new int[256];  // ASCII values upto 256
		int len = s.length();
		for(int i=0;i<len;i++) {
			count[s.charAt(i)]++;
		}
		char arr[] = new char[len];
		for(int i=0;i<len;i++) {
			arr[i] = s.charAt(i);
			int temp = 0;
			for(int j=0;j<=i;j++) {
				if(s.charAt(i) == arr[j]) {
					temp++;
				}
			}
			if(temp == 1) {
				System.out.println("Occurrence of "+s.charAt(i)+" in the string is: "+count[s.charAt(i)]);
			}
		}
	}
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		s = sc.nextLine();
		countchar(s);
		
	}
}
