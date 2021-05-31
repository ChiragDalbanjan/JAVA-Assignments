package com.foxmula.assignments.problem3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Problem Statement: Write a program to traverse HashSet.
 *
 ** @author Chirag Dalbanjan
 */
public class Problem3 {

	void traverse(Set<Integer> set) {
		Iterator<Integer> iterator = set.iterator();
		System.out.println("Travarsing a set...");

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 9; i++) {
			set.add(i);
		}

		new Problem3().traverse(set);

	}

}
