package com.rabib.TripleSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * Solving triple sum problem with complexity N^2
 *
 */
public class TripleSum 
{
	public static int count(int[] numbers) {
		int total = 0,N=numbers.length,a,b,c;
		for(int i =0;i<N;i++) {
			a=numbers[i];
			int start = i+1, end= N-1;
			
			while(start<end) {
				b= numbers[start];
				c = numbers[end];
				if(a+b+c ==0) {
					System.out.println(a+" "+b+" "+c);
					total++;
					start++;
					end--;
				}else if(a+b+c<0) {
					start++;
				}else {
					end--;
				}
			}
		}
		
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
				System.out.println(number[counter]);
				counter++;
			}	
		Arrays.sort(number);
		System.out.println("Total=" +count(number));

	}
}
