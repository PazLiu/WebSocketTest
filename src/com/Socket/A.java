package com.Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = new ServerSocket(8888);
		Socket socket = serverSocket.accept();

		BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		String line = is.readLine();
		System.err.println(line);

		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		printWriter.println("Receive data : " + line);
		printWriter.flush();

		printWriter.close();
		is.close();
		socket.close();
		serverSocket.close();
	}

}
