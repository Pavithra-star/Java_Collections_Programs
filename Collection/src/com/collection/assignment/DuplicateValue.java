package com.collection.assignment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class DuplicateValue {
	public void duplicateData() {
		Set<Integer> list = new HashSet<Integer>();
		list.add(23);
		list.add(23);
		list.add(1);
		list.add(4);
		Iterator<Integer> is = list.iterator();
		while (is.hasNext()) {
			System.out.println(is.next());
		}
	}
	public static void main(String[] args) {
		DuplicateValue d = new DuplicateValue();
		d.duplicateData();
	}

}
