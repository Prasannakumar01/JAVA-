package module4;

public class CountVowelsFromString {

	 

	public static void main(String[] args) {
		String s=new String ("developer");
				
		int len=s.length();
		System.out.println("length of the string" +len);
		
		for (int i=0;i<=len;i++) {
			
			char ch=s.charAt(i);
			int count=0;
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			
				count++;
				System.out.println("Count of the vowels is :"+count);
			}
			
		}
	
	}

}
