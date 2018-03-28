package com.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static void socketTest() throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 8888);

		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		printWriter.println("Client data");
		printWriter.flush();

		String line = is.readLine();
		System.out.println("====" + line);
		printWriter.close();
		is.close();
		socket.close();
	}

	private static void nioSocketTest() {

	}

}
