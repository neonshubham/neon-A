package com.neon.bean;

public class Grades {

	int studentId;
	String studentGrade;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	public Grades(int studentId, String studentGrade) {
		super();
		this.studentId = studentId;
		this.studentGrade = studentGrade;
	}
	@Override
	public String toString() {
		return "Grades [studentId=" + studentId + ", studentGrade=" + studentGrade + "]";
	}
	
	
	
	
}
