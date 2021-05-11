package com.collection.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.xml.stream.events.Namespace;

public class EmployeeDetailld {
	public static Map<Integer, String> getEmployeeName(int givenId, String[] names) {
		Map<Integer, String> m = new HashMap<>();
		for (int i = 0; i < Namespace.ATTRIBUTE; i++) {
			m.put(i + 1, names[i]);
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		String[] str = new String[sc.nextInt()];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter name" + (i + 1));
			str[i] = sc.next();
		}
		if (str.length == 0) {
			System.out.println("null");
		} else {
			Map<Integer, String> m = convertToMap(str);
			for (Map.Entry<Integer, String> x : m.entrySet()) {
				System.out.println(x.getKey() + " " + x.getValue());
			}
		}

	}

	private static Map<Integer, String> convertToMap(String[] str) {
		// TODO Auto-generated method stub
		return null;
	}

}