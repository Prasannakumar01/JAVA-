package module4;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size=s.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
			}
		for (int j=size-1;j>=0;j--) {
			System.out.println(a[j]);
		}
	}

}
