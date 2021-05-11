package com.collection.assignment.department;

public class Student {
	private int studentId;
	private String studentName;
	private int marks;
	private String Department;
	private String Course;
	
	public Student(int studentId, String studentName, int marks, String department, String course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		Department = department;
		Course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
	
}
