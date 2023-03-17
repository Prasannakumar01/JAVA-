package module3;


class Telecom{
	public void getcallertune() {
		System.out.println("tring..tring..tring..tringtring");
	}
}

class Govt extends Telecom{
	public void getcallertune() {
		System.out.println("snehame ra jeevitham");
	}
}
class Boys extends Telecom{
	public void getcallertune() {
		System.out.println("dosth mera dosth");
	}
}

class Girls extends Telecom{
	public void getcallertune() {
		System.out.println("Andagada andagada andallanni ....");
	}
}

public class MobileUser {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Govt g =new Govt();
		g.getcallertune();
		
	/*	Girls gl=new Girls();
		gl.getcallertune();
		
		Boys b=new Boys();
		b.getcallertune();*/
		
		Telecom t=new Telecom();
		t.getcallertune();
		
	}

}
