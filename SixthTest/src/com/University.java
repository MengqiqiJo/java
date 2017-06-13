package com;

public class University {
	private Student[] listOfStudents;
	private int studentCount = 0;
	public University(int maximumNumberOfStudents){
		listOfStudents = new Student[maximumNumberOfStudents];
	}
	public boolean insertStudent(Student student){
		if(studentCount < listOfStudents.length){
			listOfStudents[studentCount++] = student;
			return true;
		}
		return false;
	}
	public int numberOfStudents(String nameOfCountry){
		int count = 0;
		for(int i = 0; i < studentCount; i++){
			if(listOfStudents[i].findCountry().equals(nameOfCountry)){
				count++;
			}
		}
		return count;
	}
	@Override
	public String toString() {
		String  description = "" + studentCount ;
		for(int i = 0; i < studentCount; i++){
			description += " " + listOfStudents[i].toString() +"\n";
		}
		return description;
	}
	public void sortStudents(){
		Sort.sortAnything(listOfStudents, studentCount);
	}
}
