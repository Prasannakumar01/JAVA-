package javaCollections;

import java.util.Vector;

public class Vector_linkedArray {

	public static void main(String[] args) {
		//By creating object and using those through the methods
		Vector<String> vc = new  Vector<String>();

		
		// create new elements by using add method 
		vc.add(0, "Maheshwar Reddy");
		vc.add(1, "Suseela");
		vc.add(2, "Prasanna Kumar");
		vc.add(3, "Jeevitha");
		vc.add(4, "Rajeswara Reddy");
		vc.add(5, "Karthik Reddy");
		vc.add(6, "Null");
		
		System.out.print("Elements present in the collection are:"+vc);
		
		// To find the size of the List
		
		System.out.println("The size of the collection:"+vc.size());
		// to update the element which is already existing
		vc.set(6,"My wife");
		System.out.println("elements that are present after modification:"+vc);
		vc.add(3, "My wife");
		System.out.println(vc);
		
		vc.remove(6);
		System.out.println("elements that are present after removing one element from the collection"+vc);
		
		
// contains represent the result in boolean format;If the element we have entered is present it return true
		System.out.println("Return whether the element is present:"+vc.contains("mywife"));
		
// we will be getting the element by using the get method by passing index number as argument
		System.out.println(vc.get(3)); 
		
	}
      
}
