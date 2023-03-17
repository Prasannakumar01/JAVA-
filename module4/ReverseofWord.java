package module4;

public class ReverseofWord {

	public static void main(String[] args) {
		String s= new String("within no time I am going to crack the interviews and get the opportunity to work in the reputed company.");
		
		String rev="";
		String word[]=s.split(" ");
		
	
		// reversing each and every character of the whole string 
	/*String word[]=s.split("");
		for (int i=len-1;i>0;i--) {
		 char ch=s.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println(rev);*/
		
		// reversing of the words in a string
	
	
		for(String words:word) {
			
			for(int j=words.length()-1;j<=0;j--) {
			 rev= rev+j;
		}
		
		}
		
		 System.out.print(rev+" ");				
	}
	}



