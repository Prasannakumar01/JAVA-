package module4;

public class VowelsFromAString {

	public static void main(String[] args) {
		String s =new String ("Aeroplane");
		int len= s.length();
		System.out.println("Length of the String:"+len);
		
		for (int i=0;i<=len;i++) {
			
			char ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				System.out.println(ch);
			}
		}

	}

}
