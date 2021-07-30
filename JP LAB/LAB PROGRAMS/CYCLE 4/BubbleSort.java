/* Write a Java program that implements Bubble sort algorithm for sorting in descending order and also
shows the number of interchanges occurred for the given set of integers.*/

import java.util.Scanner;
public class BubbleSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size,count = 0;
		System.out.print("How many Numbers you want to Sort : ");
		size = sc.nextInt();
		System.out.println(" ");
		
		int list[] = new int[size];
		System.out.println("Enter any "+size+ " Numbers : ");
		for(int i = 0;i<size;i++) {
			list[i] = sc.nextInt();
		}
		System.out.println(" ");
		
		int temp = 0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(list[j] < list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					count++;
				}
			}
		}
		System.out.println("Sorted in Descending Order : ");
		for(int x:list) {
			System.out.print(x+ " ");
		}
		System.out.println("\nTotal Number of Interchanges are: "+count);
	}
}
