package com.zahid.factorialserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static void main(String[] args) throws Exception {
        System.out.println("[Server] Starting..");
        Thread.sleep(2000);

        ServerSocket ss = new ServerSocket(4923);
        System.out.println("[Server] Waiting for clients..");
        Thread.sleep(2000);

        Socket soc = ss.accept();
        System.out.println("[Server] Client request accepted..");
        System.out.println("[Server] Connection established..");
        Thread.sleep(2000);

        DataInputStream dis = new DataInputStream(soc.getInputStream());
        int num = dis.readInt();
        System.out.println("[Server] Reading number from client..");
        Thread.sleep(2000);

        int result = fact(num);

        System.out.println("[Server] Calculating factorial..");
        Thread.sleep(2000);

        DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
        dos.writeInt(result);
        System.out.println("[Server] Sending back result to client..");
        Thread.sleep(2000);

        System.out.println("[Server] Closing connection..");
        Thread.sleep(2000);

        dos.close();
        dis.close();
        soc.close();
        ss.close();
    }

    public static int fact(int n) {
        if(n<=1) return 1;
        return n*fact(n-1);
    }
}
