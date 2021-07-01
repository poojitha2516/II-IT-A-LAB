// One Dimensional Array

import java.util.Scanner;
public class Array {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		n = sc.nextInt();
		
		//creates an array 
		int[] array = new int[20];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Array Elements are : ");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
	}
}
