// Single Inheritance

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

class Animal {
	public static void main(String args[]) {
		Cat c = new Cat();
		c.sound();
		c.bark();
	}
}
