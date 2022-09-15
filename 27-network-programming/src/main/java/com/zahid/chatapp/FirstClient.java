package com.zahid.chatapp;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FirstClient {
    public static void main(String[] args) throws Exception {
        System.out.println("[Person 1]");
        Socket soc = new Socket("127.0.0.1", 4800);

        DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
        DataInputStream dis = new DataInputStream(soc.getInputStream());
        Scanner sc = new Scanner(System.in);

        String incomingMessage = "";
        String outgoingMessage = "";

        while(!incomingMessage.equalsIgnoreCase("end")) {
            System.out.print("[Me] ");
            outgoingMessage = sc.nextLine();
            dos.writeUTF(outgoingMessage);
            dos.flush();

            Thread.sleep(1000);

            incomingMessage = dis.readUTF();
            System.out.print("[Person 2] "+incomingMessage);
            System.out.println();
        }

        sc.close();
        dis.close();
        dos.close();
        soc.close();
        Thread.sleep(1000);
        System.out.println("[Person 1] Chat ended");

    }
}
