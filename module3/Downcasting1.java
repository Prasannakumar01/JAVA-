package module3;
class Takingoff{
	public void tyres() {
		System.out.println("Tyres has to be hidden ");
	}
		
		public void wings() {
			
		System.out.println("Wings has to be visible");
	}
}

class Landing extends Takingoff{
	public void tyres() {
	System.out.println("Tyres has to be visible");}
	
	public void wings() {
		System.out.println("Wings has to be visible");
	}
}
public class Downcasting1 {

	public static void main(String[] args) {
		Takingoff t1=new Landing();
		
	
		Landing l=(Landing) t1;
		l.tyres();
		l.wings();
	}

}
