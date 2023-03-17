package smart_phone;

public class phone extends Airtel implements Jio{

	@Override
	public void Contacts() {
		
		System.out.println("Your contacts of Airtel has been syncronoized");
	}

	@Override
	public void contacts() {
		
		System.out.println("your Contacts of Jio has been syncronizing");
	}

	@Override
	public void call() {
		
		System.out.println("You can only call from one sim");
	}



}
