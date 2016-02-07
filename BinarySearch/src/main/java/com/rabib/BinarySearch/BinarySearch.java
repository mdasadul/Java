package com.rabib.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Binary Search
 *
 */
public class BinarySearch {

	private static int search(int[] array, int key) {
		int index = -1;
		int beg = 0, end = array.length -1;
		while(beg<end) {
			int mid = (beg+end)/2;
			if(array[mid] <key) {
				beg = mid +1;
			}else if(array[mid]>key) {
				end = mid -1;
			}else if(array[mid] ==key) {
				index = mid;
				break;
						
			}
			
		}
		return index;
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
		System.out.println("Total=" + search(number, key));

	}

}
