package com.collection.assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class InsertedValue {
public void insertmethod() {
	List<Integer> list=new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);
	System.out.println();
	list.add(23);
	list.add(1);
	list.add(6);
	Collections.sort(list);
	for (Integer integer : list) {
		System.out.println(integer);
		
	}
	
}
	public static void main(String[] args) {
		InsertedValue i=new InsertedValue();
		i.insertmethod();
	}

}
