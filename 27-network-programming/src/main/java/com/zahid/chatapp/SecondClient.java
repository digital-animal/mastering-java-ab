package com.zahid.chatapp;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SecondClient {
    public static void main(String[] args)  throws Exception {
        System.out.println("[Person 2]");

        ServerSocket ss = new ServerSocket(4800);
        Socket soc = ss.accept();

        DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
        DataInputStream dis = new DataInputStream(soc.getInputStream());
        Scanner sc = new Scanner(System.in);

        String incomingText = "";
        String outgoingText = "";
        
        while(!incomingText.equalsIgnoreCase("end")) {

            incomingText = dis.readUTF();
            System.out.print("[Person 1] "+incomingText);
            System.out.println();

            Thread.sleep(1000);

            System.out.print("[Me] ");
            outgoingText = sc.nextLine();
            dos.writeUTF(outgoingText);
            dos.flush();
        }

        sc.close();
        dis.close();
        dos.close();
        soc.close();
        ss.close();
        Thread.sleep(1000);
        System.out.println("[Person 2] Chat ended");
    }
}
