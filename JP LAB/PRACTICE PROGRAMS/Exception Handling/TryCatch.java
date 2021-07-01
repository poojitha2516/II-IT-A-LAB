// Exception Handling : try catch

class Excep1 {
	public static void main(String args[]) {
		try {
			int data = 5/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
