// Exception Hnadling : Multiple catch

class Numbers {
	public int[] arr = new int[10];
	public void writeNum() {
		try {
			arr[10] = 11;
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
		catch (IndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
	}
}

class Excep3 {
	public static void main(String args[]) {
		Numbers num = new Numbers();
		num.writeNum();
	}
}
