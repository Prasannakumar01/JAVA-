 import java.util.*;

public class EligibleAgetovote
{
public static void main(String args[])
{
     
 Scanner sc = new Scanner(System.in);

System.out.println("Enter the age of the candidate:");
 int age= sc.nextInt();

if(age>= 18)
{
System.out.println("Candidate is eligible to vote");
}

else
{
System.out.println("candidate is not eligible to cast vote");
}

}
}