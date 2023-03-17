package javaprograms;

public class Jumpingstatements {
	
	public static void main(String[] args) {
		 //break statement is used to break the statement even though the statement is true;
		
		System.out.println("Break statements");


		int i=12;
		for(i=12;i<=20;i++) {

			{
				if(i==15)
					break;
			}
			System.out.println(i);

		}
		
// continue statement is used to continue the statement after reaching the certain condition

		System.out.println("Continue statement");

		int z=1;
		for(z=1;z<=10;z++) {
			{
				if(z==7) {
					continue;	
				}
				System.out.println(z);
			}
		}
	}

}
