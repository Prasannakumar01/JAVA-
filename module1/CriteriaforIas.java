package module1;
import java.util.*;

public class CriteriaforIas
{

public static void main(String args[])
{

Scanner sc =new Scanner(System.in);

System.out.println("Enter age of the candidate:");
int age = sc.nextInt();

if (age>22 && age <32)
{
  System.out.println("candidate is eligible for Ias");
}

else
{
System.out.println("candidate is not eligible for Ias");
}

}
}