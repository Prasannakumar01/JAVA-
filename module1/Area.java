package module1;
import java.util.Scanner;

public class Area
{
public static void main(String args[])
{
    System.out.println("DEALING WITH THE AREAS OF THE PARTICULAR SHAPE");
 
    Scanner sc = new Scanner(System.in);

System.out.println("Rectangle inputs");

  System.out.println("Enter p value :");
      int p = sc.nextInt();

 System.out.println("Enter q value:");
       int q = sc.nextInt(); 

        int r = p*q;
  System.out.println("Area of rectangle: "+r);

System.out.println("Square inputs");

System.out.println("Enter a value:");
 int a= sc.nextInt();


int b= a*a;
System.out.println("Area of square: "+b);

System.out.println("Triangle inputs:");

 
System.out.println("Enter C value:");
 int c =sc.nextInt();

System.out.println("Enter d value:");
int d = sc.nextInt();

float e = 1/2*c*d;
System.out.println("Area of triangle: "+e);

System.out.println("Circle inputs:");
 

System.out.println("Enter f value:");
int f = sc.nextInt();


float g = 22/7*f*f;
System.out.println("Area of circle  :"+g);


}

}
