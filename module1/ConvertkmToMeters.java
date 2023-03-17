package javaprogramsexercise;

import java.util.Scanner;

public class ConvertkmToMeters {

	public static void main(String[] args) {
	   
		
		System.out.print("Enter the kilometers:" );
		try (Scanner input = new Scanner(System.in)) {
		
			double kilometre=input.nextDouble(); 
			double metre=kilometre*1000;
			
			System.out.println("converted value:" + metre);
		}

	}

}
 