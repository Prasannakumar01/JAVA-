public class NumisPrimeorNot
{
public static void main(String args[])
{
  int n=5,count=0;
for(int i=1;i<=5;i++)
{
 if(n%i==0)
   count++;
if(count==2)
  System.out.println(n+" "+"is prime");

}
}
}