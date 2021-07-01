// Polymorphism : Runtime

class Cycle {
	void run() {
		System.out.println("Cycle is in Pink color");
	}
}

class Runtime extends Cycle {
	void run() {
		System.out.println("It is of Ladybird company");
	}
	
	public static void main(String args[]) {
		Cycle c = new Runtime();    //upcasting
		c.run();
	}
}
