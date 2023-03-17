import java.util.*;

public class SwappnumberusingxtraVar
{
public static void main(String args[])
{

Scanner s = new Scanner(System.in);

int a=s.nextInt(),b=s.nextInt();
int c;

System.out.pritnln("Before swapp :"+a+""+b);

c=a;
b=a;
b=c;

System.out.println("After Swapp:"+a+""+b);
}
}
