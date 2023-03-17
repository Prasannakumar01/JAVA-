import java.util.*;

public class Checknodivisibility
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);

System.out.println("Enter number:");
 int a = sc.nextInt();
  
if(a%13==0 && a%17==0 )

{

  System.out.println("number is divisible by 13 and 17 ");
}



else if (a%13!=0 && a%17!=0)
{
System.out.println("number is neither divisible by 17 and 13");
}



}
}