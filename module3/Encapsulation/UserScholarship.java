package module3;

class Scholarship {

	private String appid;
	private long sscno;

	public void setappid(String appid) {
		this.appid = appid;
	}

	public void setsscno(long sscno) {
		this.sscno = sscno;
	}

	public String getappid() {
		if (appid == "TS20224856") {
			return "appid is verified";
		} else {
			return "appid is incorrect";
		}
	}

	public long getsscno() {
		if (sscno == 2022984563) {
			return 101;
		} else
			return 100;

	}

      public  class Userscholarship
      {
	     public static void main(String[] args) {

		Scholarship s=new Scholarship();
		s.setappid("Ts20987644");
		String r_appid =s.getappid();
		System.out.println(r_appid);
		
		s.setsscno(1234567989);
		long S_sscno=s.getsscno();
		
		System.out.println(S_sscno);
		
		
	}
}}
