package com.rabib.StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadInput {
	private String inputs;

	public ReadInput(String filename) throws IOException {
		InputStream inputStream = ReadInput.class.getResourceAsStream("/" + filename);
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

		setInputs(reader.readLine());
	}

	public String getInputs() {
		return inputs;
	}

	public void setInputs(String inputs) {
		this.inputs = inputs;
	}

}
