//Keyword : super

class Teacher {
	void subject() {
		System.out.println("This is OS");
	}
}

class Professor extends Teacher {
	void subject() {
		System.out.println("This is DBMS");
	}
	
	void show() {
		subject();        //will call current class 
		super.subject();  //will call parent class
	}
}

class Person {
	public static void main(String args[]) {
		Professor p = new Professor();
		p.show();
	}
}
