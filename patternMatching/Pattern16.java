package patternMatching;

public class Pattern16 {

	public static void main(String[] args) {
		int star=1,space=3;

		for(int row=1;row<=4;row++) {
			for(int i=1;i<=space;i++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(row<=3) {
				space=space-1;
				star=star+2;
			}
			else {
				space=space+1;
				star=star-2;
			}
		}
		System.out.println();
		
	}

}
