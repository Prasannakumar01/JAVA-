package bank;

public class AccountDetails {
     private String accHolderName;
     private String dOB;
     private String address;
     private int age;
     private long aadharNo;
     private long phoneNo;
     
     
	public AccountDetails(String accHolderName, String dOB, String address, int age, long aadharNo, long phoneNo) {
		this.accHolderName = accHolderName;
		this.dOB = dOB;
		this.address = address;
		this.age = age;
		this.aadharNo = aadharNo;
		this.phoneNo = phoneNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}

	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getdOB() {
		return dOB;
	}


	public long getAadharNo() {
		return aadharNo;
	}


	public String getaccHolderName() {
		return accHolderName;
	}
	
	
}


