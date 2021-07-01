// Keywords : final
// final method
// final method is inherited but you cannot override it.

class Mam {
	final void show() {
		System.out.println("She is Maths mam");
	}
}

class Person3 extends Mam {
	public static void main(String args[]) {
		new Person3().show();
	}
}
