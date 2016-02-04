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

		InputStream inputStream = TripleSum.class.getResourceAsStream("/tinyUF.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		int N = Integer.parseInt(reader.readLine()), first, second;
		
		int counter = 0;
		String temp;
		while (counter < N) {
			temp = reader.readLine();
			first = Integer.parseInt(temp.split(" ")[0]);
			second = Integer.parseInt(temp.split(" ")[1]);
			if (uf.isconnect(first, second) == false) {
				uf.union(first, second);
			}
			System.out.println(first + " " + second);
			uf.displayL();

			counter++;
		}

		// String theString = IOUtils.toString(inputStream, "UTF-8");
		// System.out.println("Hello World!" + theString);

	}
}
