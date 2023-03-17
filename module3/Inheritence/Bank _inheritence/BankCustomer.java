package module3;

abstract class Rbi1 {
	abstract public void getdeposits();

	abstract public void getWithdrawl();

	abstract public void getLoans();

}

abstract class Sbi1 extends Rbi1 {
	public void getdeposits() {
		System.out.println("Amount needs to be deposited here");
	}

	public void getWithdrawl() {
		System.out.println("Amount withdrwal is done  here");
	}

}

class SBILoans extends Sbi1{
	public void getLoans() {
		System.out.println("Loans are approved here ");

	}

}

public class BankCustomer {

	public static void main(String[] args) {
		Sbi1 sbi = new SBILoans();
		sbi.getdeposits();
		sbi.getWithdrawl();
		sbi.getLoans();

	}

}
