package com;

public class HouseHold {
	Person[] householdMembers;
	private int counter=0;
	public HouseHold(){
		householdMembers=new Person[10];
	}
	public HouseHold(int i){
		householdMembers=new Person[i];
	}
	public void insertNewHouseholdMember(Person houseHoldMember){	
	if(counter==householdMembers.length){
		System.out.println("error");
		System.exit(0);
		
	}else{
			householdMembers[counter]=houseHoldMember;			
		    counter++;
	}
	}
	public String toString(){
		String a="";
		for(Person p: householdMembers){
			a=a+p.toString()+"\n";		
		}
		return a;
	}
	

}
