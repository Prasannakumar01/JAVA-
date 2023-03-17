package module1;
import java.util.Scanner;

public class Arithmetic_oper

{

public static void main(String args[])
{

Scanner sc= new Scanner(System.in);

System.out.println("Enter first input value:");
int a =sc.nextInt();

System.out.println("Enter second input value:");
int b =sc.nextInt();

int c= a+b;
  System.out.println("Addition of two inputs:"+c);

int d =a-b;

System.out.println("subtract of two inputs:"+d);

int e= a*b;
System.out.println("Multiplication of two inputs:"+e);

int f= a%b;
System.out.println("modulus of two inputs :"+f);

int g=a/b;
System.out.println("Division of two inputs:"+g);

}
}