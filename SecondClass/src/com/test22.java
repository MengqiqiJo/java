package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test22 {

	public static void main(String[] args) {
		String firstName = "";
		String salutation = "";
		String mediumname = "";
		String lastname = "";
		int flagNum = 1;
		System.out.print("please enter your name:");
		Scanner keyboard = new Scanner(System.in);
		String inputString = keyboard.nextLine();
		StringTokenizer str1 = new StringTokenizer(inputString);
		String getFirstToken = str1.nextToken();

		if (getFirstToken.matches("(M[r|s])")) {
			salutation = getFirstToken;
		} else if (getFirstToken.matches("[A-Z](1|[a-z]+)")) {
			firstName = getFirstToken;
			System.out.print("first name is: " + firstName + "\n");
		} else {
			System.out.print("please enter a valid name");
		}
		while (str1.hasMoreTokens()) {
			int count = str1.countTokens();
			String getSecondToken = str1.nextToken();
			if (count == 2 && getSecondToken.matches("[A-Z]([.]|1|[a-z]+)")) {
				mediumname = getSecondToken;
			} else if (getSecondToken.matches("[A-Z](1|[a-z]+)")) {
				if (flagNum == 1) {
					firstName = getSecondToken;
					flagNum++;
				} else {
					lastname = getSecondToken;
					System.out.print("last name is: " + lastname + "\n");
				}
			}
		}
	}

}