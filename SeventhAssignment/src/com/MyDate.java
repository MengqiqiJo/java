package com;

import java.util.StringTokenizer;

public class MyDate {

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
