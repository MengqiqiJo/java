package com;

import java.util.StringTokenizer;

public class Lab3Tester {
	public static void main(String args[]) {
		MyDate dateArray1[], dateArray2[], anotherDate;
		int index1, index2;

		dateArray1 = new MyDate[3]; // Create an array of MyDate
		dateArray1[0] = new MyDate("26/05/1999"); // Create three elements of
													// dataArray1 by creating
													// three objects of class
													// MyDate
		dateArray1[1] = new MyDate("08/06/1994");
		dateArray1[2] = new MyDate("15/03/2000");

		dateArray2 = new MyDate[3];
		dateArray2[0] = new MyDate("25/05/1999"); // Create three elements of
													// dataArray1 by creating
													// three objects of class
													// MyDate
		dateArray2[1] = new MyDate("25/01/2000");
		dateArray2[2] = new MyDate("26/05/1999");

		for (index2 = 0; index2 < dateArray2.length; index2++) {
			for (index1 = 0; index1 < dateArray1.length; index1++) {
				if (dateArray2[index2].lessThan(dateArray1[index1])) // Compare
																		// each
																		// elements
																		// in
																		// dataArray1
																		// with
																		// each
																		// element
																		// of
																		// dateArray2
					System.out.println(dateArray2[index2].toString()
							+ " is less than " + dateArray1[index1].toString());
				else
					System.out.println(dateArray2[index2].toString()
							+ " is not less than "
							+ dateArray1[index1].toString() + " \n");
			}
		}

		if (dateArray2[2].equals(dateArray1[0])) {
			System.out.println(dateArray2[2].toString()
					+ " is the same date as " + dateArray1[0].toString());

		} else {
			System.out.println("Cannot happen!!");
		}

		if (dateArray2[2].equals(dateArray1[1])) {
			System.out.println(dateArray2[2].toString()
					+ " is not the same date as " + dateArray1[0].toString()
					+ "\n are you sure this is OK?");

		} else {
			System.out.println("You got it right!!");
		}

		anotherDate = new MyDate(dateArray2[1]);
		if (dateArray2[1].equals(anotherDate)) {
			System.out.println(dateArray2[1] + " is the same date as "
					+ anotherDate);

		} else {
			System.out.println("Are you sure???");
		}

	}
}

class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(String inputDate) {
		StringTokenizer getStrTokenizer = new StringTokenizer(inputDate,"/");
		if (getStrTokenizer.countTokens() == 0) {
			System.out.print("Fatal Error.");
			System.exit(0);
		}
		this.day = Integer.parseInt(getStrTokenizer.nextToken());
		this.month = Integer.parseInt(getStrTokenizer.nextToken());
		this.year = Integer.parseInt(getStrTokenizer.nextToken());

	}

	public MyDate(MyDate dateArray2) {
		if (dateArray2 == null) {
			System.out.println("Fatal Error.");
			System.exit(0);

		}
		this.day = dateArray2.day;
		this.month = dateArray2.month;
		this.year = dateArray2.year;

	}

	public String monthToString() {
		switch(this.month){
		case 01:
			return "January";
		case 02:
			return "February";
		case 03:
			return "March";
		case 04:
			return "April";
		case 05:
			return "May";
		case 06:
			return "June";
		case 07:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "Octomber";
		case 11:
			return "November";
		case 12:
			return "December";
			default:
				return "error";
		}
	}

	public String toString() {
		String aYear=this.year+"";
		return monthToString() + " " + day + "," + " " + "'"
				+ aYear.substring(2,4);
	}

	public boolean lessThan(MyDate myDate) {
		boolean isLess = false;
		if (myDate == null) {
			System.out.println("Fatal Error.");
			System.exit(0);
		}
		if (this.year < myDate.year) {
			isLess = true;
		} else if (this.year == myDate.year) {
			if (this.month < myDate.month) {
				isLess = true;
			} else if (this.month == myDate.month) {
				if (this.day < myDate.day) {
					isLess = true;
				}
			}
		}
		return isLess;
	}

	public boolean equals(MyDate myDate) {
		boolean isEqual = false;
		if (myDate == null) {
			System.out.println("Fatal Error.");
			System.exit(0);
		}

		if (this.year == myDate.year) {
			if (this.month == myDate.month) {
				if (this.day == myDate.day) {
					isEqual = true;
				}
			}
		}
		return isEqual;
	}

}
