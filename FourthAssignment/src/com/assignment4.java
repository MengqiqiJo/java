package com;

public class assignment4 {
	public static void main(String a[]) {
		NewWorker w1, w2, w3, w4, w5;
		Manager m1, m2;
		;

		m1 = new Manager("Edward Teller", "15/06/2016", 10000.00);
		m2 = new Manager("Liz Powell", "14/06/2016", 20000.00);

		w1 = new NewWorker("Robert William Hunter", "23/10/2005", 35000.00);
		w2 = new NewWorker("John Smith", "15/11/2005", 25000.00);
		w3 = new NewWorker("Mary Jane Hull", "06/09/2007", 50000.00);
		w4 = new NewWorker("Richard M. Harry", "01/08/2004", 70000.00);
		w5 = new NewWorker("Jessica Chowhan", "21/01/2006", 30000.00);

		w2.setSupervisor(m1);
		w3.setSupervisor(m2);
		w1.setSupervisor(m1);
		w5.setSupervisor(m2);
		w3.setSupervisor(m1);
		m1.setSupervisor(m2);

		m1.addWorker(w1);
		m1.addWorker(w2);
		m1.addWorker(w3);
		m2.addWorker(w4);
		m2.addWorker(w5);
		m2.addWorker(m1);

		System.out.println("m1 is :\n" + m1.toString() + "\n");
		System.out.println("m2 is :\n" + m2.toString() + "\n");
		m2.deleteWorker(w4);
		System.out.println("after deleteing " + w4 + "\n" + "m2 is :\n" + m2);
	}

}
