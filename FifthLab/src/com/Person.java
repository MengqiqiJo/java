package com;

public abstract class Person {
	private Name personName;
	private Person spouse;
	
	public abstract double getSalary();

	public Person(String fullName) {
		this.personName = new Name(fullName);
	}

	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}

	public Name getName() {
		return personName;
	}

	public String toString() {
		if (spouse != null) {
			return personName.toString() + "\n " + "married to : "
					+ spouse.personName.toString();
		}
		return personName.toString();
	}

	public double getFamilyIncome() {
		return (this.getSalary()+spouse.getSalary());
	}

}