public class inc_dec_operator
{
public static void main(String args[])
{
  int a=10;
  int b=++a+--a+a+++a--;
    
  System.out.println(b);

  System.out.println("The output of a :"+a);


  int c=100;
  int d =--c;
  int e =c--;
     System.out.println(c);
     System.out.println(d);
       System.out.println(e);
}
}