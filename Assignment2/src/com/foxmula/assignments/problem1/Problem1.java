package com.foxmula.assignments.problem1;

/**
 * Problem Statement:
 *		Write a program to check whether an array list contains an element or not.
 *
 ** @author Chirag Dalbanjan
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

	boolean contains(ArrayList<Integer> list, int num) {
		for (int temp : list) {
			if (temp == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
		int findNumInArrayList;
		boolean isContains = false;

		for (int i = 1; i < 9; i++) {
			arrayList.add(i);
		}

		System.out.print("Enter number to find in ArrayList: ");
		findNumInArrayList = sc.nextInt();

		isContains = new Problem1().contains(arrayList, findNumInArrayList);

		if (isContains) {
			System.out.print("\nArrayList contains " + findNumInArrayList);

		} else {
			System.out.print("\nArrayList doesn't contains " + findNumInArrayList);

		}

		sc.close();

	}

}
