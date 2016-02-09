package com.rabib.StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class QueueOfStrings {
	private String[] array;
	private int front, rear;
	
	private class Node{
		String item;
		Node front, rear;
	}
	QueueOfStrings(int N) {
		array = new String[N];
	}
	private void enqueue(String item) {
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream inputStream = StackOfString.class.getResourceAsStream("/input.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

		String inputNumbers = reader.readLine();
		StackOfString object = new StackOfString(inputNumbers.length());
		for (String s : inputNumbers.split(" ")) {
			object.push(s);
			object.arrayPush(s);

			System.out.println(object.arrayPop());

		}
		// object.travarse();
	}
}
