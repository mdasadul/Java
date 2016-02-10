package com.rabib.StackQueue;

import java.io.IOException;

public class LinkedQueueOfString {

	private Node front, rear;
	private class Node{
		String item;
		Node next;
	}
	LinkedQueueOfString(){
		front = null;
		rear = null;
	}
	private void enqueue(String item) {
		Node node = new Node();
		node.item = item;
		if(rear !=null) {
			rear.next = node;
		}
		rear =node;
		
		if( front == null) {
			front = node;
		}
		
	}
	
	private String dequeue() {
		String item = front.item;
		front =front.next;
		return item;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ReadInput inpObj = new ReadInput("input.txt");
		String inputNumbers = inpObj.getInputs();
		LinkedQueueOfString object = new LinkedQueueOfString();
		for (String s : inputNumbers.split(" ")) {
			object.enqueue(s);
			
			
			System.out.println(object.dequeue());
			
		}
		//object.travarse();
	}
}
