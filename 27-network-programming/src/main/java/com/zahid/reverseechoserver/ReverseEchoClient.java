package com.zahid.reverseechoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ReverseEchoClient {

	public static void main(String[] args) throws IOException {
		
		Socket soc = new Socket("127.0.0.1", 2000);
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		PrintStream ps = new PrintStream(soc.getOutputStream());

		String msg;
		
		while(true) {
			System.out.print("From Client: ");
			msg = kb.readLine();
			ps.println(msg);
			msg = br.readLine();
			System.out.print("From Server: " + msg);
			
			if(msg.equals("dne")) break;
			System.out.println();
		}

		soc.close();
	}

}
