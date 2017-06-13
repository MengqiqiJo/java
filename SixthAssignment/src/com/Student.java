package com;

public abstract class Student implements FeeCalculator,Sortable{
	private static int Student_Number=0;
	private int studentNumber=0;
	private String studentName;
	private int numberOfCoursesTaken=0;
	
	
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getNumberOfCoursesTaken() {
		return numberOfCoursesTaken;
	}

	public void setNumberOfCoursesTaken(int numberOfCoursesTaken) {
		this.numberOfCoursesTaken = numberOfCoursesTaken;
	}

	public abstract String findCountry();
	
	
	Student(String studentName, int numberOfCoursesTaken) {
		this.studentName = studentName;
		this.numberOfCoursesTaken = numberOfCoursesTaken;
		this.Student_Number++;
		this.studentNumber=Student_Number;
	}

	public String toString() {
		return "student number : "+this.studentNumber + ", name : "+this.studentName + " from "+findCountry()
				+ " pays fees "+computeFees();
	}
	
}
