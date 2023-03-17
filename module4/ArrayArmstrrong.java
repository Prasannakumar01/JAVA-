package module4;

import java.util.Scanner;

public class ArrayArmstrrong {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		
		System.out.println("Enter the size of array");
		int size =s.nextInt();
		int a[]=new int[size];

		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}	
			
			for(int j=0;j<size;j++) {
				int arm=0,rem=0,num=a[j];
				while(num>0) {
					rem=num%10;
					num=num/10;
					arm=arm+rem*rem*rem;
				}
			if(arm==a[j])
			{
				System.out.println("armstrong number:"+a[j]);
			}
			}s.close();
	}}
