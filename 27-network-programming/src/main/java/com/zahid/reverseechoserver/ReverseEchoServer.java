package com.zahid.reverseechoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEchoServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(2000);
		Socket stk = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());

		String msg;
		StringBuilder sb;
		
		while(true) {
			msg = br.readLine();
			sb = new StringBuilder(msg);
			sb.reverse();
			msg = sb.toString();
			ps.println(msg);
			
			if(msg.equals("dne")) break;
		}
		
		stk.close();
		ss.close();
	}

}
