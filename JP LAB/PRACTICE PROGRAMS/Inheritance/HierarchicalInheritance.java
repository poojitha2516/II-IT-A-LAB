// Hierarchical Inheritance


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

class Tiger extends Dog {
	void roar() {
		System.out.println("Tiger roars haaaawwww...");
	}
}

class Animal2 {
	public static void main(String args[]) {
		Tiger t = new Tiger();
		t.roar();
		t.bark();
	}
}
