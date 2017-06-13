package com;

import java.util.StringTokenizer;

public class TestWorker {
	public static void main(String[] args) {
		Worker w1, w2, w3;
		w1 = new Worker("Robert  William Hunter", "23/10/2005", 35000.00);
		w2 = new Worker("John Smith", "15/11/2005", 25000.00);
		w3 = new Worker("Mary Jane Hull", "06/09/2007");
		w2.setSalary(20000.00);
		w2.setSupervisor(w1);
		w3.setSupervisor(w1);
		System.out.println("Number of workers = " + Worker.getHowManyWorkers()
				+ " \n");
		System.out.println("Supervisor of John is " + w2.getSupervisor());
		System.out.println(w1.toString() + " \n");
		System.out.println(w2.toString() + " \n");
		System.out.println(w3.toString() + " \n");
	}
}

class Worker {
	private static int HowManyWorkers = 0;
	private int workerNumber;
	private Name workerName;
	private float salary;
	private MyDate dateJoiningCompany;
	private Worker Supervisor;

	public static int getHowManyWorkers() {
		return HowManyWorkers;
	}

	public static void setHowManyWorkers(int howManyWorkers) {
		HowManyWorkers = howManyWorkers;
	}

	public int getWorkerNumber() {
		return workerNumber;
	}

	public void setWorkerNumber(int workerNumber) {
		this.workerNumber = workerNumber;
	}

	public Name getWorkerName() {
		return new Name(workerName);
	}

	public void setWorkerName(String workerName) {
		this.workerName = new Name(workerName);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = (float) salary;
	}

	public MyDate getDateJoiningCompany() {
		return dateJoiningCompany;
	}

	public void setDateJoiningCompany(MyDate dateJoiningCompany) {
		this.dateJoiningCompany = dateJoiningCompany;
	}

	
	public void setSupervisor(Worker supervisor) {
		Supervisor = supervisor;
	}

	public Name getSupervisor() {
		return new Name(this.Supervisor.workerName);
	}

	public Worker(String name, String dateJoiningCompany) {
		HowManyWorkers++;
		this.workerNumber = HowManyWorkers;
		this.workerName = new Name(name);
		this.dateJoiningCompany = new MyDate(dateJoiningCompany);
		this.salary = (float) 0.00;

	}

	public Worker(String name, String dateJoiningCompany, double salary) {
		this(name, dateJoiningCompany);
		this.salary = (float) salary;
	}

	public Worker(Worker workers) {
		this.workerName = new Name(workers.workerName);
		this.workerNumber = workers.workerNumber;
		this.dateJoiningCompany = new MyDate(workers.getDateJoiningCompany());
		this.salary = workers.salary;
		this.Supervisor = new Worker(workers.Supervisor);
	}

	public String toString() {
		if (Supervisor != null) {
			return this.workerNumber + "\n" + this.workerName.toString() + "\n"
					+ this.dateJoiningCompany.toString() + "\n"
					+ this.getSupervisor().toString() + "\n" + this.getSalary();
		} else {
			return this.workerNumber + "\n" + this.workerName.toString() + "\n"
					+ this.dateJoiningCompany.toString() + "\n"
					+ "this person doesn't have a surpervisor" + "\n"
					+ this.getSalary();
		}
	}
}

class Name {
	private String firstName;
	private String middlerName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddlerName() {
		return middlerName;
	}

	public void setMiddlerName(String middlerName) {
		this.middlerName = middlerName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Name(String aname) {
		getName(aname);

	}

	public Name(Name name) {
		this(name.toString());
	}

	public void setName(Name name1) {
		getName(name1.toString());

	}

	public String toString() {
		if (this.middlerName == null) {
			return this.lastName + "," + " " + this.firstName + " ";
		} else {
			return this.lastName + "," + " " + this.firstName + " "
					+ Character.toUpperCase(this.middlerName.charAt(0)) + ". ";
		}
	}

	public void getName(String name) {
		StringTokenizer getToken = new StringTokenizer(name);
		if (getToken.countTokens() == 2) {
			this.firstName = getToken.nextToken();
			this.middlerName = null;
			this.lastName = getToken.nextToken();
		} else if (getToken.countTokens() == 3) {
			this.firstName = getToken.nextToken();
			this.middlerName = getToken.nextToken();
			this.lastName = getToken.nextToken();
		}
	}
}
