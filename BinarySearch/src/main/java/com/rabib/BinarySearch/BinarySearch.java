package com.rabib.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Binary Search
 * Recursive and Iterative way
 */
public class BinarySearch {

	private static int recursiveBinSearch(int[] array, int key, int lo, int hi) {
		while (lo <= hi) {
			int mid = (hi + lo) / 2;
			if (array[mid] < key) {
				recursiveBinSearch(array, key, mid + 1, hi);
			} else if (array[mid] > key) {
				recursiveBinSearch(array, key, lo, mid - 1);
			} else
				return mid;
		}
		return -1;
	}

	private static int search(int[] array, int key) {

		int beg = 0, end = array.length - 1;
		while (beg <= end) {
			int mid = beg + (end - beg) / 2;
			if (array[mid] < key) {
				beg = mid + 1;
			} else if (array[mid] > key) {
				end = mid - 1;
			} else
				return mid;

		}
		return -1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream inputStream = BinarySearch.class.getResourceAsStream("/input.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		int N = Integer.parseInt(reader.readLine());
		int[] number = new int[N];
		int counter = 0;
		String inputNumbers = reader.readLine();
		for (String s : inputNumbers.split(" ")) {
			number[counter] = Integer.parseInt(s);
			System.out.println(number[counter]);
			counter++;
		}
		Arrays.sort(number);
		int key = 30;
		System.out.println("Total=" + search(number, key) + " " + recursiveBinSearch(number, key, 0, N - 1));

	}

}
