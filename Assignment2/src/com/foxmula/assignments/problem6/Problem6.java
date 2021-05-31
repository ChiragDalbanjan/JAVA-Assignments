package com.foxmula.assignments.problem6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Problem Statement: Write a program to calculate occurrences of each element
 * of an array list.
 *
 ** @author Chirag Dalbanjan
 */
public class Problem6 {

	void pairs(ArrayList<Integer> al, int sum) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int val : al) {
			int diff = sum - val;

			if (hm.containsKey(diff)) {
				System.out.println("( " + val + " , " + diff + " )");
				hm.remove(diff);

			} else {
				hm.put(val, diff);
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);	
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(4);
		al.add(4);
		al.add(6);
		al.add(5);
		new Problem6().pairs(al, 9);

	}

}
