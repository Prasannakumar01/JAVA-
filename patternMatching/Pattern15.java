package patternMatching;

public class Pattern15 {

	public static void main(String[] args) {
		int space=0;
		int star=7;
		for(int row=1;row<=7;row++) {
			for(int i=1;i<=space;i++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
		}
		System.out.println();
		space=space+1;
		star=star-1;
	}

}
