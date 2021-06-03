package com.foxmula.Assignment3;

/**
 * @author Chirag Dalbanjan
 * 
 * Problem:
 * 		Write a program to calculate frequency/occurrences of each element of an array.
 *
 */

import java.util.HashMap;


public class CalculateFrequency {

	private HashMap<Integer, Integer> ans;
	private int arr[] = { 1, 2, 3, 4, 5, 2, 5, 7, 3, 2, 4, 5, 6, 2, 1 };

	HashMap<Integer, Integer> calcFrequency(int[] array) {
		HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		for (int value_from_array : array) {
			frequency.putIfAbsent(value_from_array, 0);
			frequency.put(value_from_array, frequency.get(value_from_array) + 1);

		}

		return frequency;

	}

	public static void main(String[] args) {
		CalculateFrequency calculateFrequency = new CalculateFrequency();
		calculateFrequency.ans = calculateFrequency.calcFrequency(calculateFrequency.arr);

		for (int key : calculateFrequency.ans.keySet()) {
			System.out.println("Frequency of " + key + " is " + calculateFrequency.ans.get(key));
		}

	}

}
