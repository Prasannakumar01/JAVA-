
import java.util.Scanner;

public class FactorialScanner
{
public static void main(String args[])
{

  Scanner s =new Scanner(System.in);
System.out.println("Enter number:");
      int n = s.nextInt(),fact=1;
for (int i=n;i>=1;i--)
{
  fact=fact*i;

}
   System.out.println("Factorial of a number:"+fact);
}

}