// Abstract class

abstract class Main {
	public void show() {
		System.out.println("This is Java Programming Language");
	}
}

class Language extends Main {
	public static void main(String args[]) {
		Language l = new Language();
		l.show();
	}
}
