// Access modifiers : private

class A {
	private int i = 40;
	private void display() {
		System.out.println("Java");
	}
}

public class Simple {
	public static void main(String args[]) {
		A a = new A();
		System.out.println(a.i);   // Compile time error
		a.display();  // complie time error
	}
}
