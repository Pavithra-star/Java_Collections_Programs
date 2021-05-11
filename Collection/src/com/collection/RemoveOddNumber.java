package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveOddNumber {

	public static void main(String[] args) {
		HashSet<Integer> s=new HashSet<Integer>();
	for(int i=1 ; i<= 100;i++) {
		s.add(i);
	
	}
	Iterator<Integer > is=s.iterator();
	while( is.hasNext()) {
		int num=is.next();
		if(num%2!=0) {
			 is.remove();
		}
		
	}
	s.forEach(x->System.out.println(x));
	}

}
