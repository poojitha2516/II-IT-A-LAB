// Access modifiers : Public
// saved as A2.java

public class A2{
	public int data;  //public variable
	public void show() {  //public method
		System.out.println("I am human !!");
		System.out.println("I have "+data+" hands");
	}

}


// saved as Simple2.java

public class Simple2 {
	public static void main(String args[]) {
		A2 a2 = new A2();
		a2.data = 2;
		a2.show();
	}
}
