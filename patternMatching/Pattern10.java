package patternMatching;

public class Pattern10 {

	public static void main(String[] args) {
		
	for(int row=5;row>1;row--) {
		for (int col=5;col>1;col--) {
			if(row>=col) {
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		System.out.println();
		
	}
	}

}
