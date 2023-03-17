package module3;

class Normaluser{
	public void tvserials(){
		System.out.println("Content of the serials are available ");
		
	}
}
class Vipuser extends Normaluser{
	public void livematches() {
		System.out.println("user will be able to watch all the shows available in the app");
	}
}
public class ObjectCasting {

	public static void main(String[] args) {
		System.out.println(" parent class are visible");
		Normaluser n1=new Vipuser();
		n1.tvserials();
	
		Vipuser v1=(Vipuser)n1;
		v1.livematches();
		v1.tvserials();

	}

}
