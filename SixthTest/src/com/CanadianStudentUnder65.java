package com;

public class CanadianStudentUnder65 extends CanadianStudent {
	public CanadianStudentUnder65 (String studentName) {
		super(studentName, 5);
	}
	
	public CanadianStudentUnder65(String studentName, int numberOfCoursesTaken) {
		super(studentName, numberOfCoursesTaken);
	}

	@Override
	public double computeFees() {
		return getNumberOfCoursesTaken() >=4 ?800.00 :(200.00*getNumberOfCoursesTaken());
	}

	@Override
	public boolean lessThan(Sortable anObject) {
		if(anObject instanceof ForeignStudent || anObject instanceof SeniorStudent){
			return false;
		}else if(anObject instanceof CanadianStudentUnder65){
			CanadianStudentUnder65 temp = (CanadianStudentUnder65)anObject;
			return this.getStudentName().compareTo(temp.getStudentName()) < 0;			
		}
		return false;
	}

}
