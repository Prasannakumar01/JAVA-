package module1;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int n=s.nextInt(),rem,temp=n,arm=0;
		
		s.close();
		while(n>0) {
			rem=n%10;
		arm=arm+rem*rem*rem;
			n=n/10;
		}
              if(temp==arm)
            	  System.out.println(temp+"is Armstrong Number ") ;
              else
            	  System.out.println(temp+"is not Armstrong Number");

	}

}
