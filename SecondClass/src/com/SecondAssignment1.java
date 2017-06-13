package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SecondAssignment1 {

	public static void main(String[] args) {
		// String getInput="(24/25 ) ; ( 40/80) ;( 91) ; (22/25)";
		System.out.print( "please enter your grades:" ) ;
		Scanner keyboard = new Scanner( System.in ) ;
		String getInput = keyboard.nextLine() ;
		String strNew = getInput.replaceAll("\\s","") ;
		StringTokenizer str = new StringTokenizer(strNew, "();") ;
		int count=str.countTokens();
		int sum = 0 ;
		double average = 0.0 ;
		int i = 0 ;
		while ( str.hasMoreTokens() ) {
			String str1 = str.nextToken() ;
			if ( str1.matches("[\\d]*") ) {
				sum += Integer.parseInt( str1 ) ;
			} else if ( str1.matches("([\\d]*/[\\d]*)") ) {
				StringTokenizer str3 = new StringTokenizer(str1, "/") ;
				int[] array = new int[2] ;
				for (i = 0 ; i < array.length ; i++ ) {
					String token = str3.nextToken() ;
					array[i] = Integer.parseInt(token) ;
				}
				sum += array[0] * 100 / array[1] ;
			}
		}
		average = sum / count ;
		System.out.print( "your average is: " + average +"%") ;
	}

}
