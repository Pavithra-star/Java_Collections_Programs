package com.collection;

public class Employee {
private String ename;
private int eid;
private double esalary;
public Employee(String ename, int eid, double esalary) {
	super();
	this.ename = ename;
	this.eid = eid;
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", eid=" + eid + ", esalary=" + esalary + "]";
}

	
}
