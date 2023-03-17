package javaprograms;

public class CharInString {

	public static void main(String[] args) {
		String s="maintain the peace";
		int len =s.length();
		int count=0;
		for(int i=0;i<len;i++) {
			char ch=s.charAt(i);  
			if (ch=='a'	) {
				count++;
			}
			
			}
		System.out.println( "Count of a character in a string:"+count);
	}

}
