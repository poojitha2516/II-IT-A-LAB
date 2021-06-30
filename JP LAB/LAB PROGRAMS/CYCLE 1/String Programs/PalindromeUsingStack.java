// Java Program to check Palindrome String using Stack, Queue, For and While loop
// 1. Using Stack 

import java.util.Stack;
import java.util.Scanner;
public class Palindromeusingstack {
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		s = sc.nextLine();
		Stack stack = new Stack();
		
		for(int i=0;i<s.length();i++) {
			stack.push(s.charAt(i));
		}
		
		String rev = "";
		while(!stack.isEmpty()) {
			rev = rev + stack.pop();
	    }
	    
		if(s.equals(rev)) {
			System.out.println("It is a palindrome..");
		}
		else {
			System.out.println("It is not a palindrome..");
		}
		
		
	}
}

