import java.util.Scanner;

public class GivenNumbersisPrimeornot
{
public static void main(String args[])
{

Scanner s= new Scanner(System.in);

System.out.println("Enter first input :");
 int n1=s.nextInt();
System.out.println("Enter second input :");
 int n2=s.nextInt();

for (int i=n1; i<=n1&&i>=n2;i++)
{

int count=0;
for(j=1;j<=n1;j++)
{
if(j%i==0)
count++;

if(count==2)
System.out.println(i+""+"is prime");
else 
System.out.println(i+""+"is not prime");
}

}

}
}

