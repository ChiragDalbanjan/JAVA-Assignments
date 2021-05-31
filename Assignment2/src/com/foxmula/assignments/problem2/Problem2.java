
package com.foxmula.assignments.problem2;

/**
 * Problem Statement:
 *		Write a program to check whether Set contains an element
 *
 ** @author Chirag Dalbanjan
 */

import java.util.HashSet;
import java.util.Scanner;

public class Problem2 {

	boolean contains(HashSet<Integer> set, int num) {

		for (int temp : set) {
			if (temp == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		int findNumInArrayList;
		boolean isContains = false;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 9; i++) {
			set.add(i);
		}

		System.out.print("Enter number to find in ArrayList: ");
		findNumInArrayList = sc.nextInt();

		isContains = new Problem2().contains(set, findNumInArrayList);

		if (isContains) {
			System.out.print("\nHashSet contains " + findNumInArrayList);

		} else {
			System.out.print("\nHashSet doesn't contains " + findNumInArrayList);

		}

		sc.close();

	}

}
