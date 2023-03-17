package module3;


class RBI{
	public void getloans() {
		System.out.println("As per Monthly Income");
	}
}

class SBI extends RBI{
	public void getloans() {
		System.out.println("As per Yearly Income");
	}
}

class PNB extends RBI{
	public void getloans() {
		System.out.println("As per tax payable");
	}
}

class KOTAK extends RBI{
	public void getloans() {
		System.out.println("AS per the intrest");
	
	}
}
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		RBI rbi  =new RBI();
		rbi.getloans();
		 
		SBI sbi=new SBI();
		sbi.getloans();
		
		PNB pnb=new PNB();
		pnb.getloans();
		
		KOTAK kotak=new KOTAK();
		kotak.getloans();
	}
	

}
