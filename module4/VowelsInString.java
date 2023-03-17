package module4;

public class VowelsInString {

	public static void main(String[] args) {
		
		String s =new String("Katrina Kaif is a crush heroine ");
		int len= s.length();
		int count=0;
		for(int i=0;i<len;i++) {
			char ch[]=s.toCharArray();
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
				System.out.println(ch[i]+" the index position of the char is "+i);
				System.out.println();
				
		}
			System.out.println("Count of the vowel is "+count);

	}

	}}
