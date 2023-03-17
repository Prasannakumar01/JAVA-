package module4;

public class RevOfString {

	public static void main(String[] args) {
		String s=new String("Aiswarya");
		int len=s.length();
		
	   String rev="";
	   for(int i=len-1;i>=0;i--) {
		  char ch= s.charAt(i);
		   rev=rev+ch;
		   System.out.println(rev);
		   
	   }

	}

}
