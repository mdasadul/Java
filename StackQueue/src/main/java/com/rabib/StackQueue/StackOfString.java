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
	private String[] array;
	private int top;
	
	StackOfString(int N){
		array = new String[N];
		top =0;
	}
	
	private void arrayPush(String item) {
		array[top]=item;
		top++;
	}
	
	private String arrayPop() {
		top--;
		
		return array[top];
	}
	
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
	
		String inputNumbers = reader.readLine();
		StackOfString object = new StackOfString(inputNumbers.length());
		for (String s : inputNumbers.split(" ")) {
			object.push(s);
			object.arrayPush(s);
			
			System.out.println(object.arrayPop());
			
		}
		//object.travarse();
	}

}
