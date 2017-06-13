package com;

public class CanadianStudentUnder65 extends CanadianStudent{
	 CanadianStudentUnder65 (String studentName){
		 super(studentName,5);
	 }
	 CanadianStudentUnder65 (String studentName, int numberOfCoursesTaken) {
		 super(studentName,numberOfCoursesTaken);
	 }
	 public double computeFees(){
		 if(super.getNumberOfCoursesTaken()>=4){
			 return 800.0;
		 }else{
			 return (super.getNumberOfCoursesTaken()*200);
		 }
	 }
	 public boolean lessThan(Sortable anObject){
			boolean flag=false;
			if(anObject instanceof ForeignStudent ){
				
			}else if(anObject instanceof SeniorStudent){
				
			}else if(anObject instanceof CanadianStudentUnder65){
				CanadianStudentUnder65 temp=(CanadianStudentUnder65)anObject;
				if (this.getStudentName().compareTo(temp.getStudentName()) < 0) {
					flag=true;
				}
			}
			return flag;
		}

}
