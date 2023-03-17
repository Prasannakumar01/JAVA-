package javaCollections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();

		al.add("Elephant");
		al.add("Lion");
		al.add("Dinosorous");
		al.add("Godzilla");
		al.add("Fox");
		
		System.out.println(al);
		
		System.out.println(al.remove(3));
		
	     al.add(2,"Prasana");
	     
	     System.out.println(al);
	     
	    al.remove(4);
	    System.out.println("After removal of 4th index:"+al);
	    al.clear();
	    System.out.println("After removal of all the element in the group:"+al);
	    al.isEmpty();
	    System.out.println(al.isEmpty());
	}

}
