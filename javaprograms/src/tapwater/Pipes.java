package tapwater;
class Pipes extends water implements Tap_interface{

	public void turnoff() {
		System.out.println("water inflow has been stopped as soon as the tap turnedoff");

	}

	public void turnon() {
		System.out.println("After the tap turned on ");
	}


	public void waterinflow() {
		System.out.println("water has been flowing into the tap ");
	}
	public void wateroutflow() {
		System.out.println("water has been flowing out from the tap");
	}
	}