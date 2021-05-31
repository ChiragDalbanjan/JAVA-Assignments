package com.foxmula.assignments.problem4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Problem Statement: Write a program to traverse TreeSet.
 *
 ** @author Chirag Dalbanjan
 */

public class Problem4 {
	void traverse(Set<Integer> set) {
		Iterator<Integer> iterator = set.iterator();
		System.out.println("Travarsing a set...");

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}

	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<Integer>();
		
		for (int i = 1; i < 9; i++) {
			ts.add(i);
		}
		
		new Problem4().traverse(ts);

	}

}
