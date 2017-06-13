package com;

public class SeniorStudent extends CanadianStudent {
	private double pension;
	
	public SeniorStudent(String studentName, int numberOfCoursesTaken, double pension) {
		super(studentName, numberOfCoursesTaken);
		this.pension = pension;
	}

	@Override
	public double computeFees() {
		// TODO Auto-generated method stub
		return 50.00;
	}

	@Override
	public boolean lessThan(Sortable anObject) {
		if(anObject instanceof SeniorStudent){
			SeniorStudent temp = (SeniorStudent) anObject;
			return this.getStudentName().compareTo(temp.getStudentName()) < 0;
		}else{
			return true;
		}
	}
	@Override
	public String toString() {
		return pension+ " " + super.toString();
	}
}

	