package module3;

abstract class Car1 {
	abstract public void acclerate();

	abstract public void brakes();

}

class Honda extends Car1 {

	public void acclerate() {
		System.out.println("the accleration of the car is dependent on the car ");
	}

	public void brakes() {
		System.out.println("the brakes of the car is applied whenever we need to reduce the accleration");
	}
}
public class AbstractShowroom {

	public static void main(String[] args) {
		
        Car1 c1=new Honda();
             c1.acclerate();
             c1.brakes();
	}
}

