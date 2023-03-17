package bank;

public class SBI {

	public static void main(String[] args) {
	 AccountDetails ac=new AccountDetails("prasanna", "08/06/1997","Kphb Colony", 25, 559664283754L, 7013156969L);
	 System.out.println("account holder name : "+ac.getaccHolderName());
	 System.out.println("Date of Birth:"+ac.getdOB());
	 System.out.println("Address:"+ac.getAddress());
	 System.out.println("Age:"+ac.getAge());
	 System.out.println("Aadhar Number:"+ac.getAadharNo());
	 System.out.println("Phone Number:"+ac.getPhoneNo());
}}   
