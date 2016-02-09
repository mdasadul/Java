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
public class StackQueue {
	private Node first = null;

	private class Node {
		String item;
		Node next;
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void push(String item) {
		Node newnode = first;
		first = new Node();
		first.item = item;
		first.next = newnode;
	}

	public String pop() {
		String item = first.item;
		first = first.next;
		return item;
	}
	private void travarse() {
		Node node=first;
		while(node!=null) {
			System.out.println(node.item);
			node = node.next;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream inputStream = StackQueue.class.getResourceAsStream("/input.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		StackQueue object = new StackQueue();
		String inputNumbers = reader.readLine();
		for (String s : inputNumbers.split(" ")) {
			object.push(s);
			//System.out.println(object.pop());
			
		}
		object.travarse();
	}

}
