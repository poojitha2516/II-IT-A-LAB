// Exception Handling : try finally

class Excep2 {
	public static void main(String args[]) {
		try {
			int data = 5/0;
		}
		finally {
			System.out.println("Finally block is executed");
		}
	}
}
