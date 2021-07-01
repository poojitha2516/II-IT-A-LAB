// Abstract methods 

abstract class C{
	abstract void makeProgram();
	
	public void run() {
		System.out.println("This is C Language");
	}
}

class Cpp extends C {
	public void makeProgram() {
		System.out.println("This is C++ Language");
	}
}

class Language1 {
	public static void main(String srgs[]) {
		Cpp c1 = new Cpp();
		
		c1.makeProgram();
		c1.run();
		
	}
}

