package com.rabib.StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class QueueOfStrings {
	private String[] array;
	private int front, rear;

	private class Node {
		String item;
		Node front, rear;
	}

	QueueOfStrings(int N) {
		front = 0;
		rear =0;
		array = new String[N];
	}

	private void enqueue(String item) {

		array[front++] = item;
	}
	private boolean isEmpty() {
		return front==rear;
	}

	private String dequeue() {

		return array[rear++];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream inputStream = StackOfString.class.getResourceAsStream("/input.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

		String inputNumbers = reader.readLine();
		QueueOfStrings object = new QueueOfStrings(inputNumbers.length());
		for (String s : inputNumbers.split(" ")) {
			object.enqueue(s);
			// object.arrayPush(s);

			System.out.println(object.dequeue());

		}
		// object.travarse();
	}
}
