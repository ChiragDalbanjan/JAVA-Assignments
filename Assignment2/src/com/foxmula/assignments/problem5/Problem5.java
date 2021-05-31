
package com.foxmula.assignments.problem5;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Problem Statement: 
 * 		Write a program to calculate occurrences of each element of an array list.
 *
 ** @author Chirag Dalbanjan
 */
 
public class Problem5 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(2);
		al.add(1);
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int temp : al) {
			if(hm.containsKey(temp)) {
				hm.put(temp, hm.get(temp)+1);
			}
			else {
				hm.put(temp, 1);
			}
		}
		
		hm.forEach((k,v) -> System.out.println("Occurance of "+k+" is "+v));
		

	}

}
