// Java Program to find duplicate characters in a String

import java.util.Scanner;
public class Duplicatecharacters {
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		s = sc.nextLine();
		int count;
		
		//converting the string to character array
		char s1[] = s.toCharArray();
		System.out.println("Duplicate characters in the string : ");
		for(int i=0;i<s1.length;i++) {
			count = 1;
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i] == s1[j] && s1[i] != '\0') {
					count++;
					s1[j] = '0'; // To avoid visited character
				}
			}
			
			// character is duplicate if count > 1
			if(count>1 && s1[i] != '0') {
				System.out.println(s1[i]);
			}
		}
		
	}
}
