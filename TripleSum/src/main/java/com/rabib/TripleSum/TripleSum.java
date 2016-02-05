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
	public static int count(int[] numbers) {
		int total = 0,N=numbers.length;
		for(int i =0;i<N;i++) {
			for(int j=0; j<N; ++j) {
				for(int k=0;k<N;++k)
				{
					if(numbers[i]+numbers[j]+numbers[k] ==0) {
						total +=1;
					}
				}
			}
		}
		System.out.println(total);
		return total;
	}
	public static void main(String[] args) throws IOException, NullPointerException {

		InputStream inputStream = TripleSum.class.getResourceAsStream("/8ints.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		int N = Integer.parseInt(reader.readLine());
		int[] number = new int[N];
		int counter =0;
			String inputNumbers = reader.readLine();
			for(String s:inputNumbers.split(" "))
			{
				number[counter] = Integer.parseInt(s);
				System.out.println(s);
			}	
		System.out.println(count(number));

	}
}
