import java.util.Scanner;


public class Switchdaytype
{


public static void main(String args[])
{


Scanner sc = new Scanner(System.in);

System.out.println("Enter day type:");
int daytype =sc.nextInt();

switch(daytype)
{

case 1: System.out.println(" Monday is weekday");
        break;              
case 2:System.out.println("Tuesday is weekday");
        break;
case 3:System.out.println("wednesday is weekday");
        break;

case 4:System.out.println("Thursday is weekday");
        break;
case 5:System.out.println(" Friday is weekday");
       break;       
case 6:System.out.println(" Saturday is weekend 1");
         break;
case 7: System.out.println("Sunday is weekend 2");
         break;
case 8: System.out.println("invalid day");
         break;

}

}

}