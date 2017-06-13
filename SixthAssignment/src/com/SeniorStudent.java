package com;

public class SeniorStudent extends CanadianStudent{
	private double pension;
	 SeniorStudent(String studentName, int numberOfCoursesTaken, double pension) {
		 super(studentName,numberOfCoursesTaken);
		 this.pension=pension;
	 }

	public double computeFees() {
		return 50.00;
	}

	public String toString() {
		return super.toString()+"\n"+"pension  "+this.pension;
	}

	public boolean lessThan(Sortable anObject) {
	
		if (anObject instanceof SeniorStudent) {
			SeniorStudent temp=(SeniorStudent)anObject;
			return this.getStudentName().compareTo(temp.getStudentName()) < 0;
				
			
		}
		return true;
	}
	
	
}
