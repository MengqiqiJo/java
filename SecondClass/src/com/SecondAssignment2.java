package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SecondAssignment2 {

	public static void main(String[] args) {
		System.out.print("please enter the date: ");
		Scanner keyboard = new Scanner(System.in);
		String getInput = keyboard.nextLine();
		StringTokenizer str1 = new StringTokenizer(getInput, "[/-]");
		String getDay = str1.nextToken();
		if (getDay.matches("(0[1-9]|[1-2][0-9]|3[0-1])")) {
			System.out.print("day:" + getDay + "\n");
		} else {
			System.out.print("you entered an invalid date of day\n");
			return;
		}
		String getMonth = str1.nextToken();
		if (getMonth.matches("(0[1-9]|1[0-2])")) {
			System.out.print("month:" + getMonth + "\n");
		} else {
			System.out.print("you entered an invalid date of month\n");
			return;
		}
		String getYear = str1.nextToken();
		if (getYear.matches("(0[0-9]|1[1-4])")) {
			System.out.print("year:" + getYear + "\n");
		} else {
			System.out.print("you entered an invalid date of year\n");
			return;
		}

	}

}
