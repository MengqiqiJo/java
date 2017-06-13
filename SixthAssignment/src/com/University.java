package com;

public class University {
	private Student[] listOfStudents;	
	private int countArray=0;
	public University(int maximumNumberOfStudents){	
		listOfStudents=new Student[maximumNumberOfStudents];
	}
	public boolean insertStudent(Student aStudent){
		if(countArray<listOfStudents.length){
			listOfStudents[countArray++] = aStudent;
			return true;
			
		}else{
			
			return false;
		}
	}
	public int numberOfStudents(String nameOfCountry){
		int numberOfStudents=0;
		for(int count=0;count<countArray;count++){
		if(	listOfStudents[count].findCountry().equals(nameOfCountry)){
			numberOfStudents++;
		}
		}
		return numberOfStudents;
	} 
	public String toString(){
		String a="";
		for(int count=0;count<countArray;count++){
			a=a+this.listOfStudents[count].toString()+"\n";
		}
		return "Number of students in University : "+this.countArray+"\n"+a;
	}
	public void sortStudents(){
		Sort.sortAnything(listOfStudents, countArray);
	}

}
