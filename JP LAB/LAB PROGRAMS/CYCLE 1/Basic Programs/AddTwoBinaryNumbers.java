// Java Program to add two binary numbers

import java.util.Scanner;
public class Addbinary {
	public static void main(String args[]) {
		long bin1,bin2;
		int i = 0, temp = 0;
		int[] sum = new int[10]; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 Binary Numbers : ");
		bin1 = sc.nextLong();
		bin2 = sc.nextLong();
		while(bin1 != 0 || bin2 != 0) {
			sum[i++] = (int)((bin1 % 10 + bin2 % 10 + temp) % 2);
			temp = (int)((bin1 % 10 + bin2 % 10 + temp) / 2);
			bin1 = bin1 / 10;
			bin2 = bin2 / 10;
			
		}
		if(temp != 0) {
			sum[i++] = temp;
		}
		--i;
		System.out.print("Sum : ");
		while(i>=0) {
			System.out.print(sum[i--]);
		}
	}
}
