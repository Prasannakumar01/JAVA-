package patternMatching;

public class Pattern14 {
public static void main(String[] args) {
		 int star=1;
		 int space=3;
		 for(int row=1;row<=4;row++) {
			 for(int i=1;i<=space;i++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=star;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
			 star=star-2;
			 space=space-1;
				
		 }
	}
}
