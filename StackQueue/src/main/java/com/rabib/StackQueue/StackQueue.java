package com.rabib.StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * Hello world!
 *
 */
public class StackQueue 
{
	private Node first;
	private class Node{
		String item;
		Node next;
	}
	public void push(String item) {
		Node newnode = first;
		first = new Node();
		first.item = item;
		first.next = newnode;
	}
	
	
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	InputStream inputStream = StackQueue.class.getResourceAsStream("/8ints.txt");
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
		
	}
    
}
