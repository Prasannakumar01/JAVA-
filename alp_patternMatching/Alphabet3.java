package alp_patternMatching;

public class Alphabet3 {

	public static void main(String[] args) {
		char ch='A';
		for(char row='A';row<='C';row++) {
			for(char col='A';col<='C';col++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}
