package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionEmployee {

	public static void main(String[] args) {
		List<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee("pavithra", 101, 2300));
		l1.add(new Employee("Afreed", 102, 2400));
		l1.add(new Employee("pavi", 103, 3300));
		l1.add(new Employee("pavi", 103, 3300));
		
		for (Employee object : l1) {
			System.out.println(object);

		}
		System.out.println("\n");
		ListIterator li = l1.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("\n");
		Iterator l2 = l1.iterator();
		while (l2.hasNext()) {
			System.out.println(l2.next());
		}
	}

}
