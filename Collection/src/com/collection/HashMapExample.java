package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	

	public static void main(String[] args) {
		HashMap<String, Integer> hm= new HashMap<String,Integer>();
		hm.put("Pavithra",1);
		hm.put("maya",2);
		hm.put("likitha", 3);
		for(Map.Entry m: hm.entrySet()) {
System.out.println(m.getKey()+ " " +m.getValue());
	}

}
}
