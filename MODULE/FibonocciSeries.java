package module1;

import java.util.Scanner;

public class FibonocciSeries {

	public static void main(String[] args) {
	System.out.println("Enter upto which number we want to do Fibonocci Series:");
	
	Scanner s= new Scanner(System.in);
	int number=s.nextInt();
	s.close();
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		while(number<10) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		number++;
		
	}
			 
			
			
		}
		
		
		
	}


