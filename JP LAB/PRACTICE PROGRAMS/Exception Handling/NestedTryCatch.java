// Exception handling : nested try catch

class Excep5 {
	public static void main(String args[]) {
		try {
			try{
				System.out.println("Trying to divide by zero !!");
				int b = 10 / 0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
			try {
				int a[] = new int[5];
				a[5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		
		catch(Exception e) {
			System.out.println("handled......");
		}
	}
}
