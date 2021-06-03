package com.foxmula.Assignment3;

/**
 * @author Chirag Dalbanjan
 * 
 * Problem:
 * 		Write a program calculate frequency/occurrences of each element of an array 
 * 		and then sort by value and then print it.
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortFrequencyByValue {

	static void Fn(int arr[], LinkedHashMap<Integer, Integer> frequency) {

		List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequency.entrySet());

		Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> lhs, Map.Entry<Integer, Integer> rhs) {
				if (lhs.getValue() < rhs.getValue()) {
					return 1;
				} else {
					return 0;
				}
			}

		});

		System.out.println(entries);

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 2, 5, 7, 3, 2, 4, 5, 6, 2, 1 };
		CalculateFrequency calculateFrequency = new CalculateFrequency();
		HashMap<Integer, Integer> frequency = calculateFrequency.calcFrequency(arr);

		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>(frequency);

		Fn(arr, lhm);

		System.out.print(frequency);

	}

}
