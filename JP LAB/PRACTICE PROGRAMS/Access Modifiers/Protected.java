// Access modifiers : Protected

class A1 {
	protected void show() {
		System.out.println("Protected method !");
	}
}

class Simple1 extends A1 {
	public static void main(String args[]) {
		Simple1 s = new Simple1();
		s.show();
	}
}
