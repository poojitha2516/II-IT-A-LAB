// Java Program to check Palindrome String using Stack, Queue, For and While loop
// 2. Using Queue

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Palindromeusingqueue {
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		s = sc.nextLine();
		Queue queue = new LinkedList();
		
		for(int i=s.length()-1;i>=0;i--) {
			queue.add(s.charAt(i));
		}
		
		String rev = "";
		
		while(!queue.isEmpty()) {
			rev = rev + queue.remove();
		}
		
		if(s.equals(rev)) {
			System.out.println("It is a palindrome..");
		}
		else {
			System.out.println("It is not a palindrome..");
		}
	}
}
