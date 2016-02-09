package com.rabib.StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * Stack of String
 *
 */
public class StackOfString {
	private Node first = null;

	private class Node {
		String item;
		Node next;
	}

	@SuppressWarnings("unused")
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
		InputStream inputStream = StackOfString.class.getResourceAsStream("/input.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		StackOfString object = new StackOfString();
		String inputNumbers = reader.readLine();
		for (String s : inputNumbers.split(" ")) {
			object.push(s);
			//System.out.println(object.pop());
			
		}
		object.travarse();
	}

}
