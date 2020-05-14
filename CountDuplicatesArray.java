package org.capg.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDuplicatesArray {

	public static void findDuplicateinArrays(int[] a1, int[] a2, int[] a3) {
		// Remove duplicates from each array
		HashSet<Integer> hs1 = new HashSet<Integer>();
		for (int i = 0; i < a1.length; i++) {
			hs1.add(a1[i]);

		}
		HashSet<Integer> hs2 = new HashSet<Integer>();
		for (int j = 0; j < a2.length; j++) {
			hs2.add(a2[j]);

		}
		HashSet<Integer> hs3 = new HashSet<Integer>();
		for (int k = 0; k < a3.length; k++) {
			hs3.add(a3[k]);

		}

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		ArrayList<Integer> a4 = new ArrayList<Integer>();

		for (Integer a : hs1) {

			if (hm.containsKey(a))
				hm.put(a, hm.get(a) + 1);
			else
				hm.put(a, 1);
		}

		for (Integer b : hs2) {
			if (hm.containsKey(b))
				hm.put(b, hm.get(b) + 1);
			else
				hm.put(b, 1);
		}

		for (Integer c : hs3) {
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}

		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
		for (Map.Entry<Integer, Integer> e : es) {

			if (e.getValue() == 3) {
				Integer element = e.getKey();
				Integer count = e.getValue();
				a4.add(element);
			}

		}

		System.out.println(a4);

	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 5, 7, 9 };
		int[] arr3 = { 1, 3, 4, 5, 8 };
		findDuplicateinArrays(arr1, arr2, arr3);

	}
}
