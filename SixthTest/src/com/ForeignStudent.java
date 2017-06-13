package com;

public class ForeignStudent extends Student{
	private String countryOfOrigin;
	private MyDate dateOfEntryToCanada;
	public ForeignStudent(String studentName, int numberOfCoursesTaken, String countryOfOrigin,
			MyDate dateOfEntryToCanada) {
		super(studentName, numberOfCoursesTaken);
		this.countryOfOrigin = countryOfOrigin;
		this.dateOfEntryToCanada = dateOfEntryToCanada;
	}
	@Override
	public double computeFees() {
		return 1000.00*getNumberOfCoursesTaken();
	}
	@Override
	public boolean lessThan(Sortable anObject) {
		if(anObject instanceof SeniorStudent){
			return false;
		}else if(anObject instanceof ForeignStudent){
			ForeignStudent temp = (ForeignStudent)anObject;
			return this.getStudentName().compareTo(temp.getStudentName()) < 0;			
		}else{
			return true;
		}
	}
	@Override
	public String findCountry() {
		return countryOfOrigin;
	}
	
}
