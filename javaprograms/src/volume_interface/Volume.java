package volume_interface;

public class Volume {

	public static void main(String[] args) {
		
      AmazonVolume av= new AmazonVolume();
      av.increaseVolume();
      av.decreaseVolume();
      System.out.println();
      call c=new call();
      c.increaseVolume();
      c.decreaseVolume();
      System.out.println();
      System_Volume sv=new call();
      sv.increaseVolume();
      sv.decreaseVolume();
      System.out.println();
      YoutubeVolume Yv = new YoutubeVolume();
      Yv.increaseVolume();
      Yv.decreaseVolume();
      
       
	}

}
