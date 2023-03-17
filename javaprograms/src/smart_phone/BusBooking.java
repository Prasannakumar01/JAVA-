package smart_phone;

public class BusBooking extends phone implements Gmail{

	

	@Override
	public void calender() {
		System.out.println("Calender has been using and you can view the booking details in the calender");
		
	}

	@Override
	public void remainders() {
		System.out.println("You can provide the remainder of your booking");
		
	}

}
