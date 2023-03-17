package javaprogramsexercise;
//
class Animal1 {
	public void eat() {
		System.out.println("Animal eats");
	}
}

class Cat1 extends Animal1{
	public void meow(){
		System.out.println("Cat meows");
	}
}

	class Dog1 extends Animal1{
	public void barks() {
		System.out.println("Dog barks");
	}
	}

public class Forest1 {

	public static void main(String[] args) {
	
		Dog1 d=new Dog1();
		d.eat();
		d.barks();
		
		Cat1 c=new Cat1();
		c.eat();
		c.meow();
	}

}
