package javaprogramsexercise;

import java.util.Scanner;

public class DivideTwoNumbersTogetRemainder {

	public static void main(String[] args) {
		int a= 300;
		int b= 15;
		int c=a/b;


		System.out.println("Division of two numbers :" + c +" " +"is the quotient" );



		try (Scanner input = new Scanner (System.in)) {
			System.out.print("Enter the first number:");
			int d=input.nextInt();
			System.out.print("Enter the second number:");
			int e=input.nextInt();
			System.out.println();
			System.out.println("Division of two numbers :" + d/e);
		}

	}

}  
