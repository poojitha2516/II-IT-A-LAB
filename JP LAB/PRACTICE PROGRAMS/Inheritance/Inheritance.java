// Inheritance 

class Dress {
	String color = "Blue";
}

class Inheritance extends Dress {
	int cost = 1500;
	public static void main(String args[]) {
		Inheritance i = new Inheritance();
		System.out.println("Dress color is: "+i.color);
		System.out.println("Dress cost is: "+i.cost);
		
	}
}
