import java.util.Scanner;

public class PrintProdofnNumbers
{

public static void main(String args[])
{

Scanner s = new Scanner(System.in);

System.out.println("Enter a number");
 
int n= s.nextInt();
int prod=1;

for(int i=1;i<=n;i++)
{
prod= prod*i;
}
System.out.println(prod);
}
}