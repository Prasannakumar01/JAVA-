package javaprogramsexercise;

class Animal {
	public void eat() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Dog barks");
	}
}

class Cat extends Dog{
	public void meow() {
		System.out.println("cat meow's");
	}
}
public class Forest {

	public static void main(String[] args) {

		Cat c= new Cat();
		c.bark();
        c.eat();
        c.meow();
        
	}

}
