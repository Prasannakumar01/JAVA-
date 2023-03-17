package javaCollections;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	hm.put(5," Priyanka Chopra");
	hm.put(7,"Aishwarya roy");
	hm.put(2,"Katrina Kaif");
	hm.put(2, null);
	hm.put(null,"Karina Kapoor");
	/*hm.put(true, "Samantha");
	hm.put(true, "Priyanka Chopra");*/
	
	System.out.println(hm);
	//System.out.println(hm.containsKey(true));
	System.out.println(hm.containsValue("Priyanka"));
//	System.out.println(hm.get(true));
	System.out.println(hm.clone());
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	}

}
