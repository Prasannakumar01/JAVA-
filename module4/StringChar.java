package module4;

public class StringChar {

	public static void main(String[] args) {
		String s =new String("Prasanna");
		int len=s.length();
		System.out.println(" The length of the string is :"+len);
		
		for(int i=0;i<=len;i++) {
			 
			char ch=s.charAt(i);	
			if (ch=='a') 
			{System.out.println(ch);
				
			}
		}
	}

}
