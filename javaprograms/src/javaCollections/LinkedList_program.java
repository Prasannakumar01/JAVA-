package javaCollections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_program {

	public static void main(String[] args) {
		LinkedList<Integer> Llist =new LinkedList<Integer>();
		Llist.add(79);
		Llist.add(39);
		Llist.add(10);
		Llist.add(7);
		Llist.add(32);
		Llist.add(100);
		Llist.add(1);
		
		Collections.sort(Llist);
		System.out.println(Llist);
		
		Collections.reverse(Llist);
		System.out.println("After reversing the sorted list:"+Llist);
		
		Llist.removeLast();
		System.out.println("After removing the lastElement:"+Llist);
		Llist.get(3);
		System.out.println("First Element Of the array:"+Llist.getFirst());
        if(Llist.contains(79)) {
        	Llist.clear();
        }
		
        System.out.println(Llist);
		
		

	}

}
