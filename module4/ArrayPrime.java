package module4;

import java.util.Scanner;

public class ArrayPrime {

	public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int size=s.nextInt();
            int a[]=new int[size];
            for (int i=0;i<size;i++)
            {
            	a[i]=s.nextInt();
            	System.out.println(i);
            	}
            	for (int j=0;j<size;j++) 
            	{
            		int count=0;
            		for(int k=1;k<=a[j];k++) {
            			if (a[j]%k==0) 
            				count++;
            		}
            		
            				if (count==2) {
            					System.out.println("the Given number is prime number :"+a[j]);
            				
            				
            				}}	}
            			
            			}
            	
