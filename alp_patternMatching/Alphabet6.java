package alp_patternMatching;

public class Alphabet6 {

	public static void main(String[] args) {
		

		 
		char ch='A';
		for(char row='A';row<='D';row++) {
			for(char col='A';col<='D';col++) {
				
				if(row>=col) {
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}

	}

}
