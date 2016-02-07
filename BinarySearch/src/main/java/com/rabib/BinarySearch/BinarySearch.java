package com.rabib.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.rabib.TripleSum.TripleSum;

/**
 * Hello world!
 *
 */
public class BinarySearch 
{
	private static int[] search(int[] a) {
		
		
		return a;
	}
    public static void main( String[] args )
    {
    	InputStream inputStream = TripleSum.class.getResourceAsStream("/8ints.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		int N = Integer.parseInt(reader.readLine());
		int[] number = new int[N];
		int counter =0;
			String inputNumbers = reader.readLine();
			for(String s:inputNumbers.split(" "))
			{
				number[counter] = Integer.parseInt(s);
				System.out.println(number[counter]);
				counter++;
			}	
		Arrays.sort(number);
		System.out.println("Total=" +count(number));

	}

    }
}
