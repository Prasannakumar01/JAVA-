import java.util.*;

public class Swapnumbers
{
public static void main(String args[])
{

Scanner s= new Scanner(System.in);

System.out.println("Enter two numbers:");
int a =s.nextInt(),b=s.nextInt();
int c;

System.out.println("before Swapping:"+a+" "+b);

c=a;
a=b;
b=c;

System.out.println("after swapping:"+a+" "+b);
}
}