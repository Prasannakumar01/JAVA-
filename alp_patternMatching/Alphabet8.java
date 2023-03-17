package alp_patternMatching;

public class Alphabet8 {

	public static void main(String[] args) {
	for(char row='A';row<='D';row++) {
		for(char col='A';col<='D';col++) {
			
			if(row<=col) {
				System.out.print(row+" ");
			}
		}
		System.out.println();
	}

	}

}
