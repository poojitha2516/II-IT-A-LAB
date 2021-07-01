// Multi Dimensional Array

import java.util.Scanner;
public class Array1 {
	public static void main(String args[]) {
		int m,n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		m = sc.nextInt();
		System.out.println("Enter number of colomns : ");
		n = sc.nextInt();
		
		//Declaring Multi-dimensinal array
		int array[][] = new int[m][n];
		
		System.out.println("Enter the elements : ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The elememts of the array are : ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	} 
}
