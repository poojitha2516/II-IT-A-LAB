// Method Overloading

class Add {
	static int add(int a,int b) {
		return a+ b;
	}
	static int add(int a,int b,int c) {
		return a + b + c;
	}
}

public class Sum {
	public static void main(String args[]) {
		System.out.println(Add.add(20,20));
		System.out.println(Add.add(20,20,20));
		
	}
}
