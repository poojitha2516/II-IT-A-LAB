// Keywords : final
// final method

class Mom {
	final void show() {   //If you make any method as final, you cannot override it.
		System.out.println("My mom is smart");
	}
}

class Person2 extends Mom {
	void show() {
		System.out.println("This is 2nd person");
	}
	
	public static void main(String args[]) {
		Person2 p = new Person2();
		p.show();
	}
}
