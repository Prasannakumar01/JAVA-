package javaCollections;

import java.util.LinkedHashMap;

public class LinkedHashMap_program {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> Lhm =new LinkedHashMap<String,Integer>();

		Lhm.put("MaheshBabu",6);
		Lhm.put("Krishna", 1);
		Lhm.put("Vijaya", 4);
		Lhm.put("Thamanna",6);
		Lhm.put("Dhanush", 17);
		Lhm.put("Sharuk", 2);
		Lhm.put("Salman",4);
		Lhm.put("Thamanna", 1);
	
		System.out.println(Lhm);
	    Lhm.remove("Salman");
	    System.out.println("After removal of 8th element"+Lhm);
	    System.out.println(Lhm.get("Thamana"));
	    System.out.println(Lhm.keySet());
	    System.out.println(Lhm.values());
	   
		
		
	}
	

}
