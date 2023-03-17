package javaprogramsexercise;
import java.util.Scanner;

public class ReverseofNumber {

	public static void main(String[] args) {
               System.out.println("Enter the number:") ;
               Scanner s=new Scanner(System.in);
               
               int a=s.nextInt(),rev=0,rem;
               s.close();
               while(a>0) {
            	   rem=a%10;
            	   rev=rev*10+rem;
            	   a=a/10;
            	   
               
              
               }

        	   System.out.println("Reverse of a number is :"+rev);
               }
	}


