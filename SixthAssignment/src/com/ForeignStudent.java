package com;

public class ForeignStudent extends Student{
	private String countryOfOrigin;
	private MyDate dateOfEntryToCanada;
	 ForeignStudent(String studentName, int numberOfCoursesTaken, String countryOfOrigin, MyDate dateOfEntryToCanada){
		 super(studentName,numberOfCoursesTaken);
		 this.countryOfOrigin=countryOfOrigin;
		 this.dateOfEntryToCanada=dateOfEntryToCanada;
	 }
	 public double computeFees(){
		 return (1000.0*super.getNumberOfCoursesTaken());
	 }
	 public String findCountry(){
		 return this.countryOfOrigin;
	 }
	 public boolean lessThan(Sortable anObject){
		 boolean flag=true;
		 if(anObject instanceof SeniorStudent){
			 flag=false;
		 }else if(anObject instanceof ForeignStudent){
			 ForeignStudent temp=(ForeignStudent)anObject;
			return  this.getStudentName().compareTo(temp.getStudentName()) < 0;
					
				
		 }
		 return flag;
	 }

}
