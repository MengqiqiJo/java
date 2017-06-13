package com;

public class Student extends Person{
	private String major;
	public Student(String fullName, String amajor){
		super(fullName);
		this.major=amajor;
	}
	public double getSalary(){
		return 0.0;
	}
	public String toString(){
		return super.toString()+"\n"+"major in: "+this.major+"\n";
	}
}
