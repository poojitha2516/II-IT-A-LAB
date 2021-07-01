// Keyword : final
//final variable

class Person1 {
	final int age = 51; // final variable
	void show() {
		age = 90;  //  final variable once assigned a value can never be changed.
	}
	
	public static void main(String args[]) {
		Person1 per = new Person1();
		per.show();
	}
}
