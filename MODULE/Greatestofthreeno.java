import java.util.*;

public class Greatestofthreeno
{

public static void main(String arg[])

{

Scanner sc = new Scanner(System.in);


System.out.println("Enter first number:");
int a=sc.nextInt();


System.out.println("Enter second number:");
int b = sc.nextInt();

System.out.println("Enter third number:");
int c = sc.nextInt();

if (a>b && a>c)
{
  System.out.println("a is greater number than other numbers");
}


else if(b>a&&b>c)
{
 System.out.println("b is greater number than other numbers");
}

else 
{
System.out.println("c is greater than other two numbers");
}

}

}

