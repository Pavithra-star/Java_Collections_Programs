package com.collection.assignment.emp;

import java.util.ArrayList;
import java.util.List;

public class EmpList {
	public static void main(String[] args) {
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(1,"pavithra","software",23000));
		list.add(new Emp(2,"phani","javaTrainer",63000));
		list.add(new Emp(3,"ravali","phython",23000));
		list.add(new Emp(4,"sarika",".net",93000));
		for (Emp emp : list) {
			System.out.println(emp);
		}
		
		
	}
}
