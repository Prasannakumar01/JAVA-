package module1;
import java.util.Scanner;
public class Multipication {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+a*i);
			s.close();
		}

	}

}
