package volume_interface;

public class call implements System_Volume{

	@Override
	public void increaseVolume() {
		System.out.println("volume is max for the  Call");
		
	}

	@Override
	public void decreaseVolume() {
		System.out.println("the volume has been min for the call");
		
	}
	
	

}
