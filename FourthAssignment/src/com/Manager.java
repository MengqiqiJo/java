package com;

public class Manager extends NewWorker {
	private NewWorker employeesSupervised[] = new NewWorker[10];
	private int numWorkersSupervised = 0;

	public Manager(String workerName, String joiningdate) {
		super(workerName, joiningdate);
	}

	public Manager(String workerName, String joiningdate, double salary) {
		super(workerName, joiningdate, salary);
	}

	public double getSalary() {
		double sum = 0;
		sum = super.getSalary() + 100 * numWorkersSupervised;
		return sum;
	}

	public void addWorker(NewWorker w) {
		employeesSupervised[numWorkersSupervised] = w;
		numWorkersSupervised++;
	}

	public void deleteWorker(NewWorker w) {

		for (int count = 0; count < numWorkersSupervised; count++) {
			if (employeesSupervised[count].equals(w)) {
				employeesSupervised[count] = null;
				employeesSupervised[count] = employeesSupervised[numWorkersSupervised - 1];
				employeesSupervised[numWorkersSupervised - 1] = null;
				break;
			}
		}
		numWorkersSupervised--;
	}

	public String toString() {
		String name = "";
		for (int count = 0; count < numWorkersSupervised; count++) {
			name += employeesSupervised[count].getName() + "\n";
		}

		return "this employee's name is:" + super.getName() + "\n"
				+ "this employee's workernumber is: " + super.getWorkerNumber()
				+ "\n" + super.getDateJoiningCompany() + "\n"
				+ "this employee's salary is: " + this.getSalary() + "\n"
				+ "total supervised number is: " + this.numWorkersSupervised
				+ "\n" + "supervisor is: " + super.getSupervisor() + "\n"
				+ "The names of all workers supervised by this person is:\n"
				+ name;

	}
}
