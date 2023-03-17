package module4;
import java.util.Scanner;
public class SumofArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");

		int size=s.nextInt();
		int a[]=new int[size];
		int sum=0;
		
		for(int i=0;i<size;i++) {
		     a[i]=s.nextInt();
		}
		
		for(int j=0;j<size;j++) {
			sum = sum+a[j];
			
		}
		 
		System.out.println("Sum of the array numbers:"+sum);
		s.close();
	}

}
