package pattern;

public class Pattern17 {

	public static void main(String[] args) {
		int star=1;
		int space=3;
		int hash=1;
		for(int row=1;row<=4;row++) {
			for(int i=1;i<=space;i++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=hash;k++) {
				System.out.print("#");
			}
			star=star+1;
			hash=hash+1;
			space=space-1;
			System.out.println();
		}
	}

}
