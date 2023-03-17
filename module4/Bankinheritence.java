package javaprograms;

public class Bankinheritence {

	public static void main(String[] args) {
		RBI rbi= new RBI ();
		 rbi.Fd_rate();
		SBI sbi= new SBI();
		 sbi.Fd_rate();
		HDFC hdfc= new HDFC();
		hdfc.Fd_rate();
		UBI ubi= new UBI();
		ubi.Fd_rate();
	}}
	class RBI{
		public void Fd_rate() {
			System.out.println("The fixed rate of RBI is 6%");
		}
	}
	
	class SBI extends RBI{
		public void Fd_rate() {
			System.out.println("The fixed rate of SBI is 5.2%");
		}
		
		}
	
	class HDFC extends RBI{
		public void Fd_rate() {
			System.out.println("The fixed rate of HDFC is 4.9%");
			
		}
		
	}
	class UBI extends RBI{
		public void Fd_rate() {
			System.out.println("the fixed rate of UBI is 5%");
			
		}
	}


