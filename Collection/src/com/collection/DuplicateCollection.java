package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicateCollection {

	public static void main(String[] args) {
	HashSet<String> s=new HashSet<String>();
	s.add("Pavithra");
	//System.out.println("pavithra".hashCode());
	s.add("Phani");
	s.add("radha");
	s.add("radha");
	//System.out.println("radha".hashCode());
	Iterator<String> is=s.iterator();
	while(is.hasNext()) {
		System.out.println(is.next());
	}
	}

}
//1293541895
//108270542
//Pavithra
//radha
//Phani
