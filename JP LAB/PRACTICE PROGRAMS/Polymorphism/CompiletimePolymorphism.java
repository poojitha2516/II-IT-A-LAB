// Polymorphism : Complie Time 

class Calculator {
	int add(int a,int b) {
		return a + b;
	}
	int add(int a,int b,int c) {
		return a + b + c;
	}
}

public class Compiletime {
	public static void main(String args[]) {
		Calculator c = new Calculator();
		System.out.println(c.add(20,60));
	    System.out.println(c.add(10,15,33));

	}
}
