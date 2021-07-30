/* Write a Java program that implements Quick sort algorithm for sorting a list of names in ascending
Order.*/

import java.io.*;
public class QuickSortOnStrings {
	static String names[];
	public static void main(String args[]) throws IOException {
		QuickSortOnStrings qss = new QuickSortOnStrings();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many Strings You want to Sort : ");
		int size = Integer.parseInt(br.readLine());
		System.out.println(" ");
		System.out.println("Enter the Strings : ");
		String[] words = new String[size];
		for(int i=0;i<size;i++) {
			words[i] = br.readLine();
		}
		names = words;
		qss.quickSort(0,size-1);
		System.out.println(" ");
		System.out.println("Sorted Order : ");
		for(String i:words) {
			System.out.println(i);
		}
	}
	
	void quickSort(int lower,int upper) {
		int l = lower;
		int u = upper;
		String pivot = names[lower + (upper - lower)/2 ];
		while(l <= u) {
			while(names[l].compareToIgnoreCase(pivot) < 0) {
				l++;
			}
			while(names[u].compareToIgnoreCase(pivot) > 0) {
				u--;
			}
			
			if(l <= u) {
				swap(l,u);
				l++;
				u--;
			}
		}
		if(lower < u) {
			quickSort(lower,u);
		}
		if(l < upper) {
			quickSort(l,upper);
		}
	}
	
	void swap(int i,int j) {
		String temp = names[i];
		names[i] = names[j];
		names[j] = temp;
	}
}
