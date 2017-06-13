package com;

public class Person {
	private Name personName;
	private Person spouse;

	public Person(String fullName) {
		personName = new Name(fullName);
	}

	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}

	public Name getName() {
		return personName;
	}

	public String toString() {
		if (spouse != null) {
			return personName.toString() + "\n " + "spouse name is: "
					+ spouse.personName.toString();
		}
		return personName.toString();
	}

	public double getFamilyIncome() {
		double singleIncome;
		double spouseIncome;
		double sumIncome;
		if (this instanceof NewWorker) {
			NewWorker otherNewWorker = (NewWorker) this;
			singleIncome = otherNewWorker.getSalary();
		} else {
			singleIncome = 0.0;
		}
		if (this.spouse != null) {
			if (this.spouse instanceof NewWorker) {
				NewWorker otherNewWorker1 = (NewWorker) this.spouse;
				spouseIncome = otherNewWorker1.getSalary();
			} else {
				spouseIncome = 0.0;
			}
			sumIncome = singleIncome + spouseIncome;
			return sumIncome;
		} else {

			return singleIncome;

		}
	}

}