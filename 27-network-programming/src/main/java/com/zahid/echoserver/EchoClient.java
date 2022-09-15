package com.zahid.echoserver;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.lang.Thread;

public class EchoClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("[Client] starting..");
        Thread.sleep(1000);
        Socket soc = new Socket("localhost", 4999);
        System.out.println("[Client] Connection eastablished.");   
        Thread.sleep(1000);
        
        // keyboard input     
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        String line = sc.nextLine();
        
        System.out.println("[Client] Sending..");
        Thread.sleep(1000);

        // clinet sending line to server which server will refect
        DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
        dos.writeUTF(line);

        // now cient will receive back what it sent
        System.out.println("[Client] Receiving data back from server..");
        Thread.sleep(1000);
        
        DataInputStream dis = new DataInputStream(soc.getInputStream());
        String str = dis.readUTF();
        System.out.println("[Client] Received: "+str);
        Thread.sleep(1000);
        
        dis.close();
        dos.close();
        sc.close();
        soc.close();
        System.out.println("[Client] Connection closed");
        
    }
}