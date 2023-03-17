package module1;

public class PatternMatching {

	public static void main(String[] args) {
		
		for(int row=1;row<=4;row++) {
			for(int col =1;col<=4;col++) {
				
			 if(row==col) {
				 System.out.println("*");}
			 else {
				 System.out.println("");
				 }
			 }
			System.out.println();
			}
		}
	}


