package module4;

public class Duplicates {
	public static void main(String[] args) {
		String s="java";
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			int count1=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count1++;
					ch[j]=' ';
				}
				
			}
			if(count1>1 && ch[i]!=' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
}
