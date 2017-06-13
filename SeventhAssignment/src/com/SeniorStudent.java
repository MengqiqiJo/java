package com;

public class SeniorStudent extends CanadianStudent {
	private double pension;

	public SeniorStudent(String studentName, int numberOfCoursesTaken,
			double pension) {
		super(studentName, numberOfCoursesTaken);
		this.pension = pension;
	}

	public double computeFees() {
		return 50.0;
	}

	public boolean lessThan(Sortable anotherStudent) {
		if (anotherStudent instanceof SeniorStudent) {
			SeniorStudent aSeniorStudent = (SeniorStudent) anotherStudent;
			return ((this.getStudentName().compareTo(aSeniorStudent.getStudentName()) < 0));
			//^ super.getSortingFlag());
		} else {
		//	return (true ^ super.getSortingFlag());
			return true;
		}
	}

	public String toString() {
		String output;
		output = super.toString() + " senior citizen who gets pension $"
				+ pension;
		return output;
	}
}
