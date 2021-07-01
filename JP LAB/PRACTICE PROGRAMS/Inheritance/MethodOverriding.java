//Method Overriding

class Bike {
	void petrol() {
		System.out.println("Bike has enough petrol");
	}
}

class Vechile extends Bike {
	void petrol() {
		System.out.println("This vechile dont have petrol");
	}
	
	public static void main(String args[]) {
		Vechile v = new Vechile();
		v.petrol();
	}
}
