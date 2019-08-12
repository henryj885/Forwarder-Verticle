package com.henry.forwarder;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import com.github.arteam.simplejsonrpc.client.Transport;

public class TP implements Transport {
	public String pass(String request) throws IOException {
		System.out.println("request=" + request);
		String response = "";
		try {
			// create client socket, connect to server
			Socket clientSocket = new Socket("10.0.31.18", 6345);
			// create input stream attached to socket
			BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			// create output stream attached to socket
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
			// send request to server
			outToServer.writeBytes(request);
			// read line from server
			String str = null;
			if ((str = inFromServer.readLine()) != null) {
				response += str;
			}
			clientSocket.close();
			// System.out.println("response2" + response);
			return response;
		} catch (Exception ex) {
		}
		System.out.println("response" + response);
		return response;
	}
}