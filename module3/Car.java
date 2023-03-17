package module3;



class Bmw{
	public void speed() {
		System.out.println("Speed of the car is 230km/hr");
	}
}

class Ferrari extends Bmw{
	public void colour() {
		System.out.println("The colout of Ferrari is Red");
		
	}
}

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bmw b=new Bmw();
         b.speed();
        
	}

}
