package com.collection.assignment;


import java.util.Scanner;

public class ClassNumberList {
	public void splitmethod() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value");
		String[] arrSplit = sc.next().split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			System.out.println(arrSplit[i]);
		}
	}

	public static void main(String[] args) {
		ClassNumberList cl = new ClassNumberList();
		cl.splitmethod();
	}
}
