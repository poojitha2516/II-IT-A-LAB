// Java program to count vowels and consonants in a String

import java.util.Scanner;
public class Vowelsandconsonants {
	public static void main(String args[]) {
		String s;
		int v=0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		s = sc.nextLine();
		//converting to lowercase
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				v++;
			}
			else {
				c++;
			}
			
		}
		System.out.println("Numbers of Vowels : "+v);
		System.out.println("Numbers of Consonants : "+c);
		
	}
}
