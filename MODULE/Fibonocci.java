package javaprogramsexercise;
import java.util.Scanner;
public class Fibonocci {

	public static void main(String[] args) {
	
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int n=s.nextInt();
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			s.close();
		}
		
	
		}
	}


