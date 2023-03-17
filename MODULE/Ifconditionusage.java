package module1;
import java.util.Scanner;
public class Ifconditionusage {

	public static void main(String[] args) {
		
		System.out.println(" age of the sun?");
		Scanner s= new Scanner(System.in);
		int age=s.nextInt();
         s.close();
	if(age<0)
	System.out.println("Sun is yet to born");
	
	else if(age>0)
	System.out.println("Sun provides light to all the planets in the solar system");
	
	else 
		System.out.println("Sun is illuminating and lots of heat has been relasing from the sun");
	}

}
