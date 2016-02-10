package com.rabib.StackQueue;

import java.io.IOException;

public class LinkedStackOfString {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ReadInput inpObj = new ReadInput("input.txt");
		String inputNumbers = inpObj.getInputs();
		LinkedStackOfString object = new LinkedStackOfString();
		for (String s : inputNumbers.split(" ")) {
			object.push(s);
			object.arrayPush(s);
			
			System.out.println(object.arrayPop());
			
		}
		//object.travarse();
	}
}
