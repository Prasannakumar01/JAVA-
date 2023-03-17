import.java.util.*;

public class ChecknoPrimeorNot
{

public static void main(String args[])
{

Scanner s=new Scanner(System.in);

System.out.println("Enter a number:");

int n= s.nextInt();
int count =0;

for (int i=1;i<n;i++)
{
if (n%i==0)
if (count==2)
{
System.out.println("number is prime") ;
}

else 
{
System.out.println("number is not prime");
}

}
}