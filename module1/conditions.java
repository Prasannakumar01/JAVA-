import java.util.*;

public class conditions
{
public static void main(String args[])
{


Scanner sc = new Scanner(System.in);

System.out.println("Enter number ");
   int i = sc.nextInt();




  if (i>10 && i<25 && i%2==0)
   {
  System.out.println("Tom");
   }

else if(i>10 && i<25 &&  i%2!=0)
{
System.out.println("jerry");
}

  else
  {
  System.out.println("Tom and Jerry");
  }
}
}