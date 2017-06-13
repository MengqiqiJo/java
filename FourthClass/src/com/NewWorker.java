package com;

public class NewWorker extends Person {
	private static int howManyWorkers = 0;
	private int workerNumber;
	private MyDate dateJoiningCompany;
	private double salary;
	private NewWorker supervisor;

	public NewWorker(String workerName, String joiningdate) {
		super(workerName);
		dateJoiningCompany = new MyDate(joiningdate);
		this.salary = 0.0;
		howManyWorkers++;
		workerNumber = howManyWorkers;
	}

	public NewWorker(String workerName, String joiningdate, double salary) {
		this(workerName, joiningdate);
		this.salary = salary;
	}

	public boolean equals(NewWorker aNewWorker) {
		if (this.workerNumber == aNewWorker.workerNumber) {
			return true;
		}
		return false;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSupervisor(NewWorker supervisor) {
		this.supervisor = supervisor;
	}

	public Name getSupervisor() {
		if (supervisor != null)
			return this.supervisor.getName();
		else {
			return null;
		}
	}

	public static int getHowManyWorkers() {
		return howManyWorkers;
	}

	public int getWorkerNumber() {
		return workerNumber;
	}

	public void setWorkerNumber(int workerNumber) {
		this.workerNumber = workerNumber;
	}

	public MyDate getDateJoiningCompany() {
		return dateJoiningCompany;
	}

	public void setDateJoiningCompany(MyDate dateJoiningCompany) {
		this.dateJoiningCompany = dateJoiningCompany;
	}

	public static void setHowManyWorkers(int howManyWorkers) {
		NewWorker.howManyWorkers = howManyWorkers;
	}

	public String toString() {

		if (getSupervisor() == null) {
			return super.toString() + "\n" + "salary: " + this.getSalary()
					+ "\n";
		} else {
			return super.toString() + "\n" + "supervisor is: "
					+ this.getSupervisor() + "\n" + "salary: "
					+ this.getSalary() + "\n";

		}

	}

}