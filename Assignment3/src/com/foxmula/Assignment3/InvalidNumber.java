package com.foxmula.Assignment3;

/**
 * @author Chirag Dalbanjan
 * 
 * Problem:
 * 		Write a program which will take a number as input. 
 * 		If number is prime and odd, 
 * 		then it will throw Custom Exception with proper message Number is invalid.
 */

import java.util.Scanner;

public class InvalidNumber {
	final static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int _digit;

		System.out.println("Enter a digit: ");
		_digit = scanner.nextInt();
		try {
			if (_digit == 2) {
				throw new InvalidNumberException("Number Prime as well as Odd -> Number is Invalid");
			}
		}
		catch(InvalidNumberException exception){
			System.out.print(exception);;
		}			

	}

}
