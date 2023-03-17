package module1;

import java.util.Scanner;

public class AverageOfFiveNumbers {

	public static void main(String[] args) {
		
		System.out.println("enter five numbers:");
		try (Scanner sc = new Scanner (System.in)) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int f=a+b+c+d+e;
			int g=a+b+c+d+e/5;
			
			System.out.println("sum of five numbers: "+f);
			System.out.println("Average of five numbers:"+g);
		}
	}

}
