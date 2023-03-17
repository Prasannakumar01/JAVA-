package module4;

public class PrintTheChar {

	public static void main(String[] args) {
		String s=new String("Prasanna is smart human");
		int len=s.length();
		int count=0;
		for (int i=0;i<len;i++) {
			char ch[]=s.toCharArray();
			if (ch[i] =='a'){
				count++;
				System.out.println(ch[i]+" is in the index of  "+i);
				System.out.println("choosen character count is"+count);
				
			
			}
		}
	}

}
