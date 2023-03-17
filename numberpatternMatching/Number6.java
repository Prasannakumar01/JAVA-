package numberpatternMatching;

public class Number6 {

	public static void main(String[] args) {
		int num=1;
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				
				if(row>=col) {
				System.out.print(num+" ");
				num++;
			}
				
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
