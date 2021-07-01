// Interface 

interface Display {
	void print();
}

class Hello implements Display {
	public void print() {
		System.out.println("Hello World");
	}
	
	public static void main(String args[]) {
		Hello h = new Hello();
		h.print();
	}
}
