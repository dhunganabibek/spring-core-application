package com.bibekdhungana;

public class Student {
	private String studentName;
	private int id;
	
	public Student() {
		System.out.println("Student Empty Constructor");
	}
	
	
	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", id=" + id + "]";
	}
	
	
	

}
