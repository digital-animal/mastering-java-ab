package com.zahid.echoserver;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.lang.Thread;

public class EchoServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(4999);
        System.out.println("[Server] Waiting for clients..");
        Thread.sleep(1000);
		Socket soc = ss.accept();
		
		System.out.println("[Server] Connected with client.");
        Thread.sleep(1000);
        System.out.println("[Server] Connection eastablished.");
        Thread.sleep(1000);
        System.out.println("[Server] Receiving packets.");
        Thread.sleep(1000);
        DataInputStream dis = new DataInputStream(soc.getInputStream());
        String str = dis.readUTF();
        
        System.out.println("[Server] Received: "+str);
        Thread.sleep(1000);
        System.out.println("[Server] Sending back packets: "+str);
        Thread.sleep(1000);
        // now server should send back what it received from the client
        DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
        dos.writeUTF(str);
        System.out.println("[Server] Packet sent back: "+str);
        Thread.sleep(1000);
        
        dos.close();
        dis.close();
        soc.close();
        ss.close();
        System.out.println("[Server] Connection closed");
    }
}