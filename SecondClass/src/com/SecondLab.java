package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SecondLab {

	public static void main(String[] args) {
		System.out.print("please enter a String:");
		Scanner keyboard = new Scanner(System.in);
		StringTokenizer str = new StringTokenizer(keyboard.nextLine());
		String longestStr = "";
		int count = 0;
		while (str.hasMoreTokens()) {
			String getToken = str.nextToken();
			System.out.println(getToken);
			for (int i = 0; i < getToken.length(); i++) {
				String test = "aeiouAEIOU";
				int flagnumber = test.indexOf(getToken.charAt(i));
				if (flagnumber > -1) {
					count++;
				}
			}
			if (getToken.length() > longestStr.length()) {
				longestStr = getToken;
			}
		}

		System.out.print("the longest string is:" + longestStr + "\n");
		System.out.println("the number of vowels is:" + count);

	}

}
