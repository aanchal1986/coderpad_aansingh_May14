package org.capg.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static boolean printAnagrams(String input1, String input2) {
		// convert to chararray
		char[] string1 = input1.toCharArray();
		char[] string2 = input2.toCharArray();

		// if length is not equal of both the strings, strings are not anagrams
		if ((string1.length) != (string1.length))
			return false;
		// sort the strings
		Arrays.sort(string1);
		Arrays.sort(string2);
		// check both strings are equal or not
		if (Arrays.equals(string1, string2))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First string");
		String input1 = sc.nextLine();
		System.out.println("Enter the secoond string");
		String input2 = sc.nextLine();
		boolean result = printAnagrams(input1, input2);
		if (result)
			System.out.println("Given Strings are anagrams");
		else
			System.out.println("Given Strings are not  anagrams");

	}
}
