package com.acadgild;

import java.util.Scanner;

/**
 * 
 * Prgram to convert integer to String using String class method valueof
 *
 */
public class Session7Assignment1 {
	public static void main(String args[]) {
		// Accept a number
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		// Use valueof method to covert the integer to String
		System.out.println("Converting integer " + num + " to String " + String.valueOf(num));
		s.close();
	}
}
