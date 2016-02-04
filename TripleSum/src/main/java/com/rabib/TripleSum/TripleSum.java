package com.rabib.TripleSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * Hello world!
 *
 */
public class TripleSum 
{
	public static void main(String[] args) throws IOException {

		InputStream inputStream = TripleSum.class.getResourceAsStream("/8ints.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		int N = Integer.parseInt(reader.readLine());
		
		int counter = 0;
		String temp;
		while (counter < N) {
			temp = reader.readLine();
			for(String s:temp.split(" "))
			{
				System.out.println(s);
			}
			
			counter++;
		}

		// String theString = IOUtils.toString(inputStream, "UTF-8");
		// System.out.println("Hello World!" + theString);

	}
}
