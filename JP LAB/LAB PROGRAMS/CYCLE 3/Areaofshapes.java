/* Write a Java program to create an abstract class named Shape that contains two integers and an empty
method named print Area (). Provide three classes named Rectangle, Triangle, and Circle such that each
one of the classes extends the class Shape. Each one of the classes contains only the method print Area ()
that prints the area of the given shape. */

import java.util.*;

abstract class Shape {
	int length,breadth,radius;
	Scanner sc = new Scanner(System.in);
	abstract void printArea();
}

class Rectangle extends Shape {
	void printArea() {
		System.out.println("    Finding the Area of Rectangle    ");
		System.out.print("Enter length and breadth : ");
		length = sc.nextInt();
		breadth = sc.nextInt();
		System.out.println("Area of Rectangle : "+length*breadth);
		System.out.println(" ");
	}
}

class Triangle extends Shape {
	void printArea() {
		System.out.println("    Finding the Area of Triangle    ");
		System.out.print("Enter length and breadth : ");
		length = sc.nextInt();
		breadth = sc.nextInt();
		System.out.println("Area of Triangle : "+(length*breadth)/2);
		System.out.println(" ");
	}
}

class Circle extends Shape {
	void printArea() {
		System.out.println("    Finding the Area of Circle    ");
		System.out.print("Enter Radius : ");
		radius = sc.nextInt();
		System.out.println("Area of Circle : "+3.14f * radius * radius);
		System.out.println(" ");
	}
}

public class Areaofshapes {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		r.printArea();
		
		Triangle t = new Triangle();
		t.printArea();
		
		Circle c = new Circle();
		c.printArea();
	}
}
