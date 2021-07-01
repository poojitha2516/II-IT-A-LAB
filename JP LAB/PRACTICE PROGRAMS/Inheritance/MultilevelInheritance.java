// Multilevel Inheritance

class Dog {
	void bark() {
		System.out.println("Dog is barking..");
	}
}

class Cat extends Dog{
	void sound() {
		System.out.println("Cat sounds meoww..");
	}
}

class Tiger extends Cat {
	void roar() {
		System.out.println("Tiger roars haaaawwww...");
	}
}

class Animal1 {
	public static void main(String args[]) {
		Tiger t = new Tiger();
		t.roar();
		t.sound();
		t.bark();
	}
}
