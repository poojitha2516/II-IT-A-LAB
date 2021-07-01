//  Java Program to make a calculator using switch case

import java.util.Scanner;
public class Calculator {
	public static void main(String args[]) {
		double num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Two Numbers : ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.print("Enter an operator (+ , - , * , / , %) : ");
		char op = sc.next().charAt(0);
	    double result;
	    
	    switch(op) {
			case '+':
				result = num1 + num2;
				break;
			
			case '-':
				result = num1 - num2;
				break;
			
			case '*':
				result = num1 * num2;
				break;
				
			case '/':
				result = num1 / num2;
				break;
				
			case '%':
				result = num1 % num2;
				break;
				
			default:
				System.out.println("You have entered a wrong operator");
				return;
		}
		
		System.out.println(num1+" "+op+" "+num2+" : "+result);	
	}
}
