package module4;

public class ReverseOfString {

	public static void main(String[] args) {
		String s=new String("Bob");
         int len=s.length();
         String rev="";
         System.out.println("length of the given string is :"+len);
         for(int a=len-1;a>=0;a--) {
        	 char ch=s.charAt(a);
        	 rev=rev+ch;
        	 System.out.println(rev);
        	 if (rev.equalsIgnoreCase(s)) {
        		 System.out.println("palindrome");}
        		 else {
        			 System.out.println("Non palindrome");
        	 }
         }
         
	}

}
