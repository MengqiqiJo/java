package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SencondLabPart2 {

	public static void main(String[] args) {
		System.out.print("please enter your name:");
		Scanner keyboard = new Scanner(System.in);
		String inputString = keyboard.nextLine();
		StringTokenizer str1 = new StringTokenizer(inputString);
		int tokenLength = str1.countTokens();
		String[] getName = new String[tokenLength];
		int i = 0;
		while (str1.hasMoreTokens()) {
			String temp = str1.nextToken();
			getName[i] = temp;
			i++;
		}
		if (getName[0].matches("(Dr|Mrs|Miss)")) {
			System.out.print("please enter a valid salutation\n");
			return;
		} else if (getName[0].matches("M[r|s]")) {
			if (!getName[1].matches("[A-Z][a-z]+")) {
				System.out.print("please enter a valid first name4");
				return;
			} else {
				System.out.print("firstname is: " + getName[1] + "\n");
			}
			if (tokenLength == 4) {
				if (!getName[2].matches("[A-Z](\\.|[a-z]+)")) {
					System.out.print("please enter a valid medium name1\n");
				}
			}
		} else if (getName[0].matches("[A-Z][a-z]+")) {
			System.out.print("firstname is: " + getName[0] + "\n");
			if (tokenLength == 3) {
				if (!getName[1].matches("[A-Z](\\.|[a-z]+)")) {
					System.out.print("please enter a valid medium name2\n");
					return;
				}
			}
		} else {
			System.out.print("please enter a valid first name3");
			return;
		}
		if (getName[tokenLength - 1].matches("[A-Z][a-z]+")) {
			System.out.print("lastname is: " + getName[tokenLength - 1] + "\n");
		} else {
			System.out.print("please enter a valid last name4\n");
			return;
		}
	}
}